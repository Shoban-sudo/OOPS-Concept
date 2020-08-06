package oops;
import java.util.Scanner;
class sho
{
	int a;
	void geta()
	{
	Scanner Sc=new Scanner(System.in);
	a=Sc.nextInt();
	}
	
}
class sho1 extends sho
{
	int b;
	void geta2()
	{
	Scanner Sc=new Scanner(System.in);
	b=Sc.nextInt();
	}
	
}
class sho2 extends sho1
{
//	int c;
	void add()
	{
		if(a>b)
		{
			System.out.println("codition pass");
		}
		else
		{
			
		System.out.println("condition fail");
		}
	}
}

public class multilevelexinh {

	public static void main(String[] args) {
sho2 obj=new sho2();
obj.geta();
obj.geta2();
obj.add();

	}

}
