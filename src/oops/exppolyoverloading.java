package oops;
import java.util.Scanner;
class k
{
void display()
{
System.out.println("display");	
}
void display(int a,int b)
{
System.out.println("display the:" +a+ " "+b);	
}
void display(int c)
{
System.out.println("display the:" +c);	
}
void display(char d)
{
System.out.println("display :" +d);	
}
}

public class exppolyoverloading {

	public static void main(String[] args) {
		k obj=new k();
		Scanner Sc=new Scanner(System.in);
		int a=Sc.nextInt();
		int b=Sc.nextInt();
		int c=Sc.nextInt();
		char d=Sc.next().charAt(0);
		obj.display();
		obj.display(a, b);
		obj.display(c);
		obj.display(d);
		
		
		
	}

}
