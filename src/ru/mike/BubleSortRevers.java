package ru.mike;

import java.util.Arrays;

public class BubleSortRevers {
    public static void main(String[] args) {
        int[] arr = {34, 44, 2, 6, 32, 8, 76, 5, 7};
        for (int barier = 0; barier <= arr.length - 1 ; barier++){
            for (int index = arr.length -1; index > barier; index--){
                if(arr[index] < arr[index - 1]){
                    int tmp = arr[index];
                    arr[index] = arr[index - 1];
                    arr[index - 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
