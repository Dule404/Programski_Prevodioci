package SymbolTable;

public class SymbolNode {
	
	public static int TYPE = 0;
	public static int VARIABLE = 1;
	public String name;
	public int kind;
	public CType type;
	public int area;
	public SymbolNode next;
	
	public SymbolNode( String symbolName, int symbolKind, CType symbolType, int symbolArea, SymbolNode nextSymbol )
	 {
		 name = symbolName;
		 kind = symbolKind;
		 type = symbolType;
		 area = symbolArea;
		 next = nextSymbol;
	 } 
}
