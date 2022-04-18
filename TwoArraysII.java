import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class TwoArraysII
{
    public int[] intersect(int[] nums1, int[] nums2) {     
        int i = 0, j = 0;
        List <Integer> res = new ArrayList<>();

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                res.add(nums1[i]);
                i++; j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        
        int [] r = new int[res.size()];
        
        for(int x = 0;x < r.length; x++){
                r[x] = res.get(x);
        }
        
        return r;

    }
}

