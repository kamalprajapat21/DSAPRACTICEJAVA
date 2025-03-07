import java.util.*;
public class Fun01{



   
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
// printHelloword();
// int sum = printsum(12,10);
int n =5;
// rottedstar(n);
floadtriagle2(n);
// System.out.println(prime(100));
// System.out.println(primerange(100));
// System.out.println(printsum(a,b));
    }
    public static void printHelloword(){
        System.out.println("HEllo Word!");
        int a = 4;
        int b = 48;
        int c = a;
        a = b;
        b = c;
        System.out.println(a);
        System.out.println(b);



    }


    public static int printsum(int a,int b){
        return a*b;
    }


    public static boolean prime(int n){
        boolean isPrime = true;
        for(int i =2;i<=n-1;i++){
            if(n%i==0){
                isPrime = false;
            }
        }
        return isPrime;
    }



// public static void primerange(int n){
//     for(int i = 2;i<=n;i++){
//         if(prime(i)){
//             System.out.print(i + " ");
// }
//     }
//     }



    ////rotedstart
    public static void rottedstar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void pyramindNumber(int n) {
        for (int i = 1; i <= n; i++) {
            int k = 1;
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(k);
                k++;
            }
           
            System.out.println();
        }
    }



    public static void floadtriagle(int n) {
        int k = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(k +" ");
                k++;
            }
           
            System.out.println();
        }
    }
    public static void floadtriagle2(int n) {

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if((i+j)%2 == 0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
           
            System.out.println();
        }
    }





    
    
    
}