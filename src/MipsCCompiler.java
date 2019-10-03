
public class MipsCCompiler 
{
	private DataMemory theDataMemory;
	private RegisterCollection theRegisterCollection;
	private SrcReader theSrc;
	private String filename;
	private String currentInstruction;
	private String instBefore;
	private String instAfter;
	private String getInstValue;
	private String Value1;
	private String Value2;
	
	//to specify which pieces are wanted from the instruction line
	public String stringPair(String item1, int item2)
	{
		this.getInstValue = getInstValue;
		
		Value1 = item1;
		Value2 = item2;
		
		if (getInstValue == "item1")
		{
			return Value1;
		}
		else
		{
			return Value2;
		}
	
	}
	
	
	public MipsCCompiler(String filename)
	{
		this.filename = filename;
		this.theSrc = new SrcReader(filename);
		this.theDataMemory = new DataMemory(200000);
		this.theRegisterCollection = new RegisterCollection(16);
		
		this.getInstValue = getInstValue;
		
		//System.out.println(this.theSrc.getNextLine());
		//System.out.println(this.theSrc.getNextLine());
		//System.out.println(this.theSrc.getNextLine());
		//System.out.println(this.theDataMemory.getAddressForNewMemory());
		//System.out.println(this.theDataMemory.getAddressForNewMemory());
		//System.out.println(this.theDataMemory.getAddressForNewMemory());
		//System.out.println(this.theRegisterCollection.getNextAvailableRegisterName());
		//System.out.println(this.theRegisterCollection.getNextAvailableRegisterName());

		//System.out.println(this.theRegisterCollection.getNextAvailableRegisterName());

		
		
		//prints out for line 'int i;'
		if (currentInstruction.contentEquals("int"))
		{
			System.out.println ("addi" + ' ' + this.getInstValue(1) 
			+ "," + " " + this.theRegisterCollection(0) + this.getInstValue(2));
		}
		else
		{
			return "Not int";
		}

		
		
		//prints out for line 'i = 7;'
		if (currentInstruction.contentEquals("="))
		{
			if (instBefore.length() == 0)
			{
				instBefore = finishInstruction;
			}
			else
			{
				instAfter = finishInstruction;
			}
			
			if (instAfter.length() != 0)
			{
				System.out.println('addi' + ' ' + this.theRegisterCollection.getNextAvailableRegisterName() 
				+ ',' + ' ' + this.finishInstruction);
				
				System.out.println('sw' + ' ' + this.theRegisterCollection.getNextAvailableRegisterName()
				+ ',' + ' ' + '0(' + this.getInstValue(1) + ')');
			}
			else
			{
				return "Not valid instruction";
			}
			
		}
		
		
	}
}
