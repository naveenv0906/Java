public class ControlFlow {
    public static void main(String[] args) {
        int number = 0;
         
        // if-else if-else 
        if (number>0){
            System.out.println("positive");
        } else if (number<0){
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }


        // switch case 
        switch (number) {
            case 0:
                System.out.println("case 0 works");
                break;
            
            default:
                System.out.println("not found");
                break;
        }

        //for Loop
        for (int i=0;i<=5;i++){
            System.out.println(i);
        }

        //while Loop
        int n=1;
        while (n<=5) {
            System.out.println("while loop");
            System.out.println(n);
            n++;
        }

        //do-while Loop
        int num = 10;
        do {
            System.out.println("do while loop");
            System.out.println(num);
            num++;
        } while (num<=5) ;

        //Branching Statement
        //break
        System.out.println("break");
        for (int j=0; j<=5;j++){
            if(j==3){
                break;
            }

            System.out.println("iteration"+ j+" "+j);
        }

        //continue
        System.out.println("continue");
        for (int k=0; k<=5;k++){
            if(k==3){
                continue;
            }

            System.out.println("iteration"+k+" "+k);
        }
    }
}
