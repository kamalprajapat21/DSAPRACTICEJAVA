import java.util.*;
public class Fun02{
   
    public static void printHelloword(){
        System.out.println("HEllo Word!");
        System.out.println("HEllo Word!");
    
        System.out.println("HEllo Word!");
    
    }

    public static void calculatesum(int num1,int num2){
         num1=2;
         num2=4;
        int sum = num1+num2;
        System.out.println(sum);
    //   return sum;

    }
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum01 =calculatesum();
        // System.out.println(sum01);
        int a = calculatesum();
        System.out.println(a);   
    }
}