package oops;
import java.util.Scanner;
class A20
{
	int a,b;
	void getA()
	{
		Scanner Sc=new Scanner(System.in);
		a=Sc.nextInt();
		b=Sc.nextInt();
			}
}

class B20 extends A20
{
	int c;
	void add()
	{
		c=(a+b);
		System.out.println(c);
	}
}
class C20 extends A20
{
	int d;
	void sub001()
	{
		d=(a-b);
		System.out.println(d);
	}
}
class D20 extends B20
{
	int e;
	void add1()
	{
		e=(a+b+c);
		System.out.println(e);
	}
}
class E20 extends C20
{
	int f;
	void sub002()
	{
		f=(a-b-d);
		System.out.println(f);
	}
}
public class hybrid {

	public static void main(String[] args) {
		D20 obj=new D20();
		obj.getA();
		obj.add();
		obj.add1();
		E20 obj1=new E20();
		obj1.getA();
		obj1.sub001();
		obj1.sub002();
		

		
	}

}
