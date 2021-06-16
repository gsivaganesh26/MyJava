import java.util.*;
public class sampleSwitch
{
	public static void main(String []args)
	{
		String choice;
		Scanner sin=new Scanner(System.in);
		while(true)
		{	
		 choice=sin.next();
		 switch(choice)
		 {
			case "1": System.out.println("Move Right");
					  break;
			case "2": System.out.println("Move Left");
					  break;
			case "3": System.out.println("Move Up");
					  break;
			case "4": System.out.println("Move Down");
					  break;
			case "q": System.exit(0);
					  break;
			case "6": System.out.println("Try again");
                   	  System.exit(0);
					  break;

		 }
	   }
	}
}