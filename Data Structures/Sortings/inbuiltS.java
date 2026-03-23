package Sortings;

import java.util.Arrays;
import java.util.Collections;

class inbuilt{
    public static void main(String[] args) {
        int nums[] = {5, 4, 1, 3, 2};
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        Integer num[] = {5, 4, 1, 3, 2};
        Arrays.sort(num, Collections.reverseOrder());

        for(int i=0; i<num.length; i++){
            System.out.print(num[i] + " ");
        }
    }
}