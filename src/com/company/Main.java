package com.company;
public class Main {

    static int[] numbers = {12, 5, 36, 35};

    static String findLargestAndSmallestNumber( int[] listNumbers ){
        int index = 1;
        int smallNumber = listNumbers[0];
        int lengthList = listNumbers.length;
        int largeNumber = listNumbers[0];

        while (lengthList> index){
            if(smallNumber > listNumbers[index] && (listNumbers[index] % 2 != 0) ){
               smallNumber = listNumbers[index];
            }else if(largeNumber < listNumbers[index] && (listNumbers[index] % 2 == 0)){
                largeNumber = listNumbers[index];
            }
            index++;
        }
        return "The largest number is: " + largeNumber + " and is an odd number."+"The smallest number is: "+smallNumber+ " and is an even number.";
    }
    public static void main(String[] args) {
        System.out.println(findLargestAndSmallestNumber(numbers));
    }
}
