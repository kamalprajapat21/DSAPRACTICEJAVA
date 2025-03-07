import java.util.*;
public class primenumber{
    puclic static void primerange(int n){
        for(int i = 2;i<=n;i++){
            if
        }
    }
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(n == 2){
            System.out.println("n is prime number");
        }else{
            boolean isprime = true;
            for(int i = 2;i<=Math.sqrt(n);i++){
                if(n % i == 0){
                isprime = false;
            }
        }
        if(isprime == true){
            System.out.println("n is prime number");
        }else{
            System.out.println("n is not prime number");
        }
        }

    }
}