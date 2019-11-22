import data_set.RegistersSet;
import data_set.Stack;
import excepions.EmptyStackException;
import excepions.UnknownValueException;
import grammar.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MainVisitor implements simplifiedAssemblerVisitor{
    public Object visitParser_rule(simplifiedAssemblerParser.Parser_ruleContext ctx) {
        if (ctx.INT_RULE() != null) {
            try {
                Stack.popFromStack();
            } catch (EmptyStackException e) {
                System.out.println(e.getMessage());
            }
        }
        if (ctx.push_rule() != null)
            return this.visitPush_rule(ctx.push_rule());
        if (ctx.mov_rule() != null)
            return this.visitMov_rule(ctx.mov_rule());
        if (ctx.xor_rule() != null)
            return this.visitXor_rule(ctx.xor_rule());
        return null;
    }

    public Object visitPush_rule(simplifiedAssemblerParser.Push_ruleContext ctx) {
        if (ctx.PUSH() != null && ctx.exp() != null) {
            try {
                Stack.pushToStack(this.visitExp(ctx.exp()).toString());
            } catch (UnknownValueException e) {
                Stack.pushToStack(e.getMessage());
            }

            return null;
        }
        return null;
    }

    public Object visitMov_rule(simplifiedAssemblerParser.Mov_ruleContext ctx) {
        if (ctx.MOV() != null && ctx.exp() != null && ctx.REGISTER() != null) {
           try {
               RegistersSet.getREGISTERS().get(ctx.REGISTER().getText().toLowerCase()).setValue((this.visitExp(ctx.exp()).toString()));
           } catch (UnknownValueException ex) {
               RegistersSet.getREGISTERS().get(ctx.REGISTER().getText().toLowerCase()).setValue(ex.getMessage());

           }
        }
        return null;
    }

    public Object visitXor_rule(simplifiedAssemblerParser.Xor_ruleContext ctx) {
        if (ctx.XOR() != null) {
            try {
                Integer result = (Integer)this.visitExp(ctx.exp()) ^ Integer.parseInt(RegistersSet.getREGISTERS().get(ctx.REGISTER().getText().toLowerCase()).getValue());
                RegistersSet.getREGISTERS().get(ctx.REGISTER().getText()).setValue(result.toString());
            } catch (UnknownValueException e) {
                if (ctx.REGISTER().getText().equals(ctx.exp().getText())) {
                    RegistersSet.getREGISTERS().get(ctx.REGISTER().getText()).setValue("0");
                } else {
                    RegistersSet.getREGISTERS().get(ctx.REGISTER().getText()).setValue(e.getMessage());
                }

            }
        }
        return null;
    }

    public Object visitExp(simplifiedAssemblerParser.ExpContext ctx) throws UnknownValueException{
        if (ctx.PLUS() != null && ctx.exp() != null && ctx.term() != null) {
            return (Integer) this.visitExp(ctx.exp()) + (Integer) this.visitTerm(ctx.term());
        } else if (ctx.MINUS() != null && ctx.exp() != null && ctx.term() != null) {
            return (Integer) this.visitExp(ctx.exp()) - (Integer) this.visitTerm(ctx.term());
        } else if (ctx.term() != null){
            return (Integer) this.visitTerm(ctx.term());
        }
        return null;
    }

    public Object visitTerm(simplifiedAssemblerParser.TermContext ctx) throws UnknownValueException{
        if (ctx.MULTIPY() != null) {
            return (Integer) this.visitTerm(ctx.term()) * (Integer) this.visitFactor(ctx.factor());
        } else if (ctx.factor() != null) {
            return this.visitFactor(ctx.factor());
        }
        return null;
    }

    public Object visitFactor(simplifiedAssemblerParser.FactorContext ctx) throws UnknownValueException {
        if (ctx.value() != null) {
            return this.visitValue(ctx.value());
        } else if(ctx.exp() != null ){
            return  (Integer) this.visitExp(ctx.exp());
        }
        return null;
    }

    public Object visitValue(simplifiedAssemblerParser.ValueContext ctx) throws UnknownValueException{
        if(ctx.DIGIT() != null) {
            return Integer.parseInt(ctx.DIGIT().getText());
        } else if (ctx.REGISTER() != null){
            return Integer.parseInt(RegistersSet.getREGISTERS().get(ctx.REGISTER().getText().toLowerCase()).getValue());
        }
        return null;
    }




    public Object visit(ParseTree parseTree) {
        parseTree.accept(this);
        return null;
    }

    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}

