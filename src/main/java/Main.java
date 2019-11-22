import data_set.RegistersSet;

import grammar.*;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        new RegistersSet();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()) {
            try {
                String tmp = scanner.nextLine();
                if (tmp.trim().isEmpty()) {
                    continue;
                }
                CharStream charStream = CharStreams.fromString(tmp + '\n');
                simplifiedAssemblerLexer lexer = new simplifiedAssemblerLexer(charStream);
                simplifiedAssemblerParser parser = new simplifiedAssemblerParser(new CommonTokenStream(lexer));

                lexer.removeErrorListeners();
                parser.removeErrorListeners();
                lexer.addErrorListener(new simplifiedAssemblerErrorListener());
                parser.addErrorListener(new simplifiedAssemblerErrorListener());

                ParseTree tree = parser.parser_rule();

                MainVisitor mainVisitor = new MainVisitor();

                mainVisitor.visit(tree);

            } catch (RuntimeException ex) {
                System.out.println(ex.getMessage());
            }

        }
    }
}
