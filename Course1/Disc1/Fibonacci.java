public class Fibonacci{
	public static int fib(int n){
		if (n == 0){return 0;}
		else if (n == 1){return 1;}
		else{
			int prev_1, prev_2, sum;
			prev_1 = 0;
			prev_2 = 1;
			int index = 2;
			while(index <= n){
				sum = prev_1 + prev_2;
				prev_1 = prev_2;
				prev_2 = sum;
				index = index + 1;
			}
			return prev_2;
		}

	}

	public static void main(String[] args) {
		int n = 3;
		System.out.println(fib(n));
		n = 4;
		System.out.println(fib(n));
		n = 6;
		System.out.println(fib(n));
	}
}