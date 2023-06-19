package org.ds.array;

public class FindPivot {


    public static int findPivot(int[] arr, int size){
        int startIndex = 0;
        int endIndex = size - 1;

        int mid = startIndex + (endIndex - startIndex) / 2;

        while (startIndex < endIndex){

            if(arr[mid] >= arr[0]){
                startIndex = mid + 1;
            }else {
                endIndex = mid;
            }

            mid = startIndex + (endIndex - startIndex) / 2;
        }
        return mid;
    }

    public static void main(String[] args) {
        int[] arr = {7,9,10,2,3};

        int index = findPivot(arr, arr.length);

        System.out.println("pivot index : "+ index);
    }
}
