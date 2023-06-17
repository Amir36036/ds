package org.ds.array;

public class BinarySearch {

    /*
    1. Initialize variables for start and end indices of the search range.
    2. Calculate the mid index as the average of start and end.
    3. While start is less than or equal to end, repeat the following steps:
        Check if the element at the mid index is the target element.
            If it is, return the mid index as the result.
            If it is less than the target element, update start to mid + 1 and repeat the loop.
            If it is greater than the target element, update end to mid - 1 and repeat the loop.
    4. If the loop completes without finding the target element, return a value indicating that the element is not present.
    */

    /*
    The time complexity of the Binary Search algorithm can be expressed as O(log n),
    where n is the number of elements in the sorted input array.
    */
    public static int binarySearch(int[] arr, int size, int key){

        int startIndex = 0;
        int endIndex = arr.length - 1;

        /*The error occurs when the sum of the start and end values exceeds the range of the integer data type while use (start+end)/2.
        To address this issue, we utilize the formula startIndex + (endIndex - startIndex) / 2.
        This formula helps prevent any potential overflow errors that could arise due to the range limitation of the integer type.*/

        int midIndex = startIndex + (endIndex-startIndex)/2 ;

        while (startIndex <= endIndex){
            if(key == arr[midIndex]) {
                return midIndex;
            }else if (key > arr[midIndex]){
                startIndex = midIndex + 1;
            }else {
                endIndex = midIndex -1;
            }

            midIndex = startIndex + (endIndex-startIndex)/2 ;
        }

        return -1; // Target element not found
    }

    public static int binarySearchByRecursion(int[] arr, int key, int startIndex, int endIndex){
        if(startIndex > endIndex){
            return -1;
        }

        int midIndex = startIndex + (endIndex - startIndex) / 2;

        if(key == arr[midIndex]) {
            return midIndex;
        }else if (key > arr[midIndex]){
            return binarySearchByRecursion( arr,  key, midIndex + 1, endIndex);
        }else {
           return binarySearchByRecursion(arr, key, startIndex, midIndex -1);
        }

    }

    public static void main(String[] args) {

        int[] arr = {2,4,6,8,10,12,14};

        int index14 = binarySearch(arr, 7, 14);
        System.out.println("index of 14 :"+index14);

        int index2 = binarySearch(arr, 7, 2);
        System.out.println("index of 2 :"+index2);

        int index5 = binarySearch(arr, 7, 5);

        System.out.println("index of 5 :"+index5);


        int index14ByRec = binarySearchByRecursion(arr, 14, 0, 6);
        System.out.println("index of 14 by rec :"+index14ByRec);




    }
}
