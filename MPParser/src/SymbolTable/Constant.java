package SymbolTable;

public class Constant {
	
	public CType type;
	public Object value;
	
	public Constant( CType constType, Object constValue )
	{
		type = constType;
		value = constValue;
	} 

}
