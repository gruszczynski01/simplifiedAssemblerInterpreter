import data_set.RegistersSet;
import data_set.Stack;
import grammar.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class mainVisitor implements simplifiedAssemblerVisitor{
    public Object visitParser_rule(simplifiedAssemblerParser.Parser_ruleContext ctx) {
        if (ctx.INT_RULE() != null) {
            try {
                Stack.popFromStack();
            } catch (Exception e) {
                //            e.printStackTrace();
                System.out.println(e.getMessage());
            }
        }
        if (ctx.push_rule() != null)
            return this.visitPush_rule(ctx.push_rule());
        if (ctx.mov_rule() != null)
            return this.visitMov_rule(ctx.mov_rule());
        return null;
    }

    public Object visitPush_rule(simplifiedAssemblerParser.Push_ruleContext ctx) {
        if (ctx.PUSH() != null && ctx.exp() != null) {
            System.out.println("pushuje");
            try {
                System.out.println("eax: " + RegistersSet.getREGISTERS().get("%eax").getValue());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            Stack.pushToStack((Integer)this.visitExp(ctx.exp()));
            return null;
        }
        return null;
    }

    public Object visitMov_rule(simplifiedAssemblerParser.Mov_ruleContext ctx) {
        if (ctx.MOV() != null && ctx.exp() != null && ctx.REGISTER() != null) {
            RegistersSet.getREGISTERS().get(ctx.REGISTER().getText().toLowerCase()).setValue((this.visitExp(ctx.exp()).toString()));
            try {
                System.out.println("a" + RegistersSet.getREGISTERS().get("%eax").getValue());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            try {
                System.out.println("b" + RegistersSet.getREGISTERS().get("%ebx").getValue());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            try {
                System.out.println("c" + RegistersSet.getREGISTERS().get("%ecx").getValue());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            try {
                System.out.println("d" + RegistersSet.getREGISTERS().get("%edx").getValue());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return null;
    }

    public Object visitXor_rule(simplifiedAssemblerParser.Xor_ruleContext ctx) {
        return null;
    }

    public Object visitExp(simplifiedAssemblerParser.ExpContext ctx) {
        if (ctx.PLUS() != null && ctx.exp() != null && ctx.term() != null) {
            return (Integer) this.visitExp(ctx.exp()) + (Integer) this.visitTerm(ctx.term());
        } else if (ctx.MINUS() != null && ctx.exp() != null && ctx.term() != null) {
            return (Integer) this.visitExp(ctx.exp()) - (Integer) this.visitTerm(ctx.term());
        } else if (ctx.term() != null){
            return (Integer) this.visitTerm(ctx.term());
        }
        return null;
    }

    public Object visitTerm(simplifiedAssemblerParser.TermContext ctx) {
        if (ctx.MULTIPY() != null) {
            return (Integer) this.visitTerm(ctx.term()) * (Integer) this.visitFactor(ctx.factor());
        } else if (ctx.factor() != null) {
            return this.visitFactor(ctx.factor());
        }
        return null;
    }

    public Object visitFactor(simplifiedAssemblerParser.FactorContext ctx) {
        if (ctx.value() != null) {
            return this.visitValue(ctx.value());
        } else if(ctx.exp() != null ){
            System.out.println("moze dopisac do tego ifa sprawdzenie czy na bank sa nawiasy czy cos");
            return  (Integer) this.visitExp(ctx.exp());
        }
        return null;
    }

    public Object visitValue(simplifiedAssemblerParser.ValueContext ctx) {
        if(ctx.DIGIT() != null) {
            return Integer.parseInt(ctx.DIGIT().getText());
        } else if (ctx.REGISTER() != null){
            try {
                return Integer.parseInt(RegistersSet.getREGISTERS().get(ctx.REGISTER().getText().toLowerCase()).getValue());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }


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

