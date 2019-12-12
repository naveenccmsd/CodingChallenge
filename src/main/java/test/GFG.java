package test;

import java.util.Arrays;
import java.util.List;


class GFG {

    static int getMaxSum(List<Integer> array) {
        int max = array.get(0);
        int temp = array.get(0);

        for (int i = 1; i < array.size(); i++) {
            temp = Math.max(array.get(i), temp + array.get(i));
            max = Math.max(max, temp);
        }
        return max;
    }

    /* Driver program to test maxSubArraySum */
    public static void main(String[] args) {
        Integer a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int n = a.length;
        List<Integer> as = Arrays.asList(a);
        int max_sum = getMaxSum(as);
        System.out.println("Maximum contiguous sum is "
                + max_sum);
    }
}
