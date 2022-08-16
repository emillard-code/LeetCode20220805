package com.project.attempt;

public class LeetCodeAppRevised {

    public static void main(String[] args) {

        int[] array = { 1, 2, 3 };
        System.out.println(method(array, 4));

    }

    public static int method(int[] array, int target) {

        int count = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] <= target) {
                count = count + method(array, target - array[i]);
            }

            if (target == 0) {
                return 1;
            }

        }

        return count;

    }

}