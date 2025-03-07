import java.util.*;
public class ContainerWater{
    // public static int StoreWater(int height[]){
    //     int maxWater = 0;
    //     int n = height.length;
    //     for(int i = 0;i<n;i++){
    //         for(int j = i+1;j<n;j++){
    //             int ht = Math.min(height[i],height[j]);
    //             int width = j-i;
    //             int currWater = ht*width;
    //             maxWater = Math.max(maxWater,currWater);
    //         }
    //     }
    //     return maxWater;

    // }


    ///optimize Approch
    public static int StoreWater(int height[]){
        int maxWater = 0;
        int lp = 0;
        int n = height.length;
        int rp = n-1;

        while(lp<rp){
            int ht = Math.min(height[lp],height[rp]);
            int width = rp-lp;

            int currWater = ht*width;
            maxWater = Math.max(maxWater,currWater);
            if (height[lp] < height[rp]) {
                lp++; // Move the left pointer inward
            } else {
                rp--; // Move the right pointer inward
            }
        }
        
        return maxWater;
        }

    
    public static void main(String[] args){
        int height[] = {1,8,6,2,5,4,8,3,7};
    System.out.println(StoreWater(height));
}
}