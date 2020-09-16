package JavaPractice;

public class PalindromeNo {
	public static void main(String[] args) {
		int num=5648916,rem,sum=0;
		String rev="";
		int n=num;
		while(num!=0){
			rem=num%10;
			num=num/10;
			rev=rev+rem;
		}
		System.out.println(rev);
			
	}


}
