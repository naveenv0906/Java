abstract class Payment {
    double amount;

    Payment(double amount){
        this.amount = amount;
    }

    abstract void processPayment();

    void transactionDetails(){
        System.out.println("Transaction amount "+amount+" processed");
    }
}


class Gpay extends Payment {
    private String gpayNumber;

    Gpay(double amount, String gpayNumber){
        super(amount);
        this.gpayNumber=gpayNumber;
    }

    @Override
    void processPayment() {
        System.out.println("gpay: "+amount);
        transactionDetails();
    }
}


class PhonePay extends Payment {
    private String phonePayNumber;

    PhonePay(double amount, String phonePayNumber){
        super(amount);
        this.phonePayNumber=phonePayNumber;
    }

    @Override
    void processPayment() {
        System.out.println("phonePay"+amount);
        transactionDetails();
    }
}

public class Abstraction {
    public static void main(String[] args){
        Payment payment1 = new Gpay(100.00,"gpay-123");
        payment1.processPayment();

        Payment payment2 = new PhonePay(50.00,"phonepay-123");
        payment2.processPayment();
    }
}