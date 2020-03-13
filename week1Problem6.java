public class Main
{
	static int solution(int num){
	    int res=0;
	    for(int i=num;i>=1;i=i/2){
	        if(i==1||i%2==1)
	        res++;
	    }
	    return res;
	}
	public static void main(String[] args) {
		int a=5,errors=0;
		int[] output={0,1,1,2,1,2};
		for(int i=0;i<=a;i++){
		    if(solution(i)!=output[i])
		        errors++;
}
if(errors>0)
System.out.print(errors+"errors");
else
System.out.print("all cases passed");
}
}