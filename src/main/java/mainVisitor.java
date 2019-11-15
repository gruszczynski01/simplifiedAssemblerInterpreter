import grammar.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class mainVisitor implements simplifiedAssemblerVisitor{
    public Object visitParser_rule(simplifiedAssemblerParser.Parser_ruleContext ctx) {
        if (ctx.INT_RULE() != null)
            System.out.println("wypisz i zdejmij ze stosu");
        if (ctx.push_rule() != null)
            return this.visitPush_rule(ctx.push_rule());
        return null;
    }

    public Object visitPush_rule(simplifiedAssemblerParser.Push_ruleContext ctx) {
        System.out.println("dupa");
        if (ctx.PUSH() != null) {
            return this.visitExp(ctx.exp());
        }
        return null;
    }

    public Object visitMov_rule(simplifiedAssemblerParser.Mov_ruleContext ctx) {
        System.out.println("MOV");
        return null;
    }

    public Object visitXor_rule(simplifiedAssemblerParser.Xor_ruleContext ctx) {
        return null;
    }

    public Object visitExp(simplifiedAssemblerParser.ExpContext ctx) {
        if (ctx.PLUS() != null) {
            System.out.println(ctx.exp().getText());
            System.out.println(ctx.term().getText());
        } else if (ctx.MINUS() != null) {
            System.out.println(ctx.exp().getText());
            System.out.println(ctx.term().getText());
        } else {
            System.out.println(ctx.term().getText());
            return this.visitTerm(ctx.term());
        }
        return null;
    }

    public Object visitTerm(simplifiedAssemblerParser.TermContext ctx) {
        if (ctx.MULTIPY() != null) {
            System.out.println("sdas");
            System.out.println(ctx.term().getText());
            System.out.println(ctx.factor().getText());
        }
        return null;
    }

    public Object visitFactor(simplifiedAssemblerParser.FactorContext ctx) {
        return null;
    }

    public Object visitValue(simplifiedAssemblerParser.ValueContext ctx) {

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

