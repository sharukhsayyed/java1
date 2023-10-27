import java.util.Scanner;
public class AddTwoArr {

	public static int[][] addTwoArr(int [][]arr1,int [][]arr2)	{
		
		Scanner sc=new Scanner(System.in);
		int [][]temp =new int[arr1.length][arr1[0].length];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
			  temp[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
			
		return temp;
		
		
		
	}
	
	
	
	
}
