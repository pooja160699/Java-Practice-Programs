package JavaPractice;

public class Abbrevation {
	public static void main(String[] args) {
		String a=abbreviation("fgjsdpooja","poo");
		System.out.println(a);
	}

	static String abbreviation(String a, String b) {
        a=a.toUpperCase();
        b=b.toUpperCase();
        if(a.equals(b)){
        	return "YES";
        }
        char i=a.charAt(0);
        for(int j=0;j<a.length()-b.length();j++){
            if(a.charAt(j)==b.charAt(0)){
            	String s=a.substring(j,j+b.length());
            	System.out.println(s);
                if(s.equals(b)){
                    return "YES";
                }
            }
        }
        return "NO";
      }
	
	}
        
    
