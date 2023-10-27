import java.util.Scanner;

public class StudentService {


	static Student[] starr;
	static int cnt;
	static {
		starr=new Student[100];
		starr[0]=new Student("Sejal",44,44,88);
		starr[1]=new Student("Ashu",55,45,55);
		starr[2]=new Student("Deepa",23,23,54);
		starr[3]=new Student("Sangeeta",55,21,33);
		cnt=4;

	}

	public static void addNewstudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of student:");
		String s1 = sc.nextLine();
		System.out.println("m1");
		int mr1=sc.nextInt();
		System.out.println("m2");
		int mr2=sc.nextInt();
		System.out.println("m3");
		int mr3 =sc.nextInt();

		starr[cnt]=new Student(s1,mr1,mr2,mr3);
		cnt++;
	}


	public static void displayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(starr[i]);
		}
	}


	//	
	//	public static showids() {
	//		for(int i=0;i<cnt;i++) {
	//			
	//			System.out.println(starr[i].getsid());	
	//			
	//		}
	//}
	public static void searchById() {

		for(int i=0;i<cnt;i++) {

			System.out.println(starr[i].getsid());	

		}
		System.out.println("enter your id");

		Scanner sc=new Scanner(System.in);
		String uid=sc.next();
		for(int i=0;i<cnt;i++) {


			if(starr[i].getsid().equals(uid)) {


				System.out.println(starr[i]);

			}



		}
	}







}