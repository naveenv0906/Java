class Student {
    String name;
    Student(String name){         // Constructor
        this.name=name;
    }

    void display(){
        System.out.println("Student name: "+name);
    }
}

public class Constructor{
    public static void main(String[] args){
        Student s1 =new Student("java");  // Constructor is called automatically
        s1.display();
    }
}