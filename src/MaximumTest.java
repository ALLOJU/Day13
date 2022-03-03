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
	public static<T extends Comparable<T>> void testMaximum(T... array) {
		T max = array[0];

		for(int i=0;i<array.length;i++)
		{
			if(array[i].compareTo(max)>0)
			{
				max=array[i];
			}


		}

		System.out.println("Maximum value is "+max);
	}


	public static void main(String[] args) {

		Integer intArray[]= {6,8,9,5};           // Test Case 1
		Float   floatArray[]= {6.5f,6.6f,4.5f,8.5f};     //Test Case  2
		String  stringArray[]= {"Apple","Grapes","Peach","Banana"};

		MaximumTest.testMaximum(intArray);
		MaximumTest.testMaximum(floatArray);
		MaximumTest.testMaximum(stringArray);
	}
}