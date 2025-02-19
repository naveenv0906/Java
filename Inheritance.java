class Animal {
    void sound(){
        System.out.println("Animal make sound ");
    }
}

class Dog extends Animal {
    void bark(){
        System.out.println("dog barks");
    }
}

public class Inheritance {
    public static void main(String args[]){
        Dog myDog = new Dog();
        myDog.sound();
        myDog.bark();
    }
}
