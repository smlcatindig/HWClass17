package class17;

public class Cat {
    String name;

    Cat(String name, String color) {
        System.out.println("2 argument constructor called");
    }
    Cat(int age){
        System.out.println("Int argument constructor");
    }
    Cat(double weight){
        System.out.println("Double argument constructor");
    }
    Cat(){
            System.out.println("0 argument constructor called");
        }
    void printInfo(){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Cat cat=new Cat("Kitty", "brown");
       // cat.printInfo();

    }
}
