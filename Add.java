import java.util.*;
public class Add 
{
    public static void main(String[] args) 
    {
        int num1, num2, opt;
        double div;
        Scanner sin = new Scanner(System.in);
        System.out.print("Enter first number:");
        num1 = sin.nextInt();
        System.out.print("Enter second number:");
        num2 = sin.nextInt();
        while(true)
        {
            System.out.println("1.Additon");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");
            opt = sin.nextInt();
            switch(opt)
            {
                case 1:
                		System.out.println("Result:"+(num1+num2));
                		break;
                case 2:
                        System.out.println("Result:"+(num1-num2));
                        break;
 
                case 3:
                		System.out.println("Result:"+(num1*num2));
                		break;
 
                case 4:
                		div = (double)num1 / num2;
                		System.out.println("Result:"+div);
                		break;    
 
                case 5:
                		System.exit(0);
            }
        }
    }
}