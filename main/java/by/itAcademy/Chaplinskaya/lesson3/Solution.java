package by.itAcademy.Chaplinskaya.lesson3;

import static by.itAcademy.Chaplinskaya.secondLesson.Application.enterInteger;

public class Solution {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4};
        int sum = 4;
        Solution solution = new Solution();
        int[] mas = solution.twoSum(num, sum);
        System.out.println(mas[0]);
        System.out.println(mas[1]);
        int m = enterInteger();
        System.out.println(solution.isPalindrome(m));

        System.out.println(solution.lengthOfLongestSubstring("dpgnttd"));
    }


    public int[] twoSum(int[] nums, int target) {
        int[] mas = new int[2];
        for (int i = 0; i < 4; i++) {
            int x = nums[i];
            for (int j = i + 1; j < 4; j++) {
                int y = nums[j];
                if (x + y == target) {
                    mas[0] = i;
                    mas[1] = j;
                }
            }
        }
        return mas;
    }

    public boolean isPalindrome(int x) {
        int number = x;
        int reverse = 0;
        int n;
        while (x > 0) {
            n = x % 10;
            reverse = reverse * 10 + n;
            x = x / 10;
        }
        if (number == reverse) {
            System.out.println("Число -палиндром");
            return true;
        } else {
            System.out.println("Число- не палиндром");
            return false;
        }
    }

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length(); j >= i; j--) {
                int len = j - i;
                if (s.substring(i, j).chars().distinct().count() == len && len > max) {
                    max = len;
                }
            }
        }
        return max;
    }
}
