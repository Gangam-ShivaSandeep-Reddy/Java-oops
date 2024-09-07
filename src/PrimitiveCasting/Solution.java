package PrimitiveCasting;

public class Solution {
	public static void main(String[] args) {

		//Widening
		int a= 25;
		double b =a;
		System.out.println(a+" "+b);

		double c =15;
		System.out.println(c);
		char d = 'A';
		int e = d;
		System.out.println(d);


		//NARROWING
		double i=12.5;
		int j=(int)i;
		System.out.println(i+" "+j);
		int z = (int)	67.23;
		System.out.println(z);

		int x = 97;
		char y=(char)x;
		System.out.println(x +" "+y);
		
		System.out.println("=========================");
		System.out.println((int)78.23);//78
		System.out.println((char)68);//0
		System.out.println("A"+"B");//AB
		System.out.println("A"+10+20);
		System.out.println(10+20+"A");
		System.out.println('A'+'B');

}
}
