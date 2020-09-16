package JavaPractice;

public class Permutations {
	public static void main(String[] args) {
		String str="ABC"; 
		
		
		printPermute(str,"");
		
		
	}

	private static void printPermute(String str, String ans) {
		// TODO Auto-generated method stub
		if(str.length()==0){
			System.out.println(ans+" ");
			
			return;
		}
		
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			String ros=str.substring(0,i)+str.substring(i+1);
			
			printPermute(ros, ans+ch);
		}
		
		
	}

}
