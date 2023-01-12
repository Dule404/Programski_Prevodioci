package AST;

import java.io.*;

public class IfStatement extends CStatement{
	private CStatement thenStatement;
	private CStatement elseStatement;
	private CExpression condition;
	
	public IfStatement(CExpression e, CStatement thenS, 
			CStatement elseS )
	{
		condition = e;
		thenStatement = thenS;
		elseStatement = elseS;
	}
	
	public void translate( BufferedWriter out )
	throws IOException
	{
		condition.translate( out );
		condition.genLoad( "R1", out );
		String elseLabel = ASTNode.genLab();
		String endLabel = ASTNode.genLab();
		out.write( "\tJumpIfZero\tR1, " + elseLabel );
		out.newLine();
		thenStatement.translate( out );
		out.write( "\tJump\t" + endLabel );
		out.newLine();
		out.write( elseLabel + ":" );
		out.newLine();
		elseStatement.translate( out );
		out.write( endLabel + ":" );
		out.newLine();
	}
}


