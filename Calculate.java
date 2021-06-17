import java.util.*;
class Calc
{
	public int add(int num1,int num2)
	{
		return num1+num2;
	}
	public int sub(int num1,int num2)
	{
		return num1-num2;
	}
	public int mul(int num1,int num2)
	{
		return num1*num2;
	}
	public int div(int num1,int num2)
	{
		return num1/num2;
	}
	
}
public class Calculate
{
	public static void main(String []args)
	{
		int num1,num2,choice;
		Scanner sin= new Scanner(System.in);
		System.out.println("Enter the first number:");
		num1=sin.nextInt();
		System.out.println("Enter the second number:");
		num2=sin.nextInt();
		while(true)
		{
		 System.out.println("1.Additon");
         System.out.println("2.Subtraction");
         System.out.println("3.Multiplication");
         System.out.println("4.Division");
         System.out.println("5.Exit");
		 System.out.println("Enter your choice:");
		 choice=sin.nextInt();
		 Calc obj=new Calc();
		 switch(choice)
            {
                case 1:
                		System.out.println("Result:"+obj.add(num1,num2));
                		break;
                case 2:
                		System.out.println("Result:"+obj.sub(num1,num2));
                		break;
                case 3:
                   		System.out.println("Result:"+obj.mul(num1,num2));
                		break;
                case 4:
                		System.out.println("Result:"+obj.div(num1,num2));
                		break;
                case 5:
                		System.exit(0);
            }
           }

	}
}
