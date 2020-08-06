package oops;
import java.util.Scanner;
class v0
{
	int a,b;
	void sas()
	{
		Scanner Sc=new Scanner(System.in);
		a=Sc.nextInt();
		b=Sc.nextInt();
	}
	}
class v1 extends v0
{
	int c;
	void add()
	{
		c=a+b;
		System.out.println(c);
	}
}

public class nonabstract {

	public static void main(String[] args) {
		v1 obj=new v1();
		obj.sas();
		obj.add();
		
		

	}

}
