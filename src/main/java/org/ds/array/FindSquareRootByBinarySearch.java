package org.ds.array;

public class FindSquareRootByBinarySearch {

    /*
    1. Initialize variables ans, start, and end to track the search range.
    2. Calculate the middle index mid as the average of start and end.
    3. Enter a while loop as long as start is less than or equal to end.
    4. Check if the square of the mid index is equal to the target number:
        If true, assign mid to ans and return ans as the square root.
        If the square of mid is greater than the target number:
    5. Update end to mid - 1 to search in the lower half of the range.
        If the square of mid is less than or equal to the target number:
    6. Update ans to mid as a potential square root candidate.
    7. Update start to mid + 1 to search in the upper half of the range.
    8. Recalculate mid as the average of the updated start and end.
    9. Repeat steps 4-7 until the search range is exhausted (start becomes greater than end).
    10. Return ans as the closest square root found during the search.
    */
    public static int findSquareRoot(int num){
        int ans = -1;
        int startIndex = 0;
        int endIndex = num;
        long midIndex = startIndex + (endIndex - startIndex ) / 2;

        while (startIndex <= endIndex){

            if((midIndex*midIndex) == num){
                ans = (int )midIndex;
                return ans;
            } else if ((midIndex*midIndex) > num) {
                endIndex = (int) midIndex - 1;
            }else {
                ans = (int) midIndex;
                startIndex = (int) midIndex + 1;
            }
            midIndex = startIndex + (endIndex - startIndex ) / 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        int index = findSquareRoot(1000000);
        System.out.println("square root of 27 : "+index);
    }
}
