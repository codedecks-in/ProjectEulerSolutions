/**
 * 
 * @author gouravrusiya
 *
 */
public class p034 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int lsum = 0;
		long startTime = System.currentTimeMillis();
		
		for(int i=10;i<=10000000;i++){
			
			int x = i;
			int sum = 0;
			
			while(x!=0){
				int rem = (x%10);
				sum = sum + factorial(rem);
				x=(x/10);
			}
			
			if(sum==i)
				lsum += i;
		}
		
		System.out.println(lsum);
		long endTime = System.currentTimeMillis();
		System.out.println("Took "+(endTime - startTime) + " ms"); 
	}
	
	static int factorial(int f){
		int fact  = 1;
		
		if(f==1 || f==0)
			return 1;
		
		while(f!=1){
			fact = f * fact;
			f--;
		}
		return fact;
	}
}
