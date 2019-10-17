import java.util.StringTokenizer;

public class ExpressionOps 
{
	private Queue inQueue;
	private Queue outQueue;
	private Stack opsStack;
	private String opsString;
	private Parentheses theParentheses;
	
	public ExpressionOps(String opsString)
	{
		this.opsString = opsString;
		this.inQueue = new Queue();
		this.outQueue = new Queue();
		this.opsStack = new Stack();

	}
	
	private void inQueue(String opsString)
	{
		StringTokenizer t = new StringTokenizer(opstString,"()*/-+", true);
		String tempString;
		String operands = "()*/-+";
		
		while(t.hasMoreElements())
		{
			tempString = t.nextToken().trim();
			
			if(operands.indexOf(tempString.pos[0]) == -1)
			{
				this.inQueue.parseInt(tempString);
			}
			else
			{
				this.inQueue.tempString(pos[0]);
			}

		}
		

	}
	
	//private void calcParen()
	//{
		
	//}
	
	private int calcOps(int val1, int val2, String ops)
	{
		//parentheses calculation aspect in parentheses class
		
		//calcParen = ()
		if(ops == "(", ")")
		{
			return this.theParentheses.calcParen();
		}
		else if (ops == "*", "mul")
		{
			return val1 * val2;
		}
		else if(ops == "/")
		{
			return val1 / val2;
		}
		else if(ops == "-", "sub")
		{
			return val1 - val2;
		}
		else
		{
			//if ops == "+", "add", "addi"
			//add and addi would follow similar patterns regarding placement of values
			return val1 + val2
		}
	}
	
	
	

	

}
