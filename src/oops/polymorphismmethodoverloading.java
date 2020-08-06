package oops;

import java.util.Scanner;

class j
{
	int a,b,c;
	float s;
	
	
	void display()
	{
		System.out.println("display");
	}
	void display(int a,int b)
	{
		
		c=a+b;
		System.out.println(c);
	}
	void display(float s)
	{
		
		System.out.println(s);
		
	}
}

public class polymorphismmethodoverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc=new Scanner(System.in);
		int a=Sc.nextInt();
	int 	b=Sc.nextInt();
	float	s=Sc.nextFloat();
		
		
		j obj=new j();
		obj.display();
		obj.display(a,b);
		obj.display(s);
		
		

	}

}
