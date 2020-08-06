package oops;
import java.util.Scanner;
interface A10
{
	void add();
	}
class B10 
{
int a,b;
void getA()
{
Scanner Sc=new  Scanner(System.in);
a=Sc.nextInt();
b=Sc.nextInt();

}
}

class C10 extends B10 implements A10
{
	int c;
	public void add()
	{
		c=(a+b);
		System.out.println(c);
		
	}
}






public class multipleinhe {

	public static void main(String[] args) {
		C10 obj=new C10();
		obj.getA();
		obj.add();
		

	}

}
