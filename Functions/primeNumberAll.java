public class primeNumberAll{
    public static boolean primecheker(int n){
        if(n==1){
            System.out.println("1 is not prime or composite");
            return false;
            
        }
        if(n ==2){
            return true;
        }else{
            for(int i = 2;i<=n-2;i++){
                if(n%i==0){
                    return false;
                }
                }
                return true;
            }
        }

        public static void primerange(int n){
            for(int i = 2;i<=n;i++){
           
                if(primecheker(i)){
                    // count = count +1;
                    // System.out.print(count + " ");
                    System.out.print(" ");
                    System.out.print(i +" ");
                }
                
            }
        }

        public static void countprime(int n){
            int count = 0;
            for(int i = 1;i<=n;i++){
                if(primecheker(i)){
                    count = count +1;
                }

            }
            System.out.println(count);
        }
       

public static void main(String[] args) {
     primerange(10);
    countprime(10);
    // System.out.println(primerange(15));
}
}



