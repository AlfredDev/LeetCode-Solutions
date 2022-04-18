import java.util.Map;
import java.util.HashMap;

public class TwoSum
{
    static int[] twoSum(int[] nums, int target) {
        Map <Integer,Integer> map = new HashMap();
    
        for(int i = 0; i < nums.length; i++){
            int operation = target - nums[i];
            if(map.containsKey(operation)){
                return new int []{i,map.get(operation)};
            }
            map.put(nums[i], i);
        }
        return null;
    }


}


