// import java.util.Arrays;
import java.util.*;

// import java.util.Collections;
public class bubblesort{

    public static void bubblesortarray(int array[]){
        int swap = 0;
for(int turn = 0;turn<array.length-1;turn++){
    for(int j = 0;j<array.length-1-turn;j++){
        if(array[j]>array[j+1]){

            int dummy = array[j];
            array[j] = array[j+1];
            array[j+1] = dummy;
            swap++;
        }
    }
}
if(swap==0){
    System.out.println("Array already sorted !");
}
    }

    public static void writtenarray(int array[]){
        for(int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

    }
    public static void insertionsort(int array[]) {
        for (int i = 1; i < array.length; i++) {
            int curr = i;
            int pre = i - 1;
            while (array[pre] > array[curr] && pre >= 0) {
                array[pre + 1] = array[pre];
                pre--;
            }
            array[pre + 1] = array[curr];
        }
    }
array[pre+1] = array[curr];
            
        }
    

    public static void writtenarray01(Integer array[]){
        for(Integer i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

    }

    public static boolean duplicateelements(int array[],int k,int n){
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                int range = k;
                if(array[i]==array[j]){
                    return true;

                }
            }
        }
        return false;
    }

    public static void selectionsort(int array[]){
        for(int i = 0;i<array.length-1;i++){
            int minPos = i;
            for(int j = i+1;j<array.length;j++){

               if(array[minPos]> array[j]){
                minPos=j;
               }
}
int temp = array[minPos];
array[minPos] = array[i];
array[i]=temp;


            }
        }
        public static void bubblesort(int array[]){
            for(int i = 0;i<array.length-1;i++){
               
                for(int j = 0;j<array.length-i-1;j++){
    
                   if(array[j]> array[j+1]){
                   
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1]=temp;
                   }
    }
   
    
    
                }
            }
       

        
    
    public static void main(String[] args){
        int[] array = { 10, 5, 3, 10, 10, 5, 6 };

        insertionsort(array);
        System.out.print("Sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    // int n = array.length;
    // if (duplicateelements(array, n, 2)) {
    //   System.out.print("Yes");
    // }
    // else {
    //   System.out.print("No");
    // }
  }
}
    