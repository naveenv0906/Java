class Animal {
    void sound(){
        System.out.println("Animal makes a sound");
    }

    int height(int h){
         return h;
    }

    double height(double h){
        return h;
    }
}

class Cat extends Animal {
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Animal myAnimal=new Cat();
        myAnimal.sound();

        Animal myCatHeight = new Animal();
        System.out.println(myCatHeight.height(10));
        System.out.println(myCatHeight.height(10.7));
    }
}