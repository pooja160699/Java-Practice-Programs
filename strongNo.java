package JavaPractice;

public class strongNo {
	public static void main(String[] args) {
		int num=145,rem,sum=0;
		int n=num;
		while(num!=0){
			rem=num%10;
			num=num/10;
			fact(rem);
			sum=sum+fact(rem);
		}
		if(n==sum){
			System.out.println("Strong No");
		}else{
			System.out.println("Not Strong No");
			
		}
		
			
	}
	
	
	private static int fact(int rem) {
		// TODO Auto-generated method stub
		int f=1;
		for(int i=1;i<=rem;i++){
			f=f*i;
		}
		return f;
		
	}

}
