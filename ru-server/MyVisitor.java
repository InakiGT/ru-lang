import java.util.HashMap;
import java.util.Map;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MyVisitor extends RuBaseVisitor<Object> {
    private final Map<String, Object> memory = new HashMap<>();
    private final Map<String, Object> functions = new HashMap<>();
    private final StringBuilder output = new StringBuilder();

    @Override public Object visitPrograma(RuParser.ProgramaContext ctx) { return visit(ctx.bloque()); }

    @Override public Object visitBloque(RuParser.BloqueContext ctx) {
        Object result = null;
        for (RuParser.SentenciaContext sentencia : ctx.sentencia()) {
            result = visit(sentencia);
        }
        return output.toString();
    }

    @Override public Object visitSentencia(RuParser.SentenciaContext ctx) { return visitChildren(ctx); }

    @Override public Object visitSentencia_if(RuParser.Sentencia_ifContext ctx) {
        for (RuParser.Bloque_condicionalContext condCtx : ctx.bloque_condicional()) {
            Object cond = visit(condCtx.expr());

            if (cond instanceof Boolean && (Boolean) cond) {
                visit(condCtx.bloque_de_sentencia());
                return null;
            }
        }

        if (ctx.bloque_de_sentencia() != null) {
            visit(ctx.bloque_de_sentencia());
        }

        return null;
    }

    @Override public Object visitSentencia_while(RuParser.Sentencia_whileContext ctx) {
        while (true) {
            Object cond = visit(ctx.expr());
            if (!isTrue(cond)) {
                break;
            }

            visit(ctx.bloque_de_sentencia());
        }

        return null;
    }

    @Override public Object visitSentencia_for(RuParser.Sentencia_forContext ctx) {
        visit(ctx.asignacion(0));

        while (true) {
            Object cond = visit(ctx.expr());
            if (!isTrue(cond)) {
                break;
            }

            visit(ctx.bloque_de_sentencia());
            visit(ctx.asignacion(1));
        }

        return null;
    }

    @Override public Object visitSentencia_funcion(RuParser.Sentencia_funcionContext ctx) {
        String funcName = ctx.ID(0).getText();
        java.util.List<String> paramNames = new java.util.ArrayList<>();
        java.util.List<String> paramTypes = new java.util.ArrayList<>();
        int paramCount = ctx.ID().size() - 1; // El primer ID es el nombre de la función
        int tipoCount = ctx.TIPO().size();
        if (paramCount > 0) {
            for (int i = 1; i <= paramCount; i++) {
                paramNames.add(ctx.ID(i).getText());
                paramTypes.add(ctx.TIPO(i - 1).getText());
            }
        }
        String returnType = ctx.TIPO(tipoCount - 1).getText();
        java.util.Map<String, Object> def = new java.util.HashMap<>();
        def.put("params", paramNames);
        def.put("types", paramTypes);
        def.put("returnType", returnType);
        def.put("bloque", ctx.bloque_de_sentencia_func());
        functions.put(funcName, def);
        return null;
    }

    @Override public Object visitLlamada_funcion(RuParser.Llamada_funcionContext ctx) {
        String funcName = ctx.ID().getText();
        if (!functions.containsKey(funcName)) {
            throw new RuntimeException("Función no definida: " + funcName);
        }
        @SuppressWarnings("unchecked")
        java.util.Map<String, Object> def = (java.util.Map<String, Object>) functions.get(funcName);
        java.util.List<String> paramNames = (java.util.List<String>) def.get("params");
        java.util.List<Object> argVals = new java.util.ArrayList<>();
        for (int i = 0; i < ctx.expr().size(); i++) {
            argVals.add(visit(ctx.expr(i)));
        }
        Map<String, Object> oldMemory = new HashMap<>(memory);
        for (int i = 0; i < paramNames.size(); i++) {
            memory.put(paramNames.get(i), argVals.get(i));
        }
        // Buscar return en el bloque de la función
        RuParser.Bloque_funcContext bloqueFunc = ((RuParser.Bloque_de_sentencia_funcContext) def.get("bloque")).bloque_func();
        Object result = null;
        
        // Ejecutar todas las sentencias primero
        for (RuParser.SentenciaContext sentencia : bloqueFunc.sentencia()) {
            visit(sentencia);
        }
        
        // Si hay una expresión de return, evaluarla
        if (bloqueFunc.expr() != null) {
            result = visit(bloqueFunc.expr());
        }
        memory.clear();
        memory.putAll(oldMemory);
        return result;
    }

    @Override public Object visitLlamadaFuncionExpr(RuParser.LlamadaFuncionExprContext ctx) { return visit(ctx.llamada_funcion()); }

    private boolean isTrue(Object cond) {
        if (cond instanceof Boolean) return (Boolean) cond;
        if (cond instanceof Integer) return (Integer) cond != 0;
        if (cond instanceof Double) return (Double) cond != 0.0;
        throw new RuntimeException("Error: la condición del while debe ser booleana o numérica. Se recibió: " + cond);
    }

    @Override public Object visitAsignacion(RuParser.AsignacionContext ctx) {
        String id = ctx.ID().getText();

        // if ( !memory.containsKey(id) ) {
        //     System.err.println(("Error: la variable " + id + " no está declarada"));
        //     System.exit(1);
        // }

        Object val = visit(ctx.expr());
        memory.put(id, val);
        return null;
    }

    @Override public Object visitImprimir(RuParser.ImprimirContext ctx) { 
        Object val = visit(ctx.expr());
        String str = val == null ? "null" : val.toString();
        output.append(str).append("\n");
        return null;
    }

    @Override public Object visitMenosUnarioExpr(RuParser.MenosUnarioExprContext ctx) {
        Object value = visit(ctx.expr());

        if ( value instanceof Integer ) {
            return -((Integer) value);
        } else {
            return -((Double) value);
        }
    }

    @Override public Object visitNotExpr(RuParser.NotExprContext ctx) {
        Boolean value = (Boolean) visit(ctx.expr());

        return !value;
    }

    @Override public Object visitMultiplicacionExpr(RuParser.MultiplicacionExprContext ctx) { 
        String op = ctx.op.getText();
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));

        if (left instanceof Double || right instanceof Double) {
            double l = ((Number) left).doubleValue();
            double r = ((Number) right).doubleValue();

            return switch (op) {
                case "*" -> l * r;
                case "/" -> l / r;
                case "%" -> l % r;
                default -> throw new RuntimeException("Operador desconocido: " + op);
            };
        } else {
            int l = ((Number) left).intValue();
            int r = ((Number) right).intValue();

            return switch (op) {
                case "*" -> l * r;
                case "/" -> l / r;
                case "%" -> l % r;
                default -> throw new RuntimeException("Operador desconocido: " + op);
            };
        }
    }

    @Override public Object visitAtomExpr(RuParser.AtomExprContext ctx) { return visit(ctx.atomo()); }

    @Override public Object visitOrExpr(RuParser.OrExprContext ctx) {
        Boolean left = (Boolean) visit(ctx.expr(0));
        Boolean right = (Boolean) visit(ctx.expr(1));

        return left || right;
    }

    @Override public Object visitLogExpr(RuParser.LogExprContext ctx) {
        Object val = visit(ctx.expr());

        if ( val instanceof Double ) {
            return Math.log((Double) val);
        } else if ( val instanceof Integer ) {
            return Math.log((Integer) val);
        }

        return null;
    }

    @Override   public Object visitPowExpr(RuParser.PowExprContext ctx) {
        Object base = visit(ctx.expr(0));
        Object exponente = visit(ctx.expr(1));

        if ((base instanceof Integer || base instanceof Double) &&
            (exponente instanceof Integer || exponente instanceof Double)) {

            double baseVal = ((Number) base).doubleValue();
            double expVal = ((Number) exponente).doubleValue();

            return Math.pow(baseVal, expVal);
        }

        throw new RuntimeException("Error: operador '^' solo se puede aplicar a números.");
    }


    @Override public Object visitIgualdadExpr(RuParser.IgualdadExprContext ctx) {
        String op = ctx.op.getText();
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));

        if (op.equals("==")) {
            return left == null ? right == null : left.equals(right);
        } else if (op.equals("!=")) {
            return left == null ? right != null : !left.equals(right);
        }

        return null;
    }

    @Override
    public Object visitRelacionalExpr(RuParser.RelacionalExprContext ctx) {
        String op = ctx.op.getText();
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));

        if (left instanceof Number && right instanceof Number) {
            double l = ((Number) left).doubleValue();
            double r = ((Number) right).doubleValue();
            return switch (op) {
                case ">" -> l > r;
                case "<" -> l < r;
                case ">=" -> l >= r;
                case "<=" -> l <= r;
                default -> throw new RuntimeException("Operador relacional desconocido: " + op);
            };
        }

        if (left instanceof String && right instanceof String) {
            int cmp = ((String) left).compareTo((String) right);
            return switch (op) {
                case ">" -> cmp > 0;
                case "<" -> cmp < 0;
                case ">=" -> cmp >= 0;
                case "<=" -> cmp <= 0;
                default -> throw new RuntimeException("Operador relacional desconocido: " + op);
            };
        }

        if (left instanceof Boolean && right instanceof Boolean) {
            boolean l = (Boolean) left;
            boolean r = (Boolean) right;
            int li = l ? 1 : 0;
            int ri = r ? 1 : 0;
            return switch (op) {
                case ">" -> li > ri;
                case "<" -> li < ri;
                case ">=" -> li >= ri;
                case "<=" -> li <= ri;
                default -> throw new RuntimeException("Operador relacional desconocido: " + op);
            };
        }

        throw new RuntimeException("No se pueden comparar tipos incompatibles: "
            + left.getClass().getSimpleName() + " y " + right.getClass().getSimpleName());
    }

    @Override public Object visitAditivaExpr(RuParser.AditivaExprContext ctx) {
        String op = ctx.op.getText();
        Object left = visit(ctx.expr(0));
        Object right = visit(ctx.expr(1));

        if (left instanceof Double || right instanceof Double) {
            double l = ((Number) left).doubleValue();
            double r = ((Number) right).doubleValue();

            return switch (op) {
                case "+" -> l + r;
                case "-" -> l - r;
                default -> throw new RuntimeException("Operador desconocido: " + op);
            };
        } else {
            int l = ((Number) left).intValue();
            int r = ((Number) right).intValue();

            return switch (op) {
                case "+" -> l + r;
                case "-" -> l - r;
                default -> throw new RuntimeException("Operador desconocido: " + op);
            };
        }
    }

    @Override public Object visitAndExpr(RuParser.AndExprContext ctx) { 
        Boolean left = (Boolean) visit(ctx.expr(0));
        Boolean right = (Boolean) visit(ctx.expr(1));

        return left && right;
    }

    @Override public Object visitParExpr(RuParser.ParExprContext ctx) { return visit(ctx.expr()); }

    @Override public Object visitNumberAtom(RuParser.NumberAtomContext ctx) {
        if ( ctx.FLOAT() != null ){
            return Double.parseDouble(ctx.FLOAT().getText());
        } else {
            return Integer.parseInt(ctx.INT().getText());
        }
    }

    @Override public Object visitBooleanAtom(RuParser.BooleanAtomContext ctx) {
        return ctx.TRUE() != null;
    }

    @Override public Object visitIdAtom(RuParser.IdAtomContext ctx) { 
        String id = ctx.ID().getText();

        if (!memory.containsKey(id)) {
            throw new RuntimeException("Error: la variable " + id + " no está declarada");
        }

        return memory.get(id);
    }

    @Override public Object visitStringAtom(RuParser.StringAtomContext ctx) {
        return ctx.STRING().getText();
    }

    @Override public Object visitNilAtom(RuParser.NilAtomContext ctx) { return null; }
}

