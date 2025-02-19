class Car {
    String brand;
    int speed;

    void display(){
        System.out.println(brand);
        System.out.println(speed);
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.brand = "bmw";
        myCar.speed = 120;

        myCar.display();
    }
}
