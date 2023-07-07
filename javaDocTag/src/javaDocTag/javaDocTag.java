package javaDocTag;
/**
 * This is a good class

 *
 */
public class javaDocTag {
	/**
	 
	 * @param args
	 */

	public static void main(String[] args) {
		System.out.println("I am  method");
	}
		/**
		 * this is a method of beautiful class
		 * @param i this is the first number to add
		 * @param j this is the second number to add
		 * @return  sum of two numbers are integer
		 * @exception Exception if i is 0
		 * @deprecated the method is use depracted +operator
		 */
public int add(int i,int j)  throws Exception{
	if(i==0) {
		throw new Exception();
	}
	int c;
	c=i+j;
	return c;
}
	}


