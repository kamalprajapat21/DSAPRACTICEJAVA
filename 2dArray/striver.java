import java.util.*;
public class striver{

    public static int trappedwater(int A[]){
        int n = A.length;
        int left[]  = new int[n];
        int right[]  = new int[n];

        //left
         left[0]= A[0];
        for(int i = 1; i < n; i++){
            left[i] = Math.max(A[i],left[i-1]);

        }

        right[n-1] = A[n-1];
        for(int i = n-2;i>=0;i--){
            right[i] = Math.max(A[i],right[i+1]);
        }

        //trappedwater

        int trappedwater1 = 0;
        for(int i = 0;i<n;i++){
            int waterlevel = Math.min(left[i],right[i]);
            trappedwater1 += waterlevel - A[i];
        }
        return trappedwater1;
    }


    public static void main(String[] args){
int A[] = {3, 0, 1, 0, 4, 0, 2};

System.out.println(trappedwater(A));


    }
}





// import java.util.*;
// public class striver{
// public static int trappedwater(int nums[]){
//     int n = nums.length;
//     int left[] = new int[n];
//     int right[] = new int[n];


//     //left
    
// left[0]  = nums[0];
// for(int i = 1; i < n; i++){
//     left[i] = Math.max(left[i-1],nums[i]);
//     }

//     //right

//     right[n-1] = nums[n-1];
//     for(int i = n-2;i>=0;i--){
// right[i] = Math.max(right[i+1],nums[i]);
//     }

//     ///trappedwater
//     int trappedwater1 = 0;
//     for(int i =0;i<n;i++){
//         int waterlevel = Math.min(left[i],right[i]);

//         trappedwater1 += waterlevel - nums[i];
//     }
//     return trappedwater1;
    
// }

//     public static void main(String[] args){
// int nums[] = {1,2,5,9,6,7,2,3,4};
// System.out.println(trappedwater(nums));

//     }
// }