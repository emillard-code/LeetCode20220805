package com.project.attempt;

public class LeetCodeApp {

    private static int count = 0;

    public static void main(String[] args) {

        int[] array = { 1, 2, 3 };
        System.out.println(method(array, 4));

    }

    public static int method(int[] array, int target) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] < target) {
                method(array, target - array[i]);
            }

            if (array[i] > target) {

            }

            if (array[i] == target) {
                count++;
            }

        }

        return count;

    }

}