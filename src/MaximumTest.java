
public class MaximumTest {

	public static void main(String[] args) {

		//declaring values
		Integer x=5;
		Integer y=6;
		Integer z=7;
		MaximumTest.testMaximum(x,y,z);
	}
	//Method to find maximum of 3 numbers
	public static int testMaximum(Integer x, Integer y, Integer z) {
		Integer max=x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		printMax(x,y,z,max);
		return max;
	}
	//Method to print values
	private static void printMax(Integer x, Integer y, Integer z, Integer max) {
		System.out.printf("Max of %s ,%s and %s is %s \n",x,y,z,max);

	}
}
