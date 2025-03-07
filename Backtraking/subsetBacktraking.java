public class subsetBacktraking{
    // public static void setbacktaking(String str,String ans,int i){
    //     // StringBuilder ans = new StringBuilder();
    //     if(i==str.length()){
    //         if(ans.length() == 0){
    //             System.out.print("null");
    //         }else{
    //             System.out.println(ans);
    //         }
    //         return;

    //     }
    //     setbacktaking(str,ans+str.charAt(i),i+1);
    //     setbacktaking(str,ans,i+1);
    // }
    public static void Permutation(String str,String ans){
        // StringBuilder ans = new StringBuilder();
        if(str.length() == 0){
           System.out.println(ans);
           return;
            }

           for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            String Newstr = str.substring(0,i) + str.substring(i+1);
            Permutation(Newstr,ans+ch);
           }
        }




        
    
    public static void main(String[] args) {
        String str = "abc";
        // setbacktaking(str,"",0);
        Permutation(str,"");

    }
}
