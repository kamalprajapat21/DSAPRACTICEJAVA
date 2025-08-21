class ArmStrongNumber {
    static boolean armstrongNumber(int n) {
        int len = String.valueOf(n).length();
        int temp = n;
        int res = 0;
        int x = 0;
        while(temp !=0){
            x = temp%10;
            temp = temp/10;
            res += Math.pow(x,len);
        }
        
        return res == n;
    }
}