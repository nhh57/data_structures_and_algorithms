package org.example;

public class _27_Remove_Element {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int result = removeElement(nums, val);
        System.out.println("result = " + result);
    }

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n; ) {
            if (nums[i] == val) {
                // xoa phan tu a[i]
                for (int j = i; j <= (n - 2); j++) {
                    nums[j] = nums[j + 1];
                }
                n--;
            } else {
                i++; // khong phai xoa
            }
        }
        return n;
    }
}
