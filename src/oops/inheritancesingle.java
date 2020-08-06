package oops;
import java.util.Scanner;
class aaaaa
{
	int a,b;
	void getA()
	{
	Scanner Sc=new Scanner(System.in);
	a=Sc.nextInt();
	b=Sc.nextInt();
		
	}
}
class bbb extends aaaaa
{
	int c;
	void add()
	{	
	c=a+b;
	System.out.println(c);
	}
}

public class inheritancesingle {

	public static void main(String[] args) {
		
		bbb obj=new bbb();
		obj.getA();
		obj.add();
		
		
		
		
		
		
		
	


			

	}

}
