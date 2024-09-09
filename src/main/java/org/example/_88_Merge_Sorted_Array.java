package org.example;

public class _88_Merge_Sorted_Array {
    public static void main(String[] args) {
//        int[] nums1 = {2, 3, 4, 0, 0, 0};
//        int m = 3;
//        int[] nums2 = {0, 3, 6};
//        int n = 3;
        int[] nums1 = { 0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] n1, int m, int[] n2, int n) {
        for (int ai : n2) {
            chenPhanTuVaoMang(ai, n1, m);
            m++;
        }
    }

    private static void chenPhanTuVaoMang(int x, int[] a, int m) {
        boolean flag = false;
        for (int k = 0; k <= m; k++) {
            if (a[k] > x) {
                flag = true;
                for (int i = m - 1; i >= k; i--) {
                    a[i + 1] = a[i];
                }
                a[k] = x;
                break;
            }
            if (flag == false) {
                a[m] = x;
            }
        }
    }
}
