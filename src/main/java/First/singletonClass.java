package First;

public class singletonClass {

	private static singletonClass singletonClassObject;
	public String str;
	
	private singletonClass()
	{
		str="Hello This is example";
	}
	
	public static singletonClass getInstance()
	{
		if(singletonClassObject==null)
		{
			singletonClassObject=new singletonClass();
		}
		return singletonClassObject;
	}
	
	
	
	public static void main(String[] args) {
		
		singletonClass x=singletonClass.getInstance();
		x.str=x.str.toUpperCase();
		
		System.out.println(x.str);
		singletonClass y=singletonClass.getInstance();
		singletonClass z=singletonClass.getInstance();
		System.out.println(y.str);
		System.out.println(z.str);
	}

}
