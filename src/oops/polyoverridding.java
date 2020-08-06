package oops;
class u1
{
	void display()
	{
		System.out.println("display");
	}
}
class u2 extends u1
{
	void display()
	{
		System.out.println("display the class 2");
	}
	
}

public class polyoverridding {

	public static void main(String[] args) {
		u1 obj1=new u1();
		obj1.display();
		u2 obj2=new u2();
		obj2.display();
		
		
	}

}
