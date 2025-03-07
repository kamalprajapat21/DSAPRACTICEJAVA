// import java.util.Scanner;

// public class darray {
//     public static void printSpiral(int matrix[][]) {
//         int startRow = 0;
//         int startCol = 0;
//         int endRow = matrix.length - 1;
//         int endCol = matrix[0].length - 1;

//         while (startRow <= endRow && startCol <= endCol) {
//             // Top row
//             for (int j = startCol; j <= endCol; j++) {
//                 System.out.print(matrix[startRow][j] + " ");
//             }

//             // Right column
//             for (int i = startRow + 1; i <= endRow; i++) {
//                 System.out.print(matrix[i][endCol] + " ");
//             }

//             // Bottom row (only if more than one row remains)
//             if (startRow < endRow) {
                
//                 for (int j = endCol - 1; j >= startCol; j--) {
//                     System.out.print(matrix[endRow][j] + " ");
//                 }
//             }

//             // Left column (only if more than one column remains)
//             if (startCol < endCol) {
//                 for (int i = endRow - 1; i > startRow; i--) {
//                     System.out.print(matrix[i][startCol] + " ");
//                 }
//             }

//             startCol++;
//             startRow++;
//             endCol--;
//             endRow--;
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int matrix[][] = {
//             {1, 2, 3, 4},
//             {5, 6, 7, 8},
//             {9, 10, 11, 12},
            
//         };

//         printSpiral(matrix);
//     }
// }


import java.util.Scanner;

public class darray {
public static int diagonalsm(int matrix[][]){
    int sum = 0;
    for(int i = 0;i<matrix.length;i++){
        //pd
        sum += matrix[i][i];

        //sd
        if (i != matrix.length - i - 1) {
            sum += matrix[i][matrix.length - i - 1];
        }
    }
    return sum;

    /*public static void printSpiral(int matrix[][]) {
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length - 1;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Top row
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }

            // Right column
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }

            // Bottom row (only if more than one row remains)
            
                
                for (int j = endCol - 1; j >= startCol; j--) {
                    if (startRow == endRow){
                        break;
                    }
                    System.out.print(matrix[endRow][j] + " ");
               
            }

            // Left column (only if more than one column remains)
                for (int i = endRow - 1; i > startRow; i--) {
                    if (startCol == endCol) {
                        break;
                    }

                    System.out.print(matrix[i][startCol] + " ");
                }
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }*/
}

public static boolean findkey(int matrix[][],int key){
    for(int i = 0;i<matrix.length;i++){
        for(int j = 0;j<matrix[0].length;j++){
            if(matrix[i][j]==key);
            return true;
        }
    }
    return false;
}

public static boolean staircaseSearch(int matrix[][],int key){
    int row = 0,col = matrix[0].length-1;
    while(row<matrix.length && col>=0){
        if(matrix[row][col] == key){
            System.out.println("Key if Found at ("+ row+","+col+")");
            return true;
        }
        else if(key<matrix[row][col]){
            col--;
        }
        else{
            row++;
        }
    }
    System.out.println("Key not found");
    return false;
}
public static boolean staircaseSearch01(int matrix[][],int key){
    int row = matrix.length-1,col = 0;

    while(row>0 && col<=matrix[0].length){
        if(matrix[row][col] == key){
            System.out.println("Key if Found at ("+ row+","+col+")");
            return true;
        }
        else if(key<matrix[row][col]){
            row--;
        }
        else{
            col++;
        }
    }
    System.out.println("Key not found");
    return false;
}

    public static void main(String[] args) {
        int matrix[][] = {
            {1, 2, 3},
            {5, 6, 7},
           
            {9, 10, 11},
           
            
        };

        // printSpiral(matrix);
    //    int sum =  diagonalsm(matrix);
    //    System.out.println(diagonalsm(matrix));
    int key = 10;

    staircaseSearch01(matrix,key);
      /*if(staircaseSearch(matrix,key)){
        System.out.println("Key is found ");
      }else{
        System.out.println("Key not found");
      }
       System.out.println(findkey(matrix,key));
*/
       
    }
}
