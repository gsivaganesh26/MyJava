import java.util.*;
public class Factorial
{
	static int fac(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String []args)
	{
		int n,res;
		Scanner sin=new Scanner(System.in);
		n=sin.nextInt();
		res=fac(n);
		System.out.println("Factorial is "+res);
	}
}