public class ArgsDemo {
    /** Prints out the 0th command line arguement. */
    public static void main(String[] args) {
        System.out.println("Start printing out args: ");
        for(int i = 0; i < args.length; i = i + 1) {
            System.out.println(args[i]);
        }
    }
}