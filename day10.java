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
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        Stack<Integer> binary = new Stack<Integer>();
        int maxcont1=0;
        int cont1=0;
        while (n>0){
            binary.push(n%2);
            n=n/2;
        }
       
        while(!binary.empty()){
            int number = binary.peek();
            if(number==1)
              cont1++;
            else
              cont1=0;
            
            if(cont1>maxcont1)
              maxcont1=cont1;    
            binary.pop();
        }
        System.out.println(maxcont1);      
        bufferedReader.close();
    }
}
