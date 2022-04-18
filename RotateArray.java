class RotateArray {
    public static void main(String[] args) {
        rotate(new int [] {1,2,3,4,5,6,7}, 3);
    }

   public static void rotate(int[] nums, int k) {
       int  size = nums.length;

       k = k % nums.length;
       System.out.println(k);
       reverse(nums,nums[k],size - k);
       prit(nums);
    }

    static void reverse(int[] nums, int l , int r){
        while(l < r){
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
    
    static void prit(int [] n){
        for(int i = 0; i < n.length;i++){
            System.out.println(n[i]);
        }
    }
}