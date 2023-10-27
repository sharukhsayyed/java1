
public class Student {
	//data members
	private String sid;//id contains combination of alphabet and numbers
	private String sname;
	private int m1,m2,m3;
	static int cnt;
	static {
		cnt=0;
	}
	//static function or static block can access only static variables
	public static void f1() {

	}
	//default constructor
	public Student()
	{


		//sid=null;
		//sname=null;
		//m1=m2=m3=0;
		this(null,0,0,0);//it is calling parametrized constr initialisng it will default values 


	}
	private String generateCode() {
		cnt++;
		if(this.sname!=null)
			return this.sname.substring(0, 3)+cnt;
		else 
			return "aaa"+cnt;

	}
	private String substring(String substring) {
		// TODO Auto-generated method stub
		return null;
	}
	//prarmeterized constructor 
	public Student(String sname,int m1, int m2,int m3) {
		this.sname=sname;
		this.sid=generateCode();
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}

	//setter methods.
	//id will not have setter as it is increasing automaticaly.
	public void setName(String sn) {
		this.sname=sn;

	}

	public void setm1(int m1) {
		this.m1=m1;
	}

	public void setm2(int m2) {
		this.m2=m2;
	}

	public void setm3(int m3) {
		this.m3=m3;
	}

	//getter methods

	public String getsid() {
		return this.sid;
	}
	public String getsname() {
		return this.sname;
	}


	public int m1(){
		return this.m1;
	}

	public int m2() {
		return this.m2;
	}

	public int m3() {
		return this.m3;
	}
	public String toString()
	{
		return "ID : "+this.sid+"\nName: "+this.sname+"\nM1: "+this.m1+"\nM2: "+this.m2+"\nM3 :"+this.m3;



	}

}
