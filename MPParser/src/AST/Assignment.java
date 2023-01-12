package AST;

import java.io.BufferedWriter;
import java.io.IOException;

import SymbolTable.Variable;

public class Assignment extends CStatement {
	private Variable left;
	private CExpression right;
	
	public Assignment( Variable var, CExpression e )
	{
		left = var;
		right = e;
	}
	
	public void translate( BufferedWriter out )
	throws IOException 
	{
		right.translate( out );
		right.genLoad( "R1", out );
		out.write( "\tStore\t\tR1, " + left.name );
		out.newLine();
	}
}
