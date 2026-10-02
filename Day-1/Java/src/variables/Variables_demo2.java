package variables;

public class Variables_demo2 {

	int instanceValue = 20;
	
	static int staticValue = 28;
	
	
	public void display()
	{
		int localValue = 30;
		
		System.out.println(instanceValue);
		System.out.println(staticValue);
		System.out.println(localValue);
	}

}
