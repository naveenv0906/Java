public class DataType {
    public static void main(String[] args) {

        //  primitive data type 
        byte var1 = 127;
        short var2 = 7332;
        int var3 = 32332;
        long var4 = 643823;
        float var5 = 33.43f;
        double var6 = 23.423432;
        char var7 = 'A';
        boolean var8 = false;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8);

        // non-premitive typr
        String var9 = "java";
        System.out.println(var9);
        
        int[] var10 = {1,2,3,4,5};
        for (int num : var10){
            System.out.println(num);
        }
        // class and objects  Eg: Car myCar = new Car("Toyota", 180);

    }
}