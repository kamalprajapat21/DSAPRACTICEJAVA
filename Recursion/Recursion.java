class Recursion{

   public static void printName(int n,int i){
    if(i>n)return;
    System.out.println("Hello World " + i);
    printName(n, i + 1);

   }
   public static void main(String[] args) {
      int n = 5; // Change this value to print more or fewer times
      printName(n, 1);
   }
}

