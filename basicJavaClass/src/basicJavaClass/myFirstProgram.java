/** 
 * 
 */
package basicJavaClass;

/**
 * @author RIA
 *
 */
public class myFirstProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.out.println("Printing the line using println keyword - Line 1");
		System.out.print("Printing the line \n using print keyword - Line 2\n");
		System.out.println("Printing the line using println keyword - Line 3");
		System.out.println("Printing the line using \\n keyword - Line 4");
		System.out.println(32313);
		System.out.print("Below are the sum of 20 and 10 - ");
		System.out.println(20+10);
		System.out.print("Below are the sub of 20 and 10 - ");
		System.out.println(20-10);


		/**
		 * String - stores text, such as "Hello". String values are surrounded by double quotes
		 * int - stores integers (whole numbers), without decimals, such as 123 or -123
		 * float - stores floating point numbers, with decimals, such as 19.99 or -19.99
		 * char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
		 * boolean - stores values with two states: true or false
		 * 
		 */

		System.out.println("---------------------------------------------------------");

		String roomType = "Delux";
		//int height = 10;
		//int width = 12;
		//int length = 14;
		int height, width, length;
		height = 10;
		width = 12;
		length = 14;
		float price = 10.5f;

		int x;
		x = 89;

		System.out.println("Here is the string:"+ roomType);
		System.out.println("Here are the integers:" + height +","+ width +","+ length);
		System.out.println("Here is the float:" + price);
		System.out.println("The carpet space of my room is : "+length * width);
		System.out.println("The carpet space of my room is : "+length * 19);
		System.out.println("Printing the value of X = "+ x);

		System.out.println("---------------------------------------------------------");
		int y = 5;
		System.out.println(y > 8 || y < 10);

	}

}
