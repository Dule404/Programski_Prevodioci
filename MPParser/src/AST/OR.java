package AST;

public class OR extends BinaryExpression {

	public OR( CExpression left, CExpression right )
	{
		super( left, right );
	}
	
	protected String opCode()
	{
		return "OR";
	}
}
