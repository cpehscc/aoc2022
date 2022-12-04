import java.io.*;
import java.util.*;

class Day3 {
  
  public static void part1() throws FileNotFoundException {
    Scanner sc = new Scanner(new File("./inputs/input3.txt"));
    int sum = 0;
    while (sc.hasNextLine()) {
      String next = sc.nextLine();
      Set<Character> set1 = new HashSet<Character>();
      Set<Character> set2 = new HashSet<Character>();
      for (int i = 0; i < next.length(); i++) {
        if (i < next.length() / 2) {
          set1.add(next.toCharArray()[i]);
        }
        else {
          set2.add(next.toCharArray()[i]);
        }
      }
      set1.retainAll(set2);
      char priority = set1.iterator().next();
      if (Character.isUpperCase(priority)) {
        sum += (int)priority - 38;
      }
      else {
        sum += (int) priority - 96;
      }
    }
    System.out.println(sum);
    sc.close();
  }

  public static void part2() throws FileNotFoundException {
    Scanner sc = new Scanner(new File("./inputs/input3.txt"));
    int sum = 0;
    int i = 0;
    Set<Character> set1 = new HashSet<Character>();
    Set<Character> set2 = new HashSet<Character>();
    Set<Character> set3 = new HashSet<Character>();
    while (sc.hasNextLine()) {
      String next = sc.nextLine();
      if (i % 3 == 0) {
        set1.clear();
        for (char c: next.toCharArray()) {
          set1.add(c);
        }
      }
      else if (i % 3 == 1) {
        set2.clear();
        for (char c: next.toCharArray()) {
          set2.add(c);
        }
      }
      else {
        set3.clear();
        for (char c: next.toCharArray()) {
          set3.add(c);
        }    
        set1.retainAll(set2);
        set1.retainAll(set3);
        char priority = set1.iterator().next();
        if (Character.isUpperCase(priority)) {
          sum += (int)priority - 38;
        }
        else {
          sum += (int) priority - 96;
        }
      }
    i++;
    }
    System.out.println(sum);
    sc.close();
  }
  
}