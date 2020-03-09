public class Main
{
	public static void main(String[] args) {
	    int n=8;
	    int t=n;
	    int count=0;
	    while(t!=1){
	        if(t%2==0){
	            t=t/2;
	            count++;
	        }
	        else{
	            t=t-1;
	            count++;
	        }
	    }
	    System.out.println(count);
	}
}
