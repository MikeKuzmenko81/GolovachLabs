package ru.mike;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args) {
        int[] a = {3, 5, 7, 8, 10, 15, 35, 56};
        int[] b = {12, 16, 19, 20, 23, 42, 63, 76, 78, 88, 93};
        int[] result = new int[a.length + b.length];
        int aIndex = 0;
        int bIndex = 0;
        while (aIndex + bIndex != result.length) {
            if((aIndex <= a.length - 1) && (bIndex <= b.length - 1)) {
                if (a[aIndex] < b[bIndex]) {
                    result[aIndex + bIndex] = a[aIndex++];
                } else {
                    result[aIndex + bIndex] = b[bIndex++];
                }
            }else if(aIndex == a.length){
                result[aIndex + bIndex] = b[bIndex++];
            }else {
                result[aIndex + bIndex] = a[aIndex++];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
