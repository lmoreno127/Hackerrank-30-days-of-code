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

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        int max=-1000;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int hourglass=0;
                int a=arr.get(i).get(j);
                int b=arr.get(i).get(j+1);
                int c=arr.get(i).get(j+2);
                int d=arr.get(i+1).get(j+1);
                int e=arr.get(i+2).get(j);
                int f=arr.get(i+2).get(j+1);
                int g=arr.get(i+2).get(j+2);
                hourglass=a+b+c+d+e+f+g;
                if(hourglass>max)
                  max=hourglass;
                
            }
        }
        System.out.println(max);
        bufferedReader.close();
    }
}
f