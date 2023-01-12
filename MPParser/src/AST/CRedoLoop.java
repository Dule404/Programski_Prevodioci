package AST;

import java.io.BufferedWriter;
import java.io.IOException;

public class CRedoLoop extends CStatement {
	private CStatement thenStatement;
	private CStatement elseStatement;
	private CExpression redoCondition;
	private CExpression loopCondition;
	
	public CRedoLoop(CExpression e, CExpression e2, CStatement thenS, 
			CStatement elseS )
	{
		loopCondition = e;
		redoCondition = e2;
		thenStatement = thenS;
		elseStatement = elseS;
	}

	public void translate(BufferedWriter out) throws IOException {
		String loopLabel = ASTNode.genLab();
		String notLoopLabel = ASTNode.genLab();
		String redoLabel = ASTNode.genLab();
		out.write( loopLabel + ":" );
		loopCondition.translate(out);
		loopCondition.genLoad( "R1", out );
		out.write("\tJumpIfZero\tR1, " + notLoopLabel);
		out.newLine();
		out.write( redoLabel + ":" );
		out.newLine();
		thenStatement.translate( out );
		redoCondition.translate(out);
		loopCondition.genLoad( "R2", out );
		out.write( "\tJumpIfNotZero\tR2, " + redoLabel );
		out.newLine();
		elseStatement.translate( out );
		out.write( "\tJump\t" + loopLabel );
		out.write( notLoopLabel + ":" );
		out.newLine();
	}

}
