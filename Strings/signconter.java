public class signconter{
    public static int signCounterfind(String[] str){
        int count = -1;
      
            for(String star:str)
            switch(star){
                case "X++":case "++X":
                count++;
                break;
                default:
                count--;
            }
            return count;
        
    }
    public static void main(String[] args) {
        String[] str = {"++X", "++X", "++X"};
        System.out.println(signCounterfind(str)); 
    }
}
    
