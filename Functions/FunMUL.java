public class FunMUL{
    public static int multiply(int a,int b){
        int mul = a*b;
        return mul;
    }


    public static int FActorial(int n ){
        if(n<0){
            System.out.println("Not Negative");
            return -1;
        }
        int f = 1;
        for(int i = 1;i<=n;i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String[] args){
        // int multy = multiply(4,5);
        // System.out.println(multy);
        int fact = FActorial(-4);
        System.out.println(fact);
    }
}