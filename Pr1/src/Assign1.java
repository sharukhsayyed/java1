import java.util.Scanner;

public class Assign1 {

public static int[][] addTwoArr1(int [][]arr1,int [][]arr2)	{
		
		Scanner sc=new Scanner(System.in);
		int [][]temp =new int[arr1.length][arr1[0].length];
		
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
			  temp[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
			
		return temp;
		
		
		
	}

public static int[][] arrTranspose(int[][] arr3){
	
	int [][] temp1=new int[arr3.length][arr3[0].length];
	for(int i=0;i<arr3.length;i++) {
		
		for(int j=0;j<arr3[0].length;j++) {
			
			temp1[j][i]=arr3[i][j];
			
			
			
		}
	}
	
	
	
	
	return temp1;
	
}


public static int maxArr(int [][] arr4) {
	
	int temp=Integer.MIN_VALUE;
	for(int i=0;i<arr4.length;i++) {
		for(int j=0;j<arr4[0].length;j++) {
			if(arr4[i][j]>temp) {
				temp=arr4[i][j];
			}
		}
	}
	
	return temp;
}

public static int minArr(int [][] arr4) {
	
	int temp2=Integer.MAX_VALUE;
	for(int i=0;i<arr4.length;i++) {
		for(int j=0;j<arr4[0].length;j++) {
			if(arr4[i][j]<temp2) {
				temp2=arr4[i][j];
			}
		}
	}
	
	return temp2;
}
 public static int numberCount(int [][] arr,int value) {
	 
	 int count=0;
	 for(int i=0;i<arr.length;i++) {
		 for(int j=0;j<arr[0].length;j++) {
			 if(arr[i][j]==value) {
				 count++;
				 
			 }
			 
		 }
		  
	 }
	 
	 
	 
	 
	 
	return count; 
 }









	
	
	
}
