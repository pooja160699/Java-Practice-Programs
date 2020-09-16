package JavaPractice;

public class PossiblePyramid {
	public static void main(String[] args) {
		int n=17;
		int ht=0;
		int i=0;
		
		while(n>0){
			i=i+2;
			n=n-i;
			if(n>=i){
				ht=ht+1;
			}
		}
		
		System.out.println(ht+1);

}
}
