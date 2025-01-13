package day1.q3;

import java.util.Arrays;

/*
 * Write a method called copyOf(),
 * which accepts an int array and returns a copy of the given array.
 * The method's signature is as follows:
 * public static int[] copyOf(int[] array)
 */

class ArrayOp {

    // Method to copy the array using Arrays.copyOf
    public static int[] copyOf(int[] array) {
        return Arrays.copyOf(array, array.length); // Creates a new array with the same size and copies the elements
    }
}

public class Ans3 {

    public static void main(String[] args) {

        // Original array
        int[] arr = {11, 22, 33, 44, 55};

        // Get the copy of the original array
        int[] copyOfArr = ArrayOp.copyOf(arr);

        // Print the copied array
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Copied Array  : " + Arrays.toString(copyOfArr));
    }
}
