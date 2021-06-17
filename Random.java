import java.util.*;
import java.lang.Math;
public class Random
{
	public static void main(String []args)
	{
		int arr[][]=new int[2][3];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				arr[i][j]=(int)10*(Math.random());
			}
		}
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(arr[i][j]);
			}
		}
	}
}