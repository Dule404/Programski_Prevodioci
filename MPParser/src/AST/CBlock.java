package AST;

import java.io.*;
import java.util.ArrayList;

public class CBlock extends CStatement {
	private ArrayList statements = new ArrayList();
	
	public void addStatement( CStatement newStatement )
	{
		statements.add( newStatement );
	}
	
	public void translate( BufferedWriter out )
	throws IOException
	{
		for ( int i=0; i<statements.size(); i++ )
		{
			CStatement current = 
				(CStatement) statements.get(i);
			current.translate( out );
		}
	}
}


