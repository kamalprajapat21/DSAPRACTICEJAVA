import java.util.*;

public class Fun04 {
   
    public static int factorial(int n) {
                
        if( n < 0){
            System.out.println("Eneter only Positive value");
            return -1;
        }else if(n == 0 || n==1){
            System.out.println("factorial is "+"1");
            return 1;
        }else{
            int fact = 1;
            for(int i = 2;i<=n;i++){
                fact *=i;
            }
            return fact;
        }
    }


    public static void main(String[] args) {
        
        System.out.println(factorial(5));
    }
}

