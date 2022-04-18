import java.util.Arrays;  
import java.util.List;
import java.util.ArrayList;

public class SubsetsII
{
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List <List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        int s = 0;
        for(int i = 0; i < nums.length; i++){
            int size = list.size();
            if(i == 0 || nums[i] != nums[i - 1]) s = 0;
            for(int j  = s; j < size; j++){
                List<Integer> tmp = new ArrayList<>(list.get(j));
                tmp.add(nums[i]);
                list.add(tmp);
            }
            s = size;
        }
        
        return list;
    }
}
