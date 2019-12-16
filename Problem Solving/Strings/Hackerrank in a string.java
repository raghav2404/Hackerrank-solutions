import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the hackerrankInString function below.
    static String hackerrankInString(String s) {
 Stack<Character> stack= new Stack<>();
        stack.push('k');
        stack.push('n');
        stack.push('a');
        stack.push('r');
        stack.push('r');
        stack.push('e');
        stack.push('k');
        stack.push('c');
        stack.push('a');
        stack.push('h');
        
        String result="NO";
        for(Character c:s.toCharArray()){
            if(c==stack.peek())
                stack.pop();
            if(stack.isEmpty()){
                result="YES";
                break;
            } 
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
