// public class Fun07BinoryDecemal{
//     public static void main(String[] args){
//         System.out.println(BtoD(1001));

//         System.out.println(DtoB(5));




        
//     }

//     public static int BtoD(int bnum){
//         int pow = 0;
//         int decNum = 0;
//         while(bnum > 0){
//             int temp = bnum % 10;
//             decNum += temp * (int)Math.pow(2, pow);
//             bnum /= 10;
//             pow++;

            
//         }
//         return decNum;
//     }

//     public static int DtoB(int bnum){
//         int pow = 0;
//         int decNum = 0;
//         while(bnum > 0){
//             int temp = bnum % 2;
//             decNum += temp * (int)Math.pow(10, pow);
//             bnum /= 2;
//             pow++;

            
//         }
//         return decNum;
//     }
// }




public class Fun07BinoryDecemal{
    public  static void main(String[] args){
        System.out.print(BtoD(20));

    } 
    public static int BtoD(int bnum){
        int pow = 0;
        int decNum = 0;
        while(bnum > 0){
        // for(int i = 1;i<=bnum;i++){

        
        int ls = bnum % 2;
         decNum = decNum + (int)(ls*Math.pow(10,pow));
        pow++;
        bnum = bnum / 2;
        // System.out.print(decNum);
        }
        return decNum;
    }
}