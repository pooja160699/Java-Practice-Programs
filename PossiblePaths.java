package JavaPractice;

public class PossiblePaths {
	public static void main(String[] args) {
		int row=1,columns=2;
		int x,y;
		int[][] arr=new int[row][columns];
		
		for(int i=0;i<row;i++){
			arr[i][0]=1;
		}
		for(int i=0;i<columns;i++){
			arr[0][i]=1;
		}
		
		for(int i=1;i<row;i++){
			for(int j=1;j<columns;j++){
				arr[i][j]=arr[i-1][j]+arr[i][j-1];
			}
		}
		System.out.println(arr[row-1][columns-1]);
		
	}

}
