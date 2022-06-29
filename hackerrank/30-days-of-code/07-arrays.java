/**
 * 
 * Day 7: Arrays
 *
 * https://www.hackerrank.com/challenges/30-arrays/problem
 *
 **/

import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    List<Integer> arr = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int arrItem = Integer.parseInt(arrTemp[i]);
      arr.add(arrItem);
    }

    while(n > 0) {
      System.out.print(arr.get(--n) + " ");
    }
    System.out.println();

    bufferedReader.close();
  }
}
