package org.ds.array;

public class FIndKeyINRotatedSortedArray {


   /* 
   Initialize ans variable to -1.
    Set startIndex to 0 and endIndex to size - 1.
    Calculate midIndex as the average of startIndex and endIndex.
    Enter a loop while startIndex is less than endIndex.
            Check if the element at midIndex is equal to the key:
    If true, assign midIndex to ans and return ans.
            Check if the element at midIndex is greater than the first element of the array and the key is within the range of the first element and the element at midIndex:
    If true, update endIndex to midIndex - 1.
    If false, update startIndex to midIndex + 1.
    Recalculate midIndex as the average of the updated startIndex and endIndex.
    Repeat steps 5 to 7 until the condition in the while loop is no longer satisfied.
    Return the value of ans, which represents the index of the key if found, or -1 if not found.
    */

    public static int findKey(int[] arr, int size, int key){
        int ans = -1;
        int startIndex = 0;
        int endIndex = size - 1;
        int midIndex = startIndex + (endIndex - startIndex) / 2;
        while (startIndex<endIndex){

            if(arr[midIndex] == key){
                ans = midIndex;
                return ans;
            } else if (arr[midIndex] > arr[0] && (key >= arr[0] && key < arr[midIndex])) {
                endIndex = midIndex - 1;
            }else {
                startIndex = midIndex + 1;
            }

            midIndex = startIndex + (endIndex - startIndex) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {7,9,10,3,3};

        int index = findKey(arr, arr.length, 5);

        System.out.println("pivot index : "+ index);
    }
}
