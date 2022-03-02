
public class MaximumTest<T extends Comparable<T>> {

	T x,y,z;
	
	public MaximumTest(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public T maximum() {
		return MaximumTest.maximum(x,y,z);
	}
	public static <T extends Comparable<T>> T  maximum(T x,T y,T z ) {

		T max=x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		printMax(x,y,z,max);
		return max;
	}
	public static String   testMaximum(String x,String y,String z ) {

		String max=x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		printMax(x,y,z,max);
		return max;
	}

	public static <T> void printMax(T x, T y, T z, T max) {
		System.out.printf("Max of %s , %s and %s is %s\n",x,y,z,max);
	}
	
	public static void main(String[] args) {

		//declaring values
		Integer x=5;
		Integer y=6;
		Integer z=8;
		Float xf=6.6f,yf=8.8f,zf=7.7f;
		String xStr="Apple",yStr="Peach",zStr="Banana";


		//calling method for integer values
		new MaximumTest(x,y,z).maximum();
		//calling method for float values
		new MaximumTest(xf,yf,zf).maximum();
		//calling method for String values
		MaximumTest.testMaximum(xStr,yStr,zStr);

	}

	
	
}
