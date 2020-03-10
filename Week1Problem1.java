import java.util.*;

public class Main {

   
    static int Xor(int[] array,int[] q)
    {
        int res=0;
        for(int i=q[0];i<=q[1];i++)
        {
            res=array[i]^res;
        }
        return res;
    }
    public static void main(String args[])
    {
         int[] data={1,3,4,8}; 
         int[][] queries={{0,1},{1,2},{0,3},{3,3}};
         int[] output={2,7,14,8};
         int errors=0;
        for (int i=0; i<4; i++)
        {
          if(Xor(data,queries[i])!=output[i])
          errors++;
        }

        if(errors>0)
        {
            System.out.println(errors + " Errors");
        }
        else
        {
            System.out.println("all cases passed!");
        }
    }
}