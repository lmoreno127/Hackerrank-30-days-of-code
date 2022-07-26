import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
          Scanner scan = new Scanner(System.in);
     int numElements = scan.nextInt();
     int elmArray[] = new int[numElements];
     for (int i=0; i<numElements; i++) {
         elmArray[i] = scan.nextInt();
     }

     int temp = 0, numOfSwaps = 0;

     for (int i=0; i<numElements; i++) {
         for (int j=0; j<numElements-1; j++) {
             if ( elmArray[j] > elmArray[j+1] ) {
                 temp = elmArray[j];
                 elmArray[j] = elmArray[j+1];
                 elmArray[j+1] = temp;
                 numOfSwaps++;
             }
         }

        // If no elements were swapped during a traversal, array is sorted
            if (numOfSwaps == 0) {
                break;
            }
     }

     scan.close();

     System.out.println("Array is sorted in " + numOfSwaps + " swaps.");
     System.out.println("First Element: " + elmArray[0]);
     System.out.println("Last Element: " + elmArray[elmArray.length-1]);
    }
    
}
