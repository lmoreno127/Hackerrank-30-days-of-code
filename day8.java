import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        Hashtable<String, Integer> phonenumbers = new Hashtable<String,Integer>();
        int n = scn.nextInt();
        for(int i = 0;i<n;i++){
           String name = scn.next();

           Integer phonenumber = scn.nextInt();
           phonenumbers.put(name,phonenumber);  
        }
        while(scn.hasNextLine()){
            String name = scn.next();
            if(phonenumbers.containsKey(name))
              System.out.println(name+"="+phonenumbers.get(name));
             else
               System.out.println("Not found");
            
        }
    }
}