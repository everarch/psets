/**
 *
 * Day 3: Intro to Conditional Statements
 * 
 * https://www.hackerrank.com/challenges/30-conditional-statements/problem
 *
 **/

import java.io.*;

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine().trim());
    String s = ((n % 2 != 0) || (n >= 6 && n <= 20)) ? "Weird" : "Not Weird";
    System.out.println(s);
    bufferedReader.close();
  }
}
