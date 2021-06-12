import java.util.Arrays;

public class ClassNameHere{
	/** Returns the maximum value from m. */
	public static int max(int[] m){
		if(m.length == 0){return 0;}
		else{
			int index = 1;
			int max_item = m[0];
			while(index < m.length){
				if(max_item < m[index]){
					max_item = m[index];
				}
				index = index + 1;
			}
			return max_item;
		}
	}
	/** Returns the maximum value from m using a for loop. */
	public static int forMax(int[] m) {
		int max_item = m[0];
		for(int i = 1; i < m.length; i = i + 1){
			if(max_item < m[i]){
				max_item = m[i];
			}
		}
		return max_item;
	}
	/** Uses a while loop to sum a. */
	public static int whileSum(int[] a) {
		int index = 0; //initialization
		int sum = 0;
		while (index < a.length) { //termination
			sum = sum + a[index];
			index = index + 1; //increment
		}
		return sum;
	}
	/** Uses a basic for loop to sum a. */
	public static int forSum(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i = i + 1){
			sum = sum + a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		//One way to define Array: Initial
		int[] numbers = new int[3];
		numbers[0] = 4;
		numbers[1] = 7;
		numbers[2] = 10;
		System.out.println(Arrays.toString(numbers));
		System.out.println("max using while loop is:" + max(numbers));
		System.out.println("max using for loop is:" + forMax(numbers));
		System.out.println("sum of item using while loop is:" + whileSum(numbers));
		System.out.println("sum of item using for loop is:" + forSum(numbers));
		//Another way to define Array
		numbers = new int[]{2, 6, 11};
		System.out.println(Arrays.toString(numbers));
		System.out.println("max using while loop is:" + max(numbers));
		System.out.println("max using for loop is:" + forMax(numbers));
		System.out.println("sum of item using while loop is:" + whileSum(numbers));
		System.out.println("sum of item using for loop is:" + forSum(numbers));
	}
}