public class signconter{
    public static int signCounterfind(String[] str){
        int count = -1;
        // for(int i = 0;i<str.length;i++){
            // if (str.equals("++X") || str.equals("X++")) {
            //     count++;
            // }
            // if (str.equals("--X") || str.equals("X--")) {
            //     count--;
            // }else{
            //     return count;
            // }
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
    
