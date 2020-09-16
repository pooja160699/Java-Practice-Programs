package JavaPractice;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class Maxproduct {
	public static void main(String[] args) {
		int arr[]={1,5,-3,5};
		ArrayList<Integer> pos=new ArrayList<>();
		ArrayList<Integer> neg=new ArrayList<>();
		int n=0,l;
		int product1=1,product2=1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				pos.add(arr[i]);
			}
			else{
				neg.add(arr[i]);
			}
			
		}

		for(int j=0;j<pos.size();j++){
			product1=product1*pos.get(j);
		}

		if(neg.size()%2==0){
			 l = neg.size();
		}else{
			 l=neg.size()-1;
		
		}
		for(int i=0;i<l;i++){
			product2=product2*neg.get(i);
			
		}
		System.out.println("Product :"+product1*product2);
	}

}
