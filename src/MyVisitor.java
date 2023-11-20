import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class MyVisitor extends LinguagemBaseVisitor<Object> {
    public Map<String, Object> symbolTable = new HashMap<>();
    private List<Object> output = new ArrayList<>();
    private List<String> tacCode = new ArrayList<>();

    private int tempCount = 1;
    private int labelCount = 1;
    @Override
    public Object visitProgram(LinguagemParser.ProgramContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitVar_decl(LinguagemParser.Var_declContext ctx) {
        String variableName = ctx.ID().getText();
        symbolTable.put(variableName,  "t" + tempCount++);
        return null;
    }

    @Override
    public Object visitVar_assign(LinguagemParser.Var_assignContext ctx) {
        String variableName = ctx.ID().getText();
        Object value = visit(ctx.expression());
        symbolTable.put(variableName, value);
        tacCode.add(symbolTable.get(variableName) + " = " + value);
        return null;
    }

    @Override
    public Object visitPrintln(LinguagemParser.PrintlnContext ctx) {
        Object value = visit(ctx.expression());
        output.add(value);
        tacCode.add("print " + value);
        return null;
    }

    @Override
    public Object visitConditional(LinguagemParser.ConditionalContext ctx) {
        boolean condition = (boolean) visit(ctx.expression());
        String elseLabel = "L" + labelCount++;
        String endLabel = "L" + labelCount++;
        tacCode.add("if " + condition + " goto " + elseLabel);
        if (condition) {
            visit(ctx.sentence(0));
            tacCode.add("goto " + endLabel);
        } else {
            visit(ctx.sentence(1));
            tacCode.add(elseLabel + ":");
        }
        tacCode.add(endLabel + ":");
        return null;
    }


    @Override
    public Object visitWhile_loop(LinguagemParser.While_loopContext ctx) {
        String startLabel = "L" + labelCount++;
        String endLabel = "L" + labelCount++;

        tacCode.add(startLabel + ":");
        String condition = (String) visit(ctx.expression());
        tacCode.add("if " + condition + " goto " + endLabel);
        tacCode.add("goto " + startLabel);
        tacCode.add(endLabel + ":");
        return visitWhile_loop(ctx);
    }


    @Override
    public Object visitExpression(LinguagemParser.ExpressionContext ctx) {
        Object value = visit(ctx.comparison(0));
        for (int i = 1; i < ctx.comparison().size(); i++) {
            String operator = ctx.OR(i - 1).getText();
            Object rightValue = visit(ctx.comparison(i));
            if (operator.equals("||")) {
                value = (boolean) value || (boolean) rightValue;
            }
        }
        return value;
    }

    @Override
    public Object visitComparison(LinguagemParser.ComparisonContext ctx) {
        Object value = visit(ctx.additive(0));
        for (int i = 1; i < ctx.additive().size(); i++) {
            String operator = ctx.getChild(i * 2 - 1).getText();
            Object rightValue = visit(ctx.additive(i));
            switch (operator) {
                case ">":
                    value = (int) value > (int) rightValue;
                    break;
                case "<":
                    value = (int) value < (int) rightValue;
                    break;
                case ">=":
                    value = (int) value >= (int) rightValue;
                    break;
                case "<=":
                    value = (int) value <= (int) rightValue;
                    break;
                case "==":
                    value = value.equals(rightValue);
                    break;
                case "!=":
                    value = !value.equals(rightValue);
                    break;
            }
        }
        return value;
    }

    @Override
    public Object visitAdditive(LinguagemParser.AdditiveContext ctx) {
        Object value = visit(ctx.multiplicative(0));
        for (int i = 1; i < ctx.multiplicative().size(); i++) {
            String operator = ctx.getChild(i * 2 - 1).getText();
            Object rightValue = visit(ctx.multiplicative(i));
            switch (operator) {
                case "+":
                    value = (int) value + (int) rightValue;
                    break;
                case "-":
                    value = (int) value - (int) rightValue;
                    break;
            }
        }
        return value;
    }

    @Override
    public Object visitMultiplicative(LinguagemParser.MultiplicativeContext ctx) {
        Object value = visit(ctx.factor(0));
        for (int i = 1; i < ctx.factor().size(); i++) {
            String operator = ctx.getChild(i * 2 - 1).getText();
            Object rightValue = visit(ctx.factor(i));
            switch (operator) {
                case "*":
                    value = (int) value * (int) rightValue;
                    break;
                case "/":
                    value = (int) value / (int) rightValue;
                    break;
            }
        }
        return value;
    }

    @Override
    public Object visitFactor(LinguagemParser.FactorContext ctx) {
        if (ctx.NUMBER() != null) {
            return Integer.parseInt(ctx.NUMBER().getText());
        } else if (ctx.ID() != null) {
            String variableName = ctx.ID().getText();
            return symbolTable.get(variableName);
        } else if (ctx.BOOLEAN() != null) {
            return Boolean.parseBoolean(ctx.BOOLEAN().getText());
        } else {
            return visit(ctx.expression());
        }
    }
    public List<Object> getOutput() {
        return output;
    }

    public List<String> getTacCode() {
        return tacCode;
    }
}
