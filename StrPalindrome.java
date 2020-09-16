package JavaPractice;

import java.util.HashMap;

public class StrPalindrome {
	public static void main(String[] args) {
		String str="pooja";
		HashMap hash=new HashMap();
		String str2="";
		for(int i=str.length()-1;i>=0;i--){
			str2=str2+str.charAt(i);
		}
		System.out.println(str2);
		if(str.equals(str2)){
			System.out.println("palindrome");
		
		}else{
			System.out.println("not");
		}
		
		for(int i=0;i<str.length();i++){
			if(!hash.containsKey(str.charAt(i))){
				hash.put(str.charAt(i), 1);
			}else{
				int c=(int) hash.get(str.charAt(i));
				hash.put(str.charAt(i),c+1);
			}
			}
		System.out.println(hash);
		
	}

	}
