package SymbolTable;

public class SymbolTable {
	
	/*tabela simbola za "language scope"
	u ovom slucaju tu pripadaju samo tipovi*/
	private SymbolNode types;
	
	/* tabela simbola za oblast vazenja programa */
	private SymbolNode variables;
	
	public SymbolTable()
	{
		types = new CType("unknown", CType.UNKNOWN, null);
		types = new CType( "char", CType.CHARACTER, types);
		types = new CType( "integer", CType.INTEGER, types );
		types = new CType( "char", CType.BOOL, types);
		types = new CType( "integer", CType.FLOAT, types );
		variables = null;
	}
	
	public boolean addVar( String name, CType type, int area )
	{
		Variable existing = this.getVar( name );
		if ( existing != null && existing.area == area )
			return false;
		variables = new Variable( name, type, area, variables );
		return true;
	}
	
	public Variable getVar( String name )
	{
		SymbolNode current = variables;
		while ( current != null && current.name.compareTo( name ) != 0 )
			current = current.next;
		return ( Variable ) current;
	}
	
	public CType getType(String typeName)
	{
		SymbolNode current = types;
		while ( current != null && current.name.compareTo( typeName ) !=0)
			current = current.next;
		return ( CType ) current;
	}
	
	public SymbolNode getVariables()
	{
		return variables;
	} 
}
