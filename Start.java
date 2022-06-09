import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Start {

    public static void main(String[] args) throws Exception {
        // create input stream
        CharStream input = CharStreams.fromFileName(args[0]);
        // create lexer
        HelloWorldLexer lexer = new HelloWorldLexer(input);
        // create token stream
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        // create parser
        HelloWorldParser parser = new HelloWorldParser(tokens);
        parser.setBuildParseTree(true);
        // build parse tree
        ParseTree tree = parser.sum();
        // output parse tree
        System.out.println(tree.toStringTree(parser));
        // build tree walker
        ParseTreeWalker walker = new ParseTreeWalker();
        // visit tree
        // walker.walk(new HelloWorldPrintListener(), tree);

    }
}