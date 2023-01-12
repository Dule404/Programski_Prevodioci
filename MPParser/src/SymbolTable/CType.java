package SymbolTable;

public class CType extends SymbolNode {
	public static final int INTEGER = 0;
	public static final int CHARACTER = 1;
	public static final int FLOAT = 2;
	public static final int BOOLEAN = 3;
	public static final int LE = 4;
	public static final int GE = 5;
	public static final int EQ = 6;
	public static final int UNKNOWN = 7;
	public int tkind;
	
	public CType ( String name, 
			int typeKind, 
			SymbolNode next)
	{
		super( name, SymbolNode.TYPE, null, next );
		this.tkind = typeKind;
		this.type = this;
	}
}
