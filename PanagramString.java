package JavaPractice;

public class PanagramString {
	public static void main(String[] args) {
		String str="qwertyuioplkjhgfdsazxcvbnm";
		str.toLowerCase();
		boolean b=true;
	
		
		for(char i='a';i<='z';i++){
			if(!str.contains(String.valueOf(i))){
			 b = false;
				break;
				
			}
		}
		System.out.println(b);
	}

}
