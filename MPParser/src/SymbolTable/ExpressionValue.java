package SymbolTable;

public class ExpressionValue {
	
	public CType type;
	public Object value;
	
	public ExpressionValue( CType type, Object value )
	{
		this.type = type;
		this.value = value;
	}
}
