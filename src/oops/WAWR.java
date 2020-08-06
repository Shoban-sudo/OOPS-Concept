package oops;
import java.util.Scanner;
class C
{
int c;
int sub(int a,int b)
{
	c=a-b;
	return(c);		
}
}

public class WAWR {

	public static void main(String[] args) {
		C shoban=new C();
		Scanner Sc=new Scanner(System.in);
		int a=Sc.nextInt();
		int b=Sc.nextInt();
		System.out.println(shoban.sub(a,b));
				

	}

}
