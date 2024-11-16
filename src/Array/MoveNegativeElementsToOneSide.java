package Array;

import java.util.Arrays;

public class MoveNegativeElementsToOneSide {

    public static void moveNegativeElements(int[] arr){
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]<0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] numbers = {-1,2,-3,4,5,6,-7,8,9};
        moveNegativeElements(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
