package JavaPractice;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String input="aassddffggshihdskjgggggggggj";
		String result = "";
	    for (int i = 0; i < input.length(); i++) {
	        if(!result.contains(String.valueOf(input.charAt(i)))) {
	            result += String.valueOf(input.charAt(i));
	        }
	    }
		System.out.println(result);
		String s="HeloWorld";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length-1;i=i+2){
			char swap=ch[i];
			ch[i]=ch[i+1];
			ch[i+1]=swap;
		}
		System.out.println(String.valueOf(ch));
		System.out.println(s.substring(2));
		System.out.println(s.charAt(s.length()/2));
	}

}
