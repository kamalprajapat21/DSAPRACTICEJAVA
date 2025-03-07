    
    public class insertionsort {

        public static void insertionsorting(int[] arr) {
            for (int i = 1; i < arr.length; i++) {
                int curr = arr[i];
                int pre = i - 1;
    
                
                while (pre>= 0 && arr[pre] > curr) {
                    arr[pre+ 1] = arr[pre];
                    pre= pre- 1;
                }
                arr[pre+ 1] = curr;
            }
        }
    
        public static void main(String[] args) {
            int[] arr = {12, 11, 13, 5, 6, 7};
            insertionsorting(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    
    }

    
    

