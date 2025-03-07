public class BinaryAdditionManual {
    public static void main(String[] args) {
        String binary1 = "1010";
        String binary2 = "1101";
        
        String result = addBinary(binary1, binary2);
        System.out.println("Sum of " + binary1 + " and " + binary2 + " is: " + result);
    }

    public static String addBinary(String a, String b) {
     StringBuilder result = new StringBuilder();
     int carry = 0;
     int i = a.length()-1;
     int j = b.length()-1;

     while(i>=0 || j>=0){
        int sum = carry;

        if(i>=0) sum += a.charAt(i) - '0';
        if(j>=0) sum += b.charAt(j) - '0';

        result.append(sum % 2);
        carry = sum / 2;
        i--;
        j--;

     }
     if(carry != 0){
        result.append(carry);
    }
    return result.reverse().toString();
    }
}
