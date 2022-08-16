package com.project.solution;

class LeetCodeSolution {

    public static void main(String[] args) {

        int[] array = { 1, 2, 3 };
        System.out.println(method(array, 4));

    }

    public static int method(int[] nums, int target) {

        if (target == 0) {
            return 1;
        }

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (target >= nums[i]) {
                count += method(nums, target - nums[i]);
            }

        }

        return count;

    }

}