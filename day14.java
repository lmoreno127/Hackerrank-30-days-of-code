import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

	// Add your code here
    public Difference(int[] elements){
        this.elements=elements;
    }
    
    public void computeDifference(){
        maximumDifference=-1;
        for(int i=0;i<elements.length-1;i++){
         for(int j=i+1;j<elements.length;j++){
             int differenceabs = Math.abs(elements[i]-elements[j]);
             if(differenceabs>maximumDifference)
                maximumDifference=differenceabs;
         }
            
               
        }
    }
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}