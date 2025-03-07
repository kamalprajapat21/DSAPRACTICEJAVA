


public class hollowrectangle {
    public static void main(String[] args) {
        // holorec(6, 6);
        // holorec02(6);
        // leftstartprint(4);
        // counting(4);
        // FloadTriagle(4);
        // tringle01(6);
        // butterfly(6);
        // rombug(5);
        // rombughollow(5);
        // Star(4);
        // Star1(5);
        pallaldrom(5);

    }

    public static void holorec(int n, int m) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void holorec02(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                // if (i == 1 || i == n || j == 1 || j == m) {
                    System.out.print("*");
                } 
                    // System.out.print(" ");
                    System.out.println();
                }
            }


            public static void leftstartprint(int n){
                for(int i = 1;i<=n;i++){
                    for(int j = 1;j<=n-i;j++){
                        System.out.print(" ");
                    }
                    for(int j = 1;j<=i;j++){

                        System.out.print("*");
                    }
                    System.out.println();
                }
            }


            public static void counting(int n){
                for(int i = 1;i<=n;i++){
                    for(int j = 1;j<=n-i+1;j++){
                        System.out.print(j +" ");
                    }
                    System.out.println();
                }
            }

            public static void FloadTriagle(int n){
                int count = 1;
                for(int i = 1;i<=n;i++){
                    for(int j = 1;j<=i;j++){
                        System.out.print(count +" " );
                        count= count+1;
                    }
                    System.out.println();
                }
            }

            public static void tringle01(int n){
                for(int i = 1;i<=n;i++){
                    for(int j = 1;j<=i;j++){
                        if((i+j)%2==0){
                            System.out.print(" 1 ");
                        }else{
                            System.out.print(" 0 ");
                        }
                    }
                    System.out.println();
                }
            }



            public static void butterfly(int n){
                for(int i = 1;i<=n;i++){
                    for(int j = 1;j<=i;j++){
                        System.out.print("*");

                    }
                    for(int j = 1;j<=2*(n-i);j++){
                        System.out.print(" ");

                    }
                    for(int j = 1;j<=i;j++){
                        System.out.print("*");

                    }
                    System.out.println();
                }
                for(int i = n;i>=1;i--){
                    for(int j = 1;j<=i;j++){
                        System.out.print("*");

                    }
                    for(int j = 1;j<=2*(n-i);j++){
                        System.out.print(" ");

                    }
                    for(int j = 1;j<=i;j++){
                        System.out.print("*");

                    }
                    System.out.println();
                }

            }


            public static void rombug(int n){
                
                for(int i = 1;i<=n;i++){
                    for(int j = 1;j<=(n-i);j++){
                        System.out.print(" ");
                        
                    }
                    for(int j = 1;j<=n;j++){
                        System.out.print("*");
                        
                    }
                    System.out.println();
                }
            }

            public static void rombughollow(int n){
                
                for(int i = 1;i<=n;i++){
                    for(int j = 1;j<=(n-i);j++){
                        System.out.print(" ");
                        
                    }
                    for(int j = 1;j<=n;j++){
                        if (i == 1 || i == n || j == 1 || j == n) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }                        
                    }
                    System.out.println();
                }
            }




            public static void Star(int n){
                
                for(int i = 1;i<=n;i++){
                    for(int j = 1;j<=(n-i);j++){
                        System.out.print(" ");
                        
                    }
                    for(int j = 1;j<=(2*i-1);j++){
                            System.out.print("*");
                        
                    }
                    System.out.println();
                }
                for(int i = n;i>=1;i--){
                    for(int j = 1;j<=(n-i);j++){
                        System.out.print(" ");
                        
                    }
                    for(int j = 1;j<=(2*i-1);j++){
                            System.out.print("*");
                        
                    }
                    System.out.println();
                }
            }


            public static void Star1(int n){
                int count = 1;
                for(int i = 1;i<=n;i++){
                    for(int j = 1;j<=(n-i);j++){
                        System.out.print(" ");
                        
                    }
                    for(int j = 1;j<=i;j++){
                            System.out.print(count +" ");
                        
                    }
                    count++;
                    System.out.println();
                }
                
            }


            public static void pallaldrom(int n){
               
                for(int i = 1;i<=n;i++){
                    for(int j = 1;j<=(n-i);j++){
                        System.out.print(" ");
                        
                    }
                    for(int j = i;j>=1;j--){
                        
                            System.out.print(j);
                           
                           
                        
                    }

                    for(int j = 2;j<=i;j++){
                        
                        System.out.print(i);
                       
                    
                }
                   
                    System.out.println();
                }
                
            }




        }
    
