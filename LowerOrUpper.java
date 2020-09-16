package JavaPractice;

import java.util.Scanner;

public class LowerOrUpper {
	public static void main(String args[]){
		Scanner  sc=new Scanner(System.in);
		String str=sc.nextLine();
		String[] arr=str.split(" ");
		for(int i=0;i<arr.length;i++){
			fun(arr[i]);
		}
		
		
	}

	private static void fun(String string) {
		// TODO Auto-generated method stub
		int upper=0,lower=0;
		char ar[]=string.toCharArray();
		for(int i=0;i<ar.length;i++){
			if(Character.isUpperCase(ar[i])){
				upper=upper+1;
			}else{
				lower=lower+1;
			}
		}
		if(upper>lower){
			System.out.println(string.toUpperCase());
		}
		else{
			System.out.println(string.toLowerCase());
		}
	}

}
