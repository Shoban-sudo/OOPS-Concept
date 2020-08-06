package oops;
import java.util.Scanner;
class B
{
	int c;
	void add(int a,int b)
	{
		
		
		c=a+b;
		System.out.println(c);
	}
}

public class WAWOR {
	public static void main(String [] args)
	{
	B shoban =new B();
	Scanner Sc=new Scanner(System.in);
	int a=Sc.nextInt();
	int b=Sc.nextInt();
	shoban.add(a,b);
	
	
	
	}

}
