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
public class SearchInsertPosition {

    public static void main(String[] args) {
        System.err.println(searchInsert(new int[]{1, 3, 5, 6}, 2));
    }

    static int searchInsert(int[] nums, int target) {
        if (target > nums[nums.length - 1]) {
            return nums.length - 1;
        }
        if (target < nums[0]) {
            return 0;
        }

        return binarySearch(nums, 0, nums.length, target);
    }

    private static int binarySearch(int[] arr, int l, int r, int t) {
        int pivot;

        while (l <= r) {
            pivot = l + (r - l) / 2;
            if (arr[pivot] == t) {
                return pivot;
            } else if (pivot - 1 >= l && arr[pivot - 1] < t && t < arr[pivot]) {
                return pivot;
            } else if (pivot + 1 >= r && arr[pivot] < t && t < arr[pivot + 1]) {
                return pivot + 1;
            } else if (arr[pivot] < t) {
                l = pivot + 1;
            } else {
                r = pivot - 1;
            }
        }
        return -1;
    }
}
