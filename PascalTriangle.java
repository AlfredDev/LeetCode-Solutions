import java.util.List;
import java.util.ArrayList;

/**
 * @author: Alfred Garcia
 * Title: 118 Pascal's Triangle
 * https://leetcode.com/problems/pascals-triangle/
 * In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 *          1
 *         1 1
 *        1 2 1
 *       1 3 3 1
 *      1 4 6 4 1
 *      
 * Example 1:
 * Input: numRows = 5
 * Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
 */

public class PascalTriangle
{
    static public List<List<Integer>> generate(int numRows) {
        List <List<Integer>> list = new ArrayList<>();  
        if(numRows == 0 ) return list;
        /* Required step: Add the first row to  triangle */
        list.add(new ArrayList<>());
        list.get(0).add(1);
        for(int i = 1; i < numRows; i++){
            List <Integer> aux = new ArrayList(); 
            for(int j = 0; j <= i; j++){
                int sum = 1; /* For case one */
                if(j != 0 && i != j){ // If There is a number both left and right
                    int left = list.get(i - 1).get(j -1);
                    int right = list.get(i -1).get(j);
                    sum = left + right;
                }
                aux.add(sum);
            }
            list.add(aux);
        }

        return list;
    }
}
