import java.util.*;
public class reverseprint{
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("Eneter the number: ");
        int n = sc.nextInt();
        

        while(n > 0 ){
           int lastdigid = n%10;
           System.out.print(lastdigid);
           n = n/10;

           
        }
        System.out.println();
}
}