/**
 * 
 * @author gouravrusiya
 *
 */
public class p040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.currentTimeMillis();
		
		StringBuffer str = new StringBuffer("");
		String s = "";
		long mul = 1L;
		long x = 0L;
		
		for(int i=1;i<=1000000;i++)
		{
			str=str.append(i);
			//System.out.println(str);
			if(i==1 || i==10 || i==100 || i==1000 || i==10000 || i==100000 || i==1000000)
			{
				s = "" + str.charAt(i-1);
				//System.out.println(s);
				
				x = Long.parseLong(s);
				//System.out.println(x);
				
				mul = mul*x;
				//System.out.println(mul);
			}
			
		}
		System.out.println(mul);
		
		long endTime = System.currentTimeMillis();
		//System.out.println("Took "+(endTime - startTime) + " ms");
	}

}
