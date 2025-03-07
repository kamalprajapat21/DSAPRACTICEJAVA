


// ////////USING 2D ARRAY START///////
// public class gridbasedproblem{
//     public static int numberOfWays(int i,int j,int r,int c,int A[][]){
//         //base case1
//         if(i >= r || j >= c){
//             return 0;
//         }
//         if (A[i][j] == 1) {  // Obstacle encountered
//             return 0;
//         }
//         if(i == r-1 && j == c-1){
//             return 1;
//         }
//         return numberOfWays(i+1,j,r,c,A) + numberOfWays(i,j+1,r,c,A);
//     }
//     public static void main(String args[]){
//         {
//             int[][] A
//               = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
        
//             System.out.print("number of ways"+ numberOfWays(0,0,A.length,A[0].length,A));
//           }
//     }
// }


// //////////////////////////UISNG 2D ARRAY END///////



// ////////////////////USING ARRRAYLIST START///////////
// import java.util.*;

// public class gridbasedproblem{
//     public static int numberOfWays(int i,int j,int r,int c,ArrayList<ArrayList<Integer>> A){
//         //base case1
//         if(i >= r || j >= c){
//             return 0;
//         }
//         if (A.get(i).get(j) == 1) {  // Obstacle encountered
//             return 0;
//         }
//         if(i == r-1 && j == c-1){
//             return 1;
//         }
//         return numberOfWays(i+1,j,r,c,A) + numberOfWays(i,j+1,r,c,A);
//     }
//     public static void main(String args[]){
//         {
//             // int[][] A
//             //   = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
//               ArrayList<ArrayList<Integer>> A = new ArrayList<>();
//               A.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
//         A.add(new ArrayList<>(Arrays.asList(0, 1, 0)));
//         A.add(new ArrayList<>(Arrays.asList(0, 0, 0)));
              
//               int r1 = A.size();
//               int c1 = A.get(0).size();
//             System.out.print("number of ways"+ numberOfWays(0,0,r1,c1,A));
//           }
//     }
// }

// //////////////////////////ARRAYLIST END///////////////

// public class gridbasedproblem{

//     public static int fact(int n){
//         if(n == 0 || n==1){
//             return 1;
//         }
//         return n*fact(n-1);
//     }
//     public static int numberOfWays(int r,int c,int A[][]){
//         // int c1 = fact(r-1 + c-1);
        
//         // int c2 = fact(r-1);
//         // int c3 = fact(c-1);
//         return fact(r-1 + c-1)/(fact(r-1)*fact(c-1));
//         // return c1/(c2*c3);
//     }
//     public static void main(String args[]){
//         {
//             int[][] A
//               = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
        
//             System.out.print("number of ways "+ numberOfWays(A.length,A[0].length,A));
//           }
//     }
// }