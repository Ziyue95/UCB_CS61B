import java.util.Arrays;

public class SmallestElementofArrayfromk{
	public static int mystery(int[] inputArray, int k){
		int x = inputArray[k];
		int answer = k;
		int index = k + 1;
		//inputArray.length returns the length of inputArray
		while(index < inputArray.length){
			if(inputArray[index] < x){
				x = inputArray[index];
				answer = index;
			}
			index = index + 1;
		}
		return answer;
	}

	public static void sortArray(int[] inputArray){
		int index = 0;
		while(index < inputArray.length){
			int targetIndex = mystery(inputArray,index);
			int temp = inputArray[targetIndex];
			inputArray[targetIndex] = inputArray[index];
			inputArray[index] = temp;
			index = index + 1;
		}
	}

	public static void main(String[] args) {
		int[] inputArray = {3,0,4,6,3};
		int k = 2;
		int num = mystery(inputArray,k);
		System.out.println(num);
		// int k has been defined before, no need to specify the type again
		k = 0;
		num = mystery(inputArray,k);
		System.out.println(num);
		sortArray(inputArray);
		/*
		first transform int array to string using Arrays.toString;
		then print out string using System.out.println
		*/
		System.out.println(Arrays.toString(inputArray));
	}
}