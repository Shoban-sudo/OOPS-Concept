package oops;
class n6
{
	void display()
	{
		System.out.println("display");
	}
}
class n7 extends n6
{
	void display()
	{
		System.out.println("display form class b");
	}
}

public class polymorphismmethodoverrridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
n6 obj=new n6();
obj.display();
n7 obj1=new n7();
obj1.display();

	}

}
