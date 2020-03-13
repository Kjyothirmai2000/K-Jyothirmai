import java.util.*;
public class Main
{
	static int[][] XOR(int[][] x,int[] array,int n)
	{
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            if(j>i)
	            {
	                x[i][j]=array[i]^array[j];
	            }
	        }
	    }
	    return x;
	}
	static int MaxOfXor(int[][] x,int n)
	{
	    int max=0;
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            if(x[i][j]!=0&&x[i][j]>=max)
	            {
	                max=x[i][j];
	            }
	        }
	    }
	    return max;
	   
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[][] x;
		x= new int [n][n];
		int[] array=new int[n];
		for(int i=0;i<n;i++)
		array[i]=s.nextInt();
		x=XOR(x,array,n);
		System.out.print(MaxOfXor(x,n));
		
	}
}