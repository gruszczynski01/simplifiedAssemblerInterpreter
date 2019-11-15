import data_set.Stack;
import grammar.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String expression = "push 342*2";


        CharStream charStream = CharStreams.fromString(expression);
        simplifiedAssemblerLexer lexer = new simplifiedAssemblerLexer(charStream);
        simplifiedAssemblerParser parser = new simplifiedAssemblerParser(new CommonTokenStream(lexer));

        ParseTree tree = parser.parser_rule();

        mainVisitor mainVisitor = new mainVisitor();

        mainVisitor.visit(tree);

        Stack.pushToStack(1);
        Stack.pushToStack(2);
        Stack.pushToStack(3);
        Stack.pushToStack(4);

        Stack.popFromStack();
        Stack.popFromStack();
        Stack.popFromStack();
        Stack.popFromStack();
        Stack.popFromStack();
    }
}
