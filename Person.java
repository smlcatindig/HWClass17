package class17;

public class Person {
    /* write a java class that will have a constructor: one with parameters and second without
    any parameters. Create a separate Test class where you will execute both of the constructors 1 by 1
     */
    String name;
    Person(){
        System.out.println("No argument constructor");
    }
    Person(String personName){
        name=personName;
        System.out.println("1 argument constructor");
    }
}
