/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acepta.el.reto;

/**
 *
 * @author losga
 */
public class consecutuve {

    public static void main(String[] args) {
        System.out.println(threeConsecutiveOdds(new int[]{1, 2, 34, 3, 4, 5, 7, 23, 12}));
    }

    static boolean threeConsecutiveOdds(int[] arr) {
        int x = 0;
        int pos = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if ((pos % 2) > 0 && pos > arr[i - 1]) {
                x++;
            } else {
                x = 0;
            }

            pos = arr[i];

            if (x == 3) {
                return true;
            }

        }
        return false;

    }

}
