package JavaPractice;

import java.util.HashMap;

public class PrintSeries {
	public static void main(String[] args) {
		int [] ar={1,2,1,2,1,3,2};
		int n=7;
	        HashMap hash=new HashMap();
	        for(int i=0;i<ar.length;i++){
	            if(!hash.containsKey(ar[i])){
	                hash.put(ar[i],1);
	            }
	            else{
	            	int c=(int) hash.get(ar[i]);
	            	hash.put(ar[i], c+1);
	            }
	        }
	         
	        System.out.println(hash);
	}

}
