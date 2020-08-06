package oops;
import java.util.Scanner;
class a1
{
	int a,b;
	void get1()
	{
	Scanner Sc=new Scanner(System.in);
	a=Sc.nextInt();
	b=Sc.nextInt();
	}
	
}
class b1 extends a1
{
	int c;
	void get0()
	{
		Scanner Sc=new Scanner(System.in);
		c=Sc.nextInt();
	}
}
class c1 extends b1 
{
	int d;
	void add()
	{
		d=(a+b+c);
		System.out.println(d);
	}
}

public class multilevelinh {

	public static void main(String[] args) {
		c1 obj1=new c1();
		obj1.get0();
		obj1.get1();
		obj1.add();
		
	}

}
