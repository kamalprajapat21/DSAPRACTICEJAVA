import java.util.*;

public class ifelse { // Improved class name

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        String category; // Declare variable for clarity

        switch (age) {
            case (0,1,2,3,4,5,6,7,8,9,10,11,12): // Inclusive range for child
                category = "Child";
                break;
            case (13,14,15,16,17,18): // Inclusive range for teenager
                category = "Teenager";
                break;
            case (19,20,21,22,23,24,25,26): // Inclusive range for young adult
                category = "Young Adult (Energistic)";
                break; // Explicit break to avoid fall-through
            default:
                category = "Adult"; // More specific default category
        }

        System.out.println("You are categorized as: " + category);
    }
}
