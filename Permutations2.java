package JavaPractice;

public class Permutations2 {
	public static void main(String[] args) {
		String str="ABCDEF";
		int n=str.length();
		permute(str,0,n-1);
	}

	private static void permute(String str, int l, int r) {
		// TODO Auto-generated method stub
		if(l==r){
			System.out.println(str);
		}
		else{
			for(int i=l;i<=r;i++){
				str=swap(str,l,i);
				permute(str, l+1, r);
				swap(str,l,i);
			}
		}
		
		
	}

	private static String swap(String str, int i, int j) {
		// TODO Auto-generated method stub
		char temp;
		char[] charArray=str.toCharArray();
		temp=charArray[i];
		charArray[i]=charArray[j];
		charArray[j]=temp;
		return String.valueOf(charArray);
		
		
	}

}
