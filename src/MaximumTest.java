public class MaximumTest<T extends Comparable<T>> {

	//declaring variables
	public T x,y,z;


	//creating constructor
	public MaximumTest(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	/*
	 * Creating generic method for accepting different data types
	 * 
	 * */
	public static<T extends Comparable<T>> T testMaximum(T x,T y,T z) {
		T max = x;

		if(y.compareTo(max)>0) {
			max=y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		printMax(x,y,z,max);
		
		return max;
	}
	public static<T> void printMax(T x, T y, T z, T max) {
		System.out.printf("Max of %s ,%s and %s is %s \n",x,y,z,max);		
	}


	public static void main(String[] args) {
	
		//declaring values
		Integer x=5, y=6,z=8;
		Float xf=6.6f,yf=8.8f,zf=7.7f;
		String xStr="Apple",yStr="Peach",zStr="Banana";
		
		MaximumTest.testMaximum(x,y,z);
		MaximumTest.testMaximum(xf, yf, zf);
		MaximumTest.testMaximum(xStr, yStr, zStr);
	}
}