public class MultiplyStrings {
    public static String multiply(String nums1,String nums2){

        if(nums1.equals(0) || nums2.equals(0)) return "0";
                int result [] = new int[nums1.length() + nums2.length()];
        for(int i = nums1.length()-1;i>0;i--){
            for(int j = nums2.length()-1;j>0;j--){
               int mul = (nums1.charAt(i)-'0')*(nums2.charAt(j)-'0');
               int p1 = i+j;
               int p2 = i+j+1;
               int sum = mul + result[p2];
               result[p2] = sum % 10;
               result[p1] = sum /10;
         

    } 
        }
                   // Convert the result array into a string
                   StringBuilder sb = new StringBuilder();
                   for (int nums : result) {
                       // Skip leading zeros
                       if (!(sb.length() == 0 && nums == 0)) {
                           sb.append(nums);
                       }
                   }
                   return sb.toString();

    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "456";
        System.out.println("Product: " + multiply(num1, num2)); 
        System.out.println((10 ^ 12));
    }
    }
