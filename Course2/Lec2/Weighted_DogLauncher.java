public class Weighted_DogLauncher {
    public static void main(String[] args) {
        /** Declaration of a variable */
        Weighted_Dog d;
        /** Instantiation of the class as a class object and assignment to d */
        d = new Weighted_Dog(15);
        /** Invocation of a non-static method */
        d.makeNoise();
        System.out.println("Its maximum age is " + d.max_age);
        System.out.println("Maximum age for general dog is " + Weighted_Dog.max_age);
        Weighted_Dog d2 = new Weighted_Dog(100);
        d2.makeNoise();
        System.out.println("Its maximum age is " + d2.max_age);

        /** Compare two dogs using static method */
        Weighted_Dog bigger = Weighted_Dog.maxDog(d,d2);
        bigger.makeNoise();
        System.out.println("The bigger dog has weight: " + bigger.weightInPounds);
        /** Compare two dogs using non-static method */
        Weighted_Dog bigger2 = d.maxDog(d2);
        bigger2.makeNoise();
        System.out.println("The bigger dog has weight: " + bigger2.weightInPounds);

    }
}