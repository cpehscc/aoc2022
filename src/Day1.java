import java.io.*;
import java.util.*;

class Day1 {
  
  public static void part1() throws FileNotFoundException {
    Scanner sc = new Scanner(new File("./inputs/input1.txt"));
    List<Integer> sums = new ArrayList<Integer>();
    int sum = 0;
    while (sc.hasNextLine()) {
      String next = sc.nextLine();
      if (next.isEmpty()) {
        sums.add(sum);
        sum = 0;
      }
      else {
        sum += Integer.parseInt(next);
      }
    }
    sc.close();
    
    Collections.sort(sums, Collections.reverseOrder());
    System.out.println(sums.get(0));
  }

  public static void part2() throws FileNotFoundException {
    Scanner sc = new Scanner(new File("./inputs/input1.txt"));
    List<Integer> sums = new ArrayList<Integer>();
    int sum = 0;
    while (sc.hasNextLine()) {
      String next = sc.nextLine();
      if (next.isEmpty()) {
        sums.add(sum);
        sum = 0;
      }
      else {
        sum += Integer.parseInt(next);
      }
    }
    sc.close();
    
    Collections.sort(sums, Collections.reverseOrder());
    System.out.println(sums.get(0) + sums.get(1) + sums.get(2));
  }
}