public class reduceString{
    public static void extend(String str){
       int i,j,k;
       StringBuffer output = new StringBuffer();
       for( i = 0;i<str.length();i++){
        char ch = str.charAt(i);
        int n = ch -'0';
       

       StringBuffer temp = new StringBuffer();
       for( j = i+2;j<str.length() && str.charAt(j)!=')';j++){
        temp.append(str.charAt(j));
       }

       if(j >= str.length()){
        System.out.println("Invalid input string");
        return;
    }

       for( k = 1;k<=n;k++){
output.append(temp);
       }
       i = j;


    }
    System.out.println(output);
}
    public static void main(String []args){
String str = "3(ab)2(v55f)km)";
extend(str);
    }
}