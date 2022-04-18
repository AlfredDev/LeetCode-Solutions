class Solution {
  static  public int findNumbers(int[] nums) {
        if(nums.length >=20) return 0;
        int aux = 0;
        for(int i = 0; i < nums.length; i++){
            if(esPrimoRecursivo(nums[i])){
                aux ++;
            }
        }

        return aux;
    }

  static  private boolean esPrimoRecursivo (int n){
        return n % 2 != 1;
    }
}