import java.util.*;
public class Vowels
{
	static int count(String str)
	{
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' ||ch=='U' )
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String []args)
	{
		int res;
		String str;
		Scanner sin=new Scanner(System.in);
		System.out.print("Enter the String:");
		str=sin.next();
		res=count(str);
		System.out.println("Number of vowels in the string is:"+res);
	}
}