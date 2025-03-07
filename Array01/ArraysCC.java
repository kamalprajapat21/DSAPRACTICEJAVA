import java.util.*;

public class ArraysCC {
    public static int update(int marks[], Integer non) {
        non = 10; // Update non to 10
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1; // Increment each element in marks by 1
        }
        return non;
    }


    public static int ArraySearch(int marks[], int key) {
        int start = 0; int end = marks.length;
        while(start <= end){
            int mid = (start+end)/2;
            if(marks[mid] == key){
                return mid;
            }
            if(marks[mid]<key){
                start = mid +1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
    // 

    

    public static int largest(int marks[]) {
        int ls = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;


        for (int i = 0; i < marks.length; i++) {
            if(ls < marks[i]){
                ls = marks[i];
            } // Increment each element in marks by 1
            if(small > marks[i]){
                small = marks[i];
            }
        }
        System.out.println("smallest number is :" + small);
        return 0;
    }

    // public static int smallest(int marks[]) {
    //     int ls = Integer.MAX_VALUE;

    //     for (int i = 0; i < marks.length; i++) {
    //         if(ls > marks[i]){
    //             ls = marks[i];
    //         } // Increment each element in marks by 1
    //     }
    //     return ls;

    public static void reverseArray(int marks[]) {
        int start = 0;
        int end = marks.length-1;
        while(start < end) {
int temp = marks[marks.length-1];
marks[marks.length-1] = marks[start];
marks[start] = temp;

start++;

end--;

            



           
        }
        // return marks;
    }


    public static void ArrayPair(int marks[]) {
        int tp = 0;
        for(int i = 0;i<marks.length;i++){
           int curr = marks[i];
        for(int j= i;j<marks.length;j++){
System.out.print("(" + curr +","+marks[j]+") ");
tp++;

        }
        System.out.println();
       }
       System.out.print("total pair is = "+tp);
        
            



           
        }


        public static void SubArray(int marks[]) {
            // int tp = 0;
            for(int i = 0;i<marks.length;i++){
               int start = i;
               for(int j = i;j<marks.length;j++){
                int end = j;
               
            for(int k= start;k<=end;k++){
    System.out.print(marks[k] +" ");
    
            }
            System.out.println();
            
    
            }
            System.out.println();            System.out.println();

           }
        }
        //    System.out.print("total pair is = "+tp);
            
                
    
    
    
               
            
        // return marks;
    
        public static void SubArraySum(int marks[]) {
            // int tp = 0;
            int curr = 0;
            int max = Integer.MIN_VALUE;
            for(int i = 0;i<marks.length;i++){
               int start = i;
               for(int j = i;j<marks.length;j++){
                int end = j;
                curr = 0;
               
            for(int k= start;k<=end;k++){
                curr =curr+ marks[k];
               
                }
    System.out.println( curr);
    
            }
            System.out.println(curr);
            if(max < curr){
                max = curr;
            
    
            }
           

           }
           System.out.println("max sum is : "+max);
        }


        public static int trappedRainwater(int height[]){
            int n = height.length;
            //left
            int leftMax[] = new int[n];
            leftMax[0] = height[0];
            for(int i = 1;i<n;i++){
                 leftMax[i] = Math.max(height[i],leftMax[i-1]);
            }

            int rightMax[] = new int[n];
            rightMax[n-1] = height[n-1];
            for(int i =n-2;i>=0;i--){
                rightMax[i] = Math.max(height[i],rightMax[i+1]);
            }
            int trappedwater = 0;
            for(int i = 0;i<n;i++){
                int waterlevel = Math.min(leftMax[i],rightMax[i]);
                 trappedwater += waterlevel-height[i];
            }
            return trappedwater;
        }


        
    // Function to find if there exists a quadruplet in the array A[] which sums up to X.
    public static boolean find4Numbers(int A[], int n, int X) {
        Arrays.sort(A); // Sort the array
        
        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int remainingSum = X - A[i] - A[j];
                int start = j + 1;
                int end = n - 1;
                
                while (start < end) {
                    if (A[start] + A[end] == remainingSum) {
                        return true;
                    } else if (A[start] + A[end] < remainingSum) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return false; // No quadruplet found
    }
    public static void reverseArray12(int[] A) {
        int n = A.length;
        for (int i = 1; i < n; i++) {
            int temp = A[0];
            A[i-1] = A[i];
            A[n - 1] = temp;
        }
    }

    // public static int factorial(int n){
    //     if(n == 1 || n ==0){
    //         return 1;
    //     }
    //     int fn = n * factorial(n-1);
    //     return fn;
       
    // }

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fn = n * factorial(n - 1);
        return fn;
    }

    public static int bibonacy(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        int fn = bibonacy(n - 1) + bibonacy(n-2);
        return fn;
    }


    public static int lastOccurence(int arr[], int key, int i) {
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccurence(arr, key, i + 1);
        if (isFound != -1) {
            return isFound;
        }
        if (key == arr[i]) {
            return i;
        }
        return -1;
    }
    
    
    // public static int lastOccurence(int arr[], int key, int i) {
    //     // reverseArray12(arr);

    //     if (i == arr.length) {
    //         return -1;
    //     }
       
    //     if (arr[i]== key) {
    //         return i;
    //     }
    //     return lastOccurence(arr,key,i+1);
    // }
    
public static int power(int x,int n){
    if(n == 1){
        return x;
    }
int npm1 = power(x,n-1);
int np = x*npm1;
return np;
}

public static int issorted(int A[],int n){
    if(n == 1){
        return 1;
    }
    return (A[n-1]<A[n-2])?0:issorted(A,n-1);
}

 public static void main(String[] args) {
    
        int arr[] = {1,2,3,4,2,5};
        int n = arr.length;
        System.out.print("is Sorted "+ issorted(arr,n));
        // reverseArray(arr);
// int n = 25;

// System.out.print(factorial(n));
// System.out.print(bibonacy(n));
// System.out.print(lastOccurence(arr,2,2));
// System.out.println(power(2,8));
        
        
        // Print the reversed array
        // for (int i : A) {
        //     System.out.print(i + " ");
        // }        
        // int n = A.length;
        // int X = 0;

        // System.out.println(largest(marks));
    }
}
