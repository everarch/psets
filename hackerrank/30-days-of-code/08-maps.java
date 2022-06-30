/**
 *
 * Day 8: Dictionaries and Maps
 *
 * https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
 *
 **/

//Complete this code or write your own from scratch
import java.util.*;

class Solution {
  public static void main(String []argh) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    Map <String, Integer> addressBook = new HashMap<String, Integer>();
    for(int i = 0; i < n; i++){
      String name = in.next();
      int phone = in.nextInt();
      // Write code here
      addressBook.put(name, phone);
    }
    while(in.hasNext()){
      String s = in.next();
      // Write code here
      if (addressBook.containsKey(s)) {
        System.out.println(s + "=" + addressBook.get(s));
      } else { 
        System.out.println("Not found");
      }
    }
    in.close();
  }
}
