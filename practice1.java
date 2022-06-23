import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int T = scan.nextInt();
        scan.nextLine();
        for(int i=0;i<T;i++){
            String s = scan.nextLine();
            String even;
            String odd;
            StringBuilder sbo = new StringBuilder();
            StringBuilder sbe = new StringBuilder();
            for(int j=0;j<s.length();j++){
                
                char c=s.charAt(j);
                if(j%2==0)
                 sbe.append(c);
                else
                 sbo.append(c); 
            }
            even=sbe.toString();
            odd=sbo.toString();
            System.out.println(even+" "+odd);
        }
       
    }
}