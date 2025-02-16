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

        bufferedReader.close();
        String s = Integer.toBinaryString(n);
        int count=0, max = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                count++;
                max = Math.max(count, max);
            }
            else{
                count=0;
            }
        }
        System.out.print(max);
    }
}
