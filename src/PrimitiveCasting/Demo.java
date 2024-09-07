package PrimitiveCasting;

public class Demo {
	public static void main(String[] args) {
		System.out.println(10);//Java consider as non decimal value as int
		System.out.println(1.2);//java consider decimal as double

		// ->single Line Comment

		/*
		 * Multi Line Comment
		 */

		/**
		 * Documentation Comment
		 */

		//by default decimal value  is considered as double in java
		//therefore java asssumes that we are storing double into float
		//bigger to smaller,so we have explicitly cast(convert) it.

		float i=(float)1.2;
		float j=1.2f; //float j=1.2F

		long contactNo = 9849280839L;//long contactNo = 9849280839l

		byte a  = 5;
		short b =10;
		int c=25; 
		long d =1001l;//long d =1001l
		float e=1.4f;//float e=1.4F
		double z=1.5;







	}

}
