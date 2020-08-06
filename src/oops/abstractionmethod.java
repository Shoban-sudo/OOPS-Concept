package oops;
import java.util.Scanner;
abstract class n
{
	int a,b;
	void geta()
	{
		Scanner Sc=new Scanner(System.in);
		a=Sc.nextInt();
		b=Sc.nextInt();
		
	}
	abstract void sub();
}
class n1 extends n
{
	int c;
	void sub()
	{
		c=a+b;
		System.out.println(c);
	}
}



public class abstractionmethod {

	public static void main(String[] args) {
	n1 obj=new n1();
	obj.geta();
	obj.sub();
	

	}

}
