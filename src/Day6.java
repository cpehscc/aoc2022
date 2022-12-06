import java.io.*;
import java.util.*;

class Day6 {

  public Day6() {
    super();
  }
  
  public void part1() throws FileNotFoundException {
    Scanner sc = new Scanner(new File("./inputs/input6.txt"));
    char[] next = sc.nextLine().toCharArray();
    Set<Character> chars;
    boolean distinct = false;
    int i = 4;
    while (!distinct) {
      chars = new HashSet<Character>();
      chars.add(next[i-4]);
      chars.add(next[i-3]);
      chars.add(next[i-2]);
      chars.add(next[i-1]);
      if (chars.size() == 4) {
        System.out.println(i);
        distinct = true;
      }
      i++;
    }
    sc.close();
  }

  public void part2() throws FileNotFoundException {
    Scanner sc = new Scanner(new File("./inputs/input6.txt"));
    char[] next = sc.nextLine().toCharArray();
    Set<Character> chars;
    boolean distinct = false;
    int i = 14;
    while (!distinct) {
      chars = new HashSet<Character>();
      chars.add(next[i-14]);
      chars.add(next[i-13]);
      chars.add(next[i-12]);
      chars.add(next[i-11]);
      chars.add(next[i-10]);
      chars.add(next[i-9]);
      chars.add(next[i-8]);
      chars.add(next[i-7]);
      chars.add(next[i-6]);
      chars.add(next[i-5]);
      chars.add(next[i-4]);
      chars.add(next[i-3]);
      chars.add(next[i-2]);
      chars.add(next[i-1]);
      if (chars.size() == 14) {
        System.out.println(i);
        distinct = true;
      }
      i++;
    }
    sc.close();
  }
}