package JavaPractice;

public class CheckPattern {
	public static void main(String[] args) {
		int n=5;
		boolean b=true;
		String s=Integer.toBinaryString(n);
		for(int i=0;i<s.length()-1;i++){
			if(s.charAt(i)=='0' && s.charAt(i+1)=='1'){
				b=true;
			}
			else if(s.charAt(i)=='1' && s.charAt(i+1)=='0'){
				b=true;
			}
			else{
				b=false;
			}
	
		}
		System.out.println(b);
		
	}

}
