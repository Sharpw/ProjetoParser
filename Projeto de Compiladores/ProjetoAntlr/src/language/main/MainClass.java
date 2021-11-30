package language.main;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import language.exceptions.isiLexicoException;
import language.exceptions.isiSemanticException;
import language.parser.isiLexer;
import language.parser.isiParser;

// instancia o parser para o input.isi

public class MainClass {
	public static void main(String[] args) {
		try {
			isiLexer lexer;
			isiParser parser;
			
			// ler o arquivo input.isi para o analisador léxico
			lexer = new isiLexer(CharStreams.fromFileName("input.isi"));
			
			// tokens para passar para o Parser
			CommonTokenStream tokenStream = new CommonTokenStream(lexer);
			
			// criação do parser a partir do tokenStream
			parser = new isiParser(tokenStream);
			
			parser.program();
			
			System.out.println("Compilation Done. ");
			
		}
		catch(isiLexicoException ex) {
			System.err.println("ERRO LEXICO - "+ex.getMessage());
		}
		catch(isiSemanticException ex) {
			System.err.println("ERRO SEMANTICO - "+ex.getMessage());
		}
		catch(Exception ex) {
			System.err.println("ERROR - "+ex.getMessage());
		}
	}
}