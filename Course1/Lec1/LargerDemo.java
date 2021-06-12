/*
public class LargerDemo {
    public static int larger(int x, int y) {
        if (x > y) {
            return x;
        }
        return y;
    }

    public static void main(String[] args) {
        System.out.println(larger(8, 10));
    }
}
*/
public class LargerDemo{
	public static int larger(int x, int y){
		if(x < y){
			return y;
		}
		else{
			return x;
		}
	}

	public static void main(String[] args) {
        System.out.println(larger(8, 10));
    }
}