
public class MaximumTest {

	public static void main(String[] args) {

		//declaring values
		Integer x=5;
		Integer y=6;
		Integer z=8;
		Float xf=6.6f,yf=8.8f,zf=7.7f;
		MaximumTest.testMaximum(x,y,z);
		MaximumTest.testMaximum(xf, yf, zf);
	}
	private static float testMaximum(Float xf, Float yf, Float zf) {
		
		Float max=xf;
		if(yf.compareTo(max)>0) {
			max=yf;
		}
		if(zf.compareTo(max)>0) {
			max=zf;
		}
		printMax(xf,yf,zf,max);
		return max;
		
	}
	private static void printMax(Float xf, Float yf, Float zf, Float max) {
		System.out.printf("Max of %s ,%s and %s is %s \n",xf,yf,zf,max);
		
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
	//Method to print integer  values
	private static void printMax(Integer x, Integer y, Integer z, Integer max) {
		System.out.printf("Max of %s ,%s and %s is %s \n",x,y,z,max);

	}
}
