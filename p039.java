/**
 * 
 * @author gouravrusiya
 *
 */
public class p039 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int max = -1;
		int maxP = -1;
		
		for(int p=12;p<=1000;p++){
			count = 0;
			
			for(int b=1;b<p;b++){
				
				for(int a=1;a<b;a++){
					
					int x = (int)(Math.pow(a, 2) + Math.pow(b, 2));
					
					int y = (a+b);
					int k = (p-y);
					int z = (int)(Math.pow(k, 2));
					
					if(x==z)
						count++;
				}
			}
			
			//System.out.println("p="+p+" count="+count);
			
			if(max<count){
				max = count;
				maxP = p;
			}
		}
		
		System.out.println(max);
		System.out.println(maxP);
	}

}
