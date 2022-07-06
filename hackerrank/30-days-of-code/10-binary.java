/**
 *
 * Day 10: Binary Numbers
 *
 * https://www.hackerrank.com/challenges/30-binary-numbers/problem
 *
 **/

import java.io.*;

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine().trim());
    int rem;
    int count = 0;
    int max = -1;
    while (n >= 1) {
      rem = n % 2;
      n = n / 2;
      count = rem == 1 ? ++count : 0;
      max = count > max ? count : max;
    }
    System.out.println(max);
    bufferedReader.close();
  }
}
