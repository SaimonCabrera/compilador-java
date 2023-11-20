import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import java.io.IOException;
import java.util.List;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Main {
    public static void main (String[] args){
        try{
            String source = "test.txt";
            CharStream cs = fromFileName(source);
            LinguagemLexer lexer = new LinguagemLexer(cs);
            CommonTokenStream token = new CommonTokenStream(lexer);
            LinguagemParser parser = new LinguagemParser(token);
            ParseTree tree = parser.program();

            MyVisitor visitor = new MyVisitor();
            visitor.visit(tree);


            List<String> tacCode = visitor.getTacCode();
            for (String instruction : tacCode) {
                System.out.println(instruction);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
