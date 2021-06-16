import java.util.*;
public class AlphabetsFunc 
{  
	public static void main(String args[])  
	{  
		char[] arr=new char[26];
		arr=getAlphabetArray();             
		for (int i = 0; i < arr.length; i++)   
		System.out.print( arr[i]+ " ");     
	}
	public static char[] getAlphabetArray()  
	{  
		char[] arr1= new char[26];  //initializing array  
		char c='A';
		int i=0;
		do
		{
			arr1[i]=c;
			i++;
			c++;
		}
		while(c<='Z');
		return arr1;
	}
	 
}  