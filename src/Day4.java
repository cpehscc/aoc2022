import java.io.*;
import java.util.*;

class Day4 {
  
  public static void part1() throws FileNotFoundException {
    Scanner sc = new Scanner(new File("./inputs/input4.txt"));
    int count = 0;
    while (sc.hasNextLine()) {
      String next = sc.nextLine();
      String[] first = next.split(",")[0].split("-");
      String[] second = next.split(",")[1].split("-");
      Set<Integer> set1 = new HashSet<Integer>();
      Set<Integer> set2 = new HashSet<Integer>();
      for (int i = Integer.parseInt(first[0]); i <= Integer.parseInt(first[1]); i++) {
        set1.add(i);
        }
      for (int i = Integer.parseInt(second[0]); i <= Integer.parseInt(second[1]); i++) {
        set2.add(i);
        }
      boolean result = set1.containsAll(set2) || set2.containsAll(set1);
      count += (result) ? 1 : 0;
    }
    System.out.println(count);
    sc.close();
  }

  public static void part2() throws FileNotFoundException {
    Scanner sc = new Scanner(new File("./inputs/input4.txt"));
    int count = 0;
    while (sc.hasNextLine()) {
      String next = sc.nextLine();
      String[] first = next.split(",")[0].split("-");
      String[] second = next.split(",")[1].split("-");
      Set<Integer> set1 = new HashSet<Integer>();
      Set<Integer> set2 = new HashSet<Integer>();
      for (int i = Integer.parseInt(first[0]); i <= Integer.parseInt(first[1]); i++) {
        set1.add(i);
        }
      for (int i = Integer.parseInt(second[0]); i <= Integer.parseInt(second[1]); i++) {
        set2.add(i);
        }
      set1.retainAll(set2);
      boolean result = !set1.isEmpty();
      count += (result) ? 1 : 0;
    }
    System.out.println(count);
    sc.close();
  }
  
}