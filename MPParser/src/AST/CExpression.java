package AST;

import java.io.*;

public abstract class CExpression extends ASTNode{
	
	protected String result;
	
	protected void genLoad( String reg,
			BufferedWriter out ) throws IOException
	{
		out.write( "\tLoad_Mem\t" + 
			reg + ", " + result );
		out.newLine();
	}
}

