import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        
        //cheked eception
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = scan.nextInt();
        try {
            int num = Integer.parseInt("java");
        } catch (NumberFormatException e) {
            System.out.println("invalid number format");
        } finally {
            System.out.println("operation success , patient dead");
        }



        if (age < 18) {
            throw new IllegalArgumentException("age must be 18 or above");
        }
        System.out.println("Access granted");


        //uncheked exception
        int a=10;
        int b=0;
        System.out.println(a/b);

    }
}
