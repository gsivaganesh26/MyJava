public class HelloWorld
{
	public static void main(String ...args)
	{
		String first=args[0];
		String last=args[1];
		int age=Integer.parseInt(args[2]);
		System.out.println("Result: "+first+" "+last+" "+age+"");
	}
}