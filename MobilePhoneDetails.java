public class MobilePhoneDetails {
    String brand;
    String model;
    int price;

    MobilePhoneDetails(String brand, String model, int price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    public void display(){
        System.out.println("mobile phone brand is: "+brand);
        System.out.println("mobile phone model is: "+model);
        System.out.println("mobile phone price is: "+price);
    }

    public static void main(String[] args){
        MobilePhoneDetails obj=new MobilePhoneDetails("Samsung","A34 5G " , 31000);
        obj.display();
    }
}
