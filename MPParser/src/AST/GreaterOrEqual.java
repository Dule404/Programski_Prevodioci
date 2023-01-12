package AST;

public class GreaterOrEqual extends BinaryExpression {
	
	public GreaterOrEqual( CExpression left, CExpression right )
	{
		super( left, right );
	}
	
	protected String opCode()
	{
		return "GE";
	}
}
