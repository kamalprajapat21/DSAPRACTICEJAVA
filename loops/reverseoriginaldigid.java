import java.util.*;

public class reverseoriginaldigid {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int n = sc.nextInt();
    int reverse = 0;

    while (n > 0) {
      int lastDigit = n % 10;
      reverse = (reverse * 10) + lastDigit;
      n = n / 10;
    }

    System.out.println("Reversed number: " + reverse);
  }
}
