public class inverString{
    public static void reverseString(String str){
        StringBuilder sb = new StringBuilder("");
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        System.out.println(sb.toString());
    }
    public static void main(String []args){
String str = "kamal prajapat";
reverseString(str);
    }
}