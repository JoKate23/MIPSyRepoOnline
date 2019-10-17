
public class Parentheses 
{
	private static Char leftParen = "(";
	private static Char rightParen = ")";
	private ExpressionOps theExpressionOps;
	
	private void calcParen(String parenString)
	{
		for(int i = 0; i < parenString.length(); i++)
		{
			if (parenString.pos(i) == leftParen)
			{
				return this.theExpressionOps.calcOps();
			}
			else if (parenString.pos(i) == rightParen)
			{
				break;
			}
			else
			{
				return "no parentheses";
			}
		}
		//do
		//{
			//this.theExpressionOps.calcOps();
		//}
		//while(parenString.pos(i) == leftParen);


	}

}
