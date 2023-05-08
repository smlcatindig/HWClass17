package class17;

public class HWTask2Constructors {
    /* Write a java class that have 4 constructors with 4 different access levels of constructors
    (private,public,default,protected)
    and create 4 objects of this class: 1 - inside same class;
    2 - from outside the class; 3 - from different class inside different package and observe result.
     */

    String product;
    int price;
    boolean isFemale;
    char code;

    private HWTask2Constructors(String product){
        this.product=product;

    }
    public HWTask2Constructors(int price){
        this.price=price;
    }

    HWTask2Constructors(boolean isFemale){
        this.isFemale=isFemale;
    }

    protected HWTask2Constructors(char code){
        this.code=code;
    }

    public static void main(String[] args) {
        HWTask2Constructors obj1=new HWTask2Constructors("Perfume"); // private


    }
}
