public class candyCrush{
    public static void candyCrushsol(String str){
        StringBuffer sb = new StringBuffer(str);
        // for(int i = 0;i<str.length() -1;i++){
        int i = 0;
            while(i<sb.length()-1){
           char ch1 = sb.charAt(i);
           char ch2 = sb.charAt(i+1);
           if(ch1 == ch2){
            sb.delete(i,i+2);
            if(i !=0){
                i--;
                continue;
            }
        }else{

                i++;
            }
           }
           
        
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        candyCrushsol("DooDle");
    }
}
