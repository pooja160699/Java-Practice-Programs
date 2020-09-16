package JavaPractice;

import java.util.Scanner;

public class ProgressTracker {
	public static void main(String args[]){
		int[] arr = new int[10];
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();	
		}
		verify(arr);
		
		
	}

	private static void verify(int[] arr) {
		// TODO Auto-generated method stub
		int progress = 0,j=0;
		for(int i=1;i<arr.length;i++){
			if(arr[j]<arr[i]){
				progress=progress+1;
			}
			j++;
		}
		System.out.println("Progress ="+progress);
		
	}

}
