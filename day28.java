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

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        ArrayList<String> gmailusers=new ArrayList<>();
        IntStream.range(0, N).forEach(NItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                String firstName = firstMultipleInput[0];

                String emailID = firstMultipleInput[1];
                String [] emailIDsplitted=emailID.split("@");
                if(emailIDsplitted[1].equals("gmail.com")){
                  gmailusers.add(firstName);
                }
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        Collections.sort(gmailusers);
        for(int i=0;i<gmailusers.size();i++)
          System.out.println(gmailusers.get(i));
        bufferedReader.close();
    }
}
