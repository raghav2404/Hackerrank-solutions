import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.lang.String.*;
public class Solution {

    // Complete the pangrams function below.
    static String pangrams(String s) {
        s=s.toLowerCase();
        boolean isPanagram=true;
        String str="abcdefghijklmnopqrstuvwxyz ";
        for(char ch:str.toCharArray())
        {
      int n=s.indexOf(ch);
      if(n==-1)
      return "not pangram";
        }
        return "pangram";
 


        

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
