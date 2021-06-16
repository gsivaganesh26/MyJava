import java.util.Scanner;
public class StringCompareEmp{
   public static void main(String args[]){
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the two strngs of same size:");
      String str1 = in.nextLine();
      String str2 = in.nextLine();
      System.out.println( "The First word when alaphabetically arranged is "+findFirstWord(str1,str2));
   }
   public static String findFirstWord(String S1,String S2){
   if((int)S1.charAt(0)<(int)S2.charAt(0))
   {
       return S1;
   }
   else
   {
      return S2;
   }
}
}