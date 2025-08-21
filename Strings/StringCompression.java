public class StringCompression {
    public static String compression(String str) {
        // Initialize the result string with the first character
        StringBuilder s = new StringBuilder();
        // s.append(str.charAt(0)); // Start with the first character
        int count = 1;
        
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                // Append the current character if it's different from the previous one
                // s.append(str.charAt(i));
                count++;
            }else {
                s.append(str.charAt(i-1));
                if(count>1){
                    s.append(count);
                }
                count =1;
            }
        }
        s.append(str.charAt(str.length()-1));
        if(count>1){
            s.append(count);
        }
        return s.toString(); // Return the compressed string
    }
    
    public static void main(String[] args) {
        String str = "aaabbbcccdddsssaa";
        System.out.println(compression(str));
    }
}
