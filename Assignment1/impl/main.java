import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException{

	// we expect exactly one argument: the name of the input file
	if (args.length!=1) {
	    System.err.println("\n");
	    System.err.println("Simple interpreter\n");
		System.err.println("Simple interpreter\n");
	    System.err.println("==================\n\n");
	    System.err.println("Please give as input argument a filename\n");
	    System.exit(-1);
	}
	String filename=args[0];

	// open the input file
	CharStream input = CharStreams.fromFileName(filename);
	    //new ANTLRFileStream (filename); // depricated
	
	// create a lexer/scanner
	implLexer lex = new implLexer(input);
	
	// get the stream of tokens from the scanner
	CommonTokenStream tokens = new CommonTokenStream(lex);
	
	// create a parser
	implParser parser = new implParser(tokens);
	
	// and parse anything from the grammar for "start"
	ParseTree parseTree = parser.start();

	// Construct an interpreter and run it on the parse tree
	//Interpreter interpreter = new Interpreter();
	Command p = (Command) new AstMaker().visit(parseTree);
	p.eval(new Environment());
    }
}

// We write an interpreter that implements interface
// "implVisitor<T>" that is automatically generated by ANTLR
// This is parameterized over a return type "<T>" which is in our case
// simply a Double.


class AstMaker extends AbstractParseTreeVisitor<AST> implements implVisitor<AST> {

    public AST visitStart(implParser.StartContext ctx){
	Command program=new NOP();
	for(implParser.CommandContext c:ctx.cs)
	    program=new Sequence(program,(Command)visit(c));
	return program;
    };

    public AST visitSingleCommand(implParser.SingleCommandContext ctx){
	return visit(ctx.c);
    }

    public AST visitMultipleCommands(implParser.MultipleCommandsContext ctx){
	Command program=new NOP();
	for(implParser.CommandContext c:ctx.cs)
	    program=new Sequence(program,(Command)visit(c));
	return program;
    }
    
    public AST visitAssignment(implParser.AssignmentContext ctx){
	String v=ctx.x.getText();
 	Expr e=(Expr)visit(ctx.e);
	return new Assignment(v,e);
    }
    
    public AST visitOutput(implParser.OutputContext ctx){
	Expr e=(Expr)visit(ctx.e);
	return new Output(e);
    }

    public AST visitWhileLoop(implParser.WhileLoopContext ctx){
	Condition c=(Condition)visit(ctx.c);
	Command body=(Command)visit(ctx.p);
	return new While(c,body);
    }
    
    public AST visitParenthesis(implParser.ParenthesisContext ctx){
	return visit(ctx.e);
    };
    
    public AST visitVariable(implParser.VariableContext ctx){
	return new Variable(ctx.x.getText());
    };
    
    public AST visitAddition(implParser.AdditionContext ctx){
	return new Addition((Expr) visit(ctx.e1), (Expr)visit(ctx.e2));
    };

    public AST visitMultiplication(implParser.MultiplicationContext ctx){
	return new Multiplication((Expr) visit(ctx.e1), (Expr)visit(ctx.e2));
    };

    public AST visitConstant(implParser.ConstantContext ctx){
	return new Constant(Double.parseDouble(ctx.c.getText())); 
    };

    public AST visitUnequal(implParser.UnequalContext ctx){
	Expr v1=(Expr)visit(ctx.e1);
	Expr v2=(Expr)visit(ctx.e2);
	return new Unequal(v1,v2);
    }
}

