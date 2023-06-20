package org.ds.array;

public class BookAllocation {


    public static int bookAllocation(int[] arr, int firstIndexValue, int sumOfArr, int numberOfStudent){
        int ans = -1;
        int startIndex = firstIndexValue;
        int endIndex = sumOfArr;

        int mid = startIndex + (endIndex - startIndex) / 2;

        while (startIndex <= endIndex){

            if(isPossibleSolution(arr, mid, numberOfStudent)){
                    ans = mid;
                    endIndex = mid - 1;
            }else {
                    startIndex = mid + 1;
            }
            mid = startIndex + (endIndex - startIndex) / 2;
        }

        return ans;
    }

    private static boolean isPossibleSolution(int[] arr, int mid, int numberOfStudent) {

        int totalPages = 0;
        int studentCount = 1;

       for (int page=0; page< arr.length; page++){
           if(arr[page] > mid)
               return false;

           if ((arr[page]+totalPages) > mid){
               studentCount++;
               totalPages = totalPages + arr[page];
           }else{
               totalPages = totalPages + arr[page];
           }
       }
       if(studentCount > numberOfStudent)
           return false;

       return true;
    }

    public static void main(String[] args) {
        int[] arr = {12, 34, 67, 90};

        int number = bookAllocation(arr, 12, 203, 2);

        System.out.println("minimum no of pages : "+ number);

    }
}
