package org.example;

public class _1295_Find_Numbers_With_Even_Number_of_Digits {

    public static void main(String[] args) {
        int[] nums = {123, 2345, 31, 4111};
        int kq = findNumbers(nums);
        System.out.println(kq);
    }


    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int a : nums) {
            int soLuongChuSo = tinhChuSo(a);
            if (soLuongChuSo % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int tinhChuSo(int a) {
        int count = 0;
        int kq = a;
        while (kq != 0) {
            kq = a / 10;
            a = kq;
            count++;
        }
        return count;
    }
}


