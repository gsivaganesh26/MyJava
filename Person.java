import java.util.*;
public class Person
{
	public static void main(String []args)
	{
		int age;
		Scanner sin=new Scanner(System.in);
		System.out.println("Enter Firstname:");
		String firstName= sin.next();
		System.out.println("Enter Lastname:");
		String lastName=sin.next();
		System.out.println("Enter age:");
		age=sin.nextInt();
		System.out.println("First name is "+firstName);
		System.out.println("Last name is "+lastName);
		System.out.println("Age is "+age);
	}
}