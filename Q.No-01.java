import java.util.*;
public class Main
{
	static int FrequencyOfInt(int[] array,int n,int k)
	{
	    int count=0;
	    for(int i=0;i<n;i++)
	    {
	        if(array[i]==k)
	        count++;
	    }
	    return count;
	}
	public static void main(String[] args) {
	  
	    Scanner s=new Scanner(System.in);
	    int size=s.nextInt();         //7
	    int[] input1=new int[size];   //{-1,5,5,4,3,-1,-1}
	    for(int i=0;i<size;i++)
	    input1[i]=s.nextInt();
	    int input2=s.nextInt();      //-1
	    System.out.print(FrequencyOfInt(input1,size,input2));
	}
}