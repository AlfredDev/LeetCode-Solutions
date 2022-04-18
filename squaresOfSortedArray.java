public class squaresOfSortedArray {
    public static void main(String[] args) {
        
        int [] sorted = sortedSquares(new int [] {-4,-1,0,3,10});

        
    }

    static int[] sortedSquares(int[] nums){
        int [] sorted = new int [nums.length];
        int i = nums.length - 1;

        int s = 0;
        int e = i;

        while(s <= e){
            int squareF = nums[s] * nums[s];
            int squareT = nums[e] * nums[e];

            if(squareF > squareT){
                sorted[i] = squareF;
                s++;
            }
            else{
                sorted[i] = squareT;
                e--;
            }
            i--;
        }
        
        return sorted;
    }
}