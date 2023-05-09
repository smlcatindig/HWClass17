package class17;

import javax.imageio.stream.ImageInputStream;

public class Iphone {
    String make;
    String model;
    int storage;
    double price;

    public Iphone(String make, String model, int storage, double price) {
        this.make = make;
        this.model = model;
        this.storage = storage;
        this.price = price;

        }
    void mobile(){
        System.out.println(make+" "+model+" "+storage+" "+price);
    }
    public static void main(String[] args) {
        Iphone phone=new Iphone("USA","new",64,898.90);
        phone.mobile();
    }
    }

