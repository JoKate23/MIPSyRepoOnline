
public class MipsCCompiler 
{
	private DataMemory theDataMemory;
	private RegisterCollection theRegisterCollection;
	private SrcReader theSrc;
	private String filename;
	private ExpressionOps theExpressionOps;
	private Parentheses theParentheses;
		
	
	public MipsCCompiler(String filename)
	{
		this.filename = filename;
		this.theSrc = new SrcReader(filename);
		this.theDataMemory = new DataMemory(200000);
		this.theRegisterCollection = new RegisterCollection(16);
		String instruction; 
		String output;
		
		while(true)
		{
			instruction = this.theSrc.getNextLine();
			if(instruction.contentEquals("EOF"))
			{
				break;
			}
			else
			{
				//process this instruction
				output = "";
				String[] parts = instruction.split(" ");
				if(parts[0].trim().equals("int"))
				{
					output += "addi ";
					String varName = parts[1].trim();
					varName = varName.substring(0, varName.length()-1);
					output += this.theRegisterCollection.getNextAvailableRegisterName(varName);
					output += ", $zero, ";
					output += this.theDataMemory.getAddressForNewMemory();
				}
				else
				{
					parts = instruction.split("=");
					output += "addi ";
					String tempRegName = this.theRegisterCollection.getNextAvailableRegisterName("1337__lol");
					output += tempRegName;
					output += ", $zero, ";
					String varValue = parts[1].trim();
					varValue = varValue.substring(0, varValue.length()-1);
					output += varValue;
					output += "\n";
					output += "sw ";
					output += ", 0(";
					String oldRegName = this.theRegisterCollection.getRegisterNameByVarName(parts[0].trim());
					output += oldRegName;
					output += ")";
				}
				System.out.println(output);
					
			}
		}
		
		while(true)
		{
			instruction = this.theSrc.getNextLine();
			if(instruction.contentEquals("EOF"))
			{
				break;
			}
			else
			{
				calcOutput = "";
				String [] calcParts = instruction.split(" ");
				if(parts[].trim().equals("()*/-+"))
				{
					calcOutput += this.theExpressionOps.calcOps();
				}
				else if(calcParts[0].trim().equals("lw"))
				{
					//parse string to read values separated by ", 0("
					//parse off end parenthesis, as well
					//left value should be set = right value
					//calcOutput += above value equation
				}
				else if(calcParts[0].trim().equals("sw"))
				{
					//parse string to read values separated by ", 0("
					//parse off end parenthesis, as well
					//right value should be set = left value
					//calcOutput += above value equation
				}
				else
				{
					return "No Operands Found";
				}
				System.out.println(calcOutput);
			}
		}
		
		//for(int i = 0; i < instruction.length(); i++)
		//{
			//Char leftParen = "(";
			//Char rightParen = ")";
			
			//if(this.theParentheses == leftParen)
			//{
				//return this.theExpressionOps.calcParen();
			//}
			//else
			//{
				//return this.theExpressionOps.calcOps();
			//}
		//}
		
		
		
	}
}
