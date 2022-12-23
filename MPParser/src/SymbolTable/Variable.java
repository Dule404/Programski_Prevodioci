package SymbolTable;

public class Variable extends SymbolNode {
	
	public int last_def;
	public int last_use;
	
	public Variable( String name, CType type, int area, SymbolNode next )
	{
		super(name, SymbolNode.VARIABLE, type, area, next);
		last_def = -1;
		last_use = -1;
	} 
}
