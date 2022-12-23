package SymbolTable;

public class CType extends SymbolNode {

	public static int INTEGER = 0;
	public static int CHARACTER = 1;
	public static int FLOAT = 2;
	public static int BOOL = 3;
	public static int UNKNOWN = 4;
	public int tkind;
	
	public CType ( String name, int typeKind, SymbolNode next)
	{
		super( name, SymbolNode.TYPE, null, 0, next );
		this.tkind = typeKind;
		this.type = this;
	}
	
}
