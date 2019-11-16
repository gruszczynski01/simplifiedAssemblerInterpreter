import data_set.RegistersSet;
import data_set.Stack;
import excepions.WrongSyntaxException;
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
        new RegistersSet();
        String expression = "mov 4 -, %ecx";
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            try {
                String tmp = scanner.nextLine();
                CharStream charStream = CharStreams.fromString(tmp + '\n');
                simplifiedAssemblerLexer lexer = new simplifiedAssemblerLexer(charStream);
                simplifiedAssemblerParser parser = new simplifiedAssemblerParser(new CommonTokenStream(lexer));

                lexer.removeErrorListeners();
                parser.removeErrorListeners();
                lexer.addErrorListener(new simplifiedAssemblerErrorListener());
                parser.addErrorListener(new simplifiedAssemblerErrorListener());

                ParseTree tree = parser.parser_rule();

                mainVisitor mainVisitor = new mainVisitor();

                mainVisitor.visit(tree);
            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
            }

        }
//        Stack.pushToStack(1);
//        Stack.pushToStack(2);
//        Stack.pushToStack(3);
//        Stack.pushToStack(4);
//
//        Stack.popFromStack();
//        Stack.popFromStack();
//        Stack.popFromStack();
//        Stack.popFromStack();
//        Stack.popFromStack();
    }
}
