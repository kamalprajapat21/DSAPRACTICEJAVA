import java.util.Arrays;

public class Onedarray {

    public static int print2largest(int arr[]) {
        // Sort the array in descending order
        Arrays.sort(arr);
if(arr[i]==arr[i-1]){
    Arrays.remove(arr[i])
}
        // Reverse the array to get the elements in descending order
        int temp;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Check if the array has at least two elements
        if (arr.length < 2) {
            return -1; // Handle case with less than 2 elements
        }

        // Return the second element as the second largest
        return arr[1];
    }

    public static v28, 43, 26, 65, 60, 54, 51, 35, 42, 48, 33, 40, 58, 38, 64, 47, 44, 49, 46, 25, 57, 39, 55, 45, 29, 32, 61, 53, 31, 36, 56, 63, 30, 52, 27, 34, 50, 41, 37, 66, 62, 59 oid main(String[] args) {
        int arr[] = {};
        int secondLargest = print2largest(arr);


        if (secondLargest == -1) {
            System.out.println("Array has less than 2 elements");
        } else {
            System.out.println("Second Largest element: " + secondLargest);
        }


    }
}