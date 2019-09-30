
public class MipsCCompiler 
{
	private DataMemory theDataMemory;
	private RegisterCollection theRegisterCollection;
	private SrcReader theSrc;
	private String filename;
	
	public MipsCCompiler(String filename)
	{
		this.filename = filename;
		this.theSrc = new SrcReader(filename);
		this.theDataMemory = new DataMemory(200000);
		this.theRegisterCollection = new RegisterCollection(16);
		System.out.println(this.theSrc.getNextLine());
		System.out.println(this.theSrc.getNextLine());
		System.out.println(this.theSrc.getNextLine());
		System.out.println(this.theDataMemory.getAddressForNewMemory());
		System.out.println(this.theDataMemory.getAddressForNewMemory());
		System.out.println(this.theDataMemory.getAddressForNewMemory());
		System.out.println(this.theRegisterCollection.getNextAvailableRegisterName());
		System.out.println(this.theRegisterCollection.getNextAvailableRegisterName());

		System.out.println(this.theRegisterCollection.getNextAvailableRegisterName());

	}
}
