import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args) {
		//		Student s1=new Student("Sharukh",78,97,78);
		//		System.out.println(s1);
		//		Student s2=new Student("Bhavesh",88,98,78);
		//		System.out.println(s2);
		//		Student s3=new Student("Pranay",71,85,91);
		//		System.out.println(s3);
		//		Student s4=new Student("sharukh",98,68,58);

		// System.out.println(s4);

		Scanner sc=new Scanner(System.in);

		int choice=0;
		do {

			System.out.println("Enter choice");
			System.out.println("1.Add Student\n2.DisplayAll\n3.searchById\n4.searchbyName\n5.updateMarks\n0.exits" );
			choice=sc.nextInt();

			switch(choice){

			case 1:
				StudentService.addNewstudent();
				break;
			case 2:
				StudentService.displayAll();
				break;
			case 3:
				StudentService.searchById();
				break;
			default:
				System.out.println("wrong choice");

			}

		}while(choice!=0);

	}


}

