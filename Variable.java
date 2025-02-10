public class Variable {
    static int age=0;                            // static variable
    String name = "java";                        // instance variable
    public static void Innervariable() {
        System.out.println(age=9);
    }
    public static void main(String[] args) {
        int num = 10;                            // local variable
        System.out.println(num);
        System.out.println(age);
        Variable v = new Variable();
        System.out.println(v.name);

        Innervariable();
        
    }
    
}
