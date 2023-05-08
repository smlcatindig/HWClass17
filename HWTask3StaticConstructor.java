package class17;

public class HWTask3StaticConstructor {
    /* Write program that have static constructor
    and observe result.

     */
    String product;
    double price;
    int value;

    static HWTask3StaticConstructor(String product, double price, int value){
        this.product=product;
        this.price=price;
        this.value=value;

        void printInfo(){
            System.out.println(product+" "+price+" "+value);

            // error
        }
    }
}
