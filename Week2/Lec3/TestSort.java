public class TestSort {
    /** Tests the sort method of the Sort class */
    public static void testSort(){
        String[] input = {"i", "have", "an", "egg"};
        String[] expected = {"an", "egg", "have", "i"};
        Sort.sort(input);

        for(int i = 0; i < input.length; i = i + 1){
            /** Can't directly use input[i] != expected[i] */

            /** input[i] != expected[i] checks if input[i] and expected[i] point to the same address */

            if(!input[i].equals(expected[i])){
                System.out.println("Mismatch in position " + i + ", expected:" + expected[i] + ", but got: " + input[i] + ";");
                break;
            }
        }
        /** Code above can be replaces by one-line code below */
        /*
        org.junit.Assert.assertArrayEquals(expected, input);
        */
        System.out.println("Your sort function works on this case");
    }
    public static void main(String[] args) {
        testSort();
    }
}