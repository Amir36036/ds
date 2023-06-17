package org.ds.array;

public class FindPeakInMountain {

    public static int findPeakInMountain(int arr[], int size){

        int startIndex = 0;
        int endIndex = size -1;

        int midIndex = startIndex + (endIndex - startIndex) / 2;

        while (startIndex < endIndex){

            if(arr[midIndex] < arr[midIndex + 1]){
                startIndex = midIndex + 1;
            }else {
                endIndex = midIndex;
            }

            midIndex = startIndex + (endIndex - startIndex) / 2;
        }

        return midIndex;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,5,1};

        int peakIndex = findPeakInMountain(arr, 7);
        System.out.println("peak index  : " +peakIndex);
    }
}
