public class invertedstart{
    public static void main(String[]args){
        int n = 4;
        char ch = 'A';
        for(int line =1;line<=n;line++){
            for(int star = 1;star<=n-line+1;star++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
