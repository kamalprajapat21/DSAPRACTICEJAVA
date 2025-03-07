public class FunPrimeRange{
    public  boolean IsPrime(int n){
        if( n ==2){
            System.out.println("Number is prime");
            return true;
            
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
                
            }
            return true;
        }
    }
    
    public static void main(String[] args){
        Isprime(12);
      
    }
}