package AST;

public class Equal extends BinaryExpression {

	public Equal( CExpression left, CExpression right )
	{
		super( left, right );
	}
	protected String opCode() {

		return "EQ";
	}

}
