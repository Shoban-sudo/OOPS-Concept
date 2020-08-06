package oops;
import java.util.Scanner;
class AA
{
	int a,b,c;
	void mul()
	{
	Scanner Sc=new Scanner(System.in);
	a=Sc.nextInt();
	b=Sc.nextInt();
	c=a*b;
	System.out.println(c);
	}
	
	
}
public class testtypeone {
	public static void main(String [] args)
	{
		AA net=new AA();
		net. mul();
		
	}

}
