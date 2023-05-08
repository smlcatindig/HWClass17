package class17;

public class DogTester {
    public static void main(String[] args) {
        /* below code will create the object of the Dog class

         */

        Dog dog1 = new Dog("Jack", "black", "persian", 12);
        Dog dog2 = new Dog("Shaggy", "white", "huskey", 8);
        Dog dog3 = new Dog("Pepper", "brown", "british", 7);
        Dog dog4 = new Dog("Charlie", "grey", "shihtzu", 6);
        Dog dog5 = new Dog("Kelly", "mix", "maltese", 3);

        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        dog4.printInfo();
        dog5.printInfo();


    }
}
