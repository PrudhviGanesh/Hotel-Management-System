import java.util.Scanner;
import java.lang.String;

class ScannerExample
{
	public static void main(string[]args){
		byte b;
		short s;
		int i;
		long l;
		float f;
		double d;
		boolean bo;
		string c;
		string s1;
		char c1;

		Scanner in=new Scanner(System.in);
		system.out.println("enter a String");
		s1=in.nextLine();
		System.out.println("String:"+s1);

		system.out.println("enter a Byte");
		b=in.nextByte();
		System.out.println("Byte:"+b);

		system.out.println("enter a Short ");
		s=in.nextShort();
		System.out.println("Short:"+s);

		system.out.println("enter a Integer");
		i=in.nextInt();
		System.out.println("Integer:"+i);

		system.out.println("enter a long");
		l=in.nextLong();
		System.out.println("Long:"+l);

		system.out.println("enter a Float");
		f=in.nextFloat();
		System.out.println("Float:"+f);

		system.out.println("enter a Double");
		d=in.nextDouble();
		System.out.println("Double:"+d);

		system.out.println("enter a Char");
		c1=in.nextChar();
		System.out.println("Char:"+c1);

		system.out.println("enter a Boolean");
		s1=in.nextBoolean();
		System.out.println("Boolean:"+bo);

        system.out.println("enter a Word");
		c1=in.next();
		System.out.println("Word:"+c1); 

		system.out.println("enter a character");
		c1=c.charAt(0);
		//c1=in.next().charAt(1);//charAt(index) is a meth
		System.out.println("Boolean:"+c1);

		
	}
}