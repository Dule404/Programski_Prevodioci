package AST;

public class AND extends BinaryExpression {

	public AND( CExpression left, CExpression right )
	{
		super( left, right );
	}
	
	protected String opCode()
	{
		return "AND";
	}

}
