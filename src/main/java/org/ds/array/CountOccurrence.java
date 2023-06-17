package org.ds.array;

public class CountOccurrence {

    public static int findFirstPosition(int[] arr, int size, int key){

        int startIndex = 0;
        int endIndex = size - 1;
        int midIndex = startIndex + (endIndex - startIndex)/2;
        int ans = -1;
        while (startIndex <= endIndex){

            if(key == arr[midIndex]){
                ans = midIndex;
                endIndex = midIndex - 1;
            }else if (key > arr[midIndex]){
                startIndex = midIndex + 1;
            }else {
                endIndex = midIndex - 1;
            }

            midIndex = startIndex + (endIndex - startIndex)/2;
        }
        return ans;
    }

    public static int findLastPosition(int[] arr, int size, int key){

        int startIndex = 0;
        int endIndex = size - 1;
        int midIndex = startIndex + (endIndex - startIndex)/2;
        int ans = -1;
        while (startIndex <= endIndex){

            if(key == arr[midIndex]){
                ans = midIndex;
                startIndex = midIndex + 1;
            }else if (key > arr[midIndex]){
                startIndex = midIndex + 1;
            }else {
                endIndex = midIndex - 1;
            }

            midIndex = startIndex + (endIndex - startIndex)/2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,6,6,6,6,6,14};

        int firstIndex6 = findFirstPosition(arr, 7, 6);
        System.out.println("first index of 6 : " +firstIndex6);

        int lastIndex6 = findLastPosition(arr, 7, 6);
        System.out.println("last index of 6 : " +lastIndex6);

        int totalOccurence = (lastIndex6 - firstIndex6) + 1;
        System.out.println("total occurence of 6 : "+ totalOccurence);

    }
}
