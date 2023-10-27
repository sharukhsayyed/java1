import java.util.Scanner;

public class Callingmeth {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//int num=sc.nextInt();
	//	int num1=sc.nextInt();
//		System.out.println(NumberService.factorial(num));
//		System.out.println(NumberService.addition(6, 11));
//		System.out.println(NumberService.add_digits(num1));
//		
		//NumberService.printTbl(num);
		System.out.println("Enter rows and colms");
		int r=sc.nextInt();
		int c=sc.nextInt();
		int[][] arr1=new int[r][c];
		//int [][] arr2=new int[r][c];
		ArraySevice1.accept2DArr(arr1);
		//ArraySevice1.display2DArr(arr1);
		//ArraySevice1.accept2DArr(arr2);
		
		//int[][] ans=Assign1.addTwoArr1(arr1, arr2);
		//ArraySevice1.display2DArr(ans);
		//int[][] ans1=Assign1.arrTranspose(arr1);
		//ArraySevice1.display2DArr(ans1);
		//sint max=Assign1.maxArr(arr1);
		//System.out.println("maxis="+max);
		//int min=Assign1.minArr(arr1);
		//System.out.println("minis="+min);
		System.out.println("count is ="+Assign1.numberCount(arr1,1));
	}

}
