public class Method {

    public int add(int a,int b){
        return(a+b);
    }
    
    public static void main(String[] args) {
        Method obj = new Method();
        obj.add(10, 10);
        int result=obj.add(20,40);
        System.out.println(result);
    }
}
