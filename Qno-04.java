import java.util.*;

public class Main
{
	static int Find_the_first_missing_number(int[] array,int size)
{
    int i,d=array[1]-array[0];
    for(i=0;i<size;i++)
    {
        if((array[i+1]-array[i])!=d)
        break;
    }
    return array[i]+1;
}
	public static void main(String[] args) {
	  Scanner s=new Scanner(System.in);
	  int size=s.nextInt();                      //7
	  int[] input1=new int[size];               //1 2 3 4 9 11 15 26
	  for(int i=0;i<size;i++)
	  input1[i]=s.nextInt();
	  int output_expected=5;
	  if(Find_the_first_missing_number(input1,size)==output_expected)
	  System.out.println("no errors..all cases passed");
	}
}