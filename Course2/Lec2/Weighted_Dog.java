public class Weighted_Dog {
    /** belows are two instance variables */
    public int weightInPounds;
    /** static variables are not declear with new instance */
    public static int max_age = 10;

    /** Constructor */
    /** Similar to def __init__(...) function in python */
    public Weighted_Dog(int w){
        weightInPounds = w;
    }
    /** Non-static(Instance) Method: invoked by an instance of the class */
    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yipyipyip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark. bark.");
        } else {
            System.out.println("woof!");
        }
    }
    /** This method is a static method */
    public static Weighted_Dog maxDog(Weighted_Dog d1, Weighted_Dog d2){
        if(d1.weightInPounds > d2.weightInPounds){ return d1;}
        return d2;
    }

    /** This method is a non-static method */
    public Weighted_Dog maxDog(Weighted_Dog d2){
        if(this.weightInPounds > d2.weightInPounds){return this;}
        return d2;
    }
}