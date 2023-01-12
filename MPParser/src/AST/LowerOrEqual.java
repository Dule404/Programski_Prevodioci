package AST;

public class LowerOrEqual extends BinaryExpression {
	
	public LowerOrEqual( CExpression left, CExpression right )
	{
		super( left, right );
	}
	
	protected String opCode()
	{
		return "LE";
	}
}
