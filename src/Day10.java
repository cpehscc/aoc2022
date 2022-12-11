import java.io.*;
import java.util.*;

class Day10 {
  
  public Day10() {

  }
  
  public void part1() throws FileNotFoundException {
    Scanner sc = new Scanner(new File("./inputs/input10.txt"));
    ArrayList<Integer> cycles = new ArrayList<Integer>();
    int x = 1;
    while (sc.hasNextLine()) {
      String next = sc.nextLine();
      if (next.length() == 4)
        cycles.add(x);
      else {
        cycles.add(x);
        String[] tokens = next.split(" ");
        x += Integer.parseInt(tokens[1]);
        cycles.add(x);
      }
    }
    int sum = 0;
    for (int i = 0; i < cycles.size(); i++) {
      if ((i + 2 == 20) || (i + 2 == 60) || (i + 2 == 100) || (i + 2 == 140) || (i + 2 == 180) || (i + 2 == 220))
        sum += (i + 2) * cycles.get(i);
    }
    System.out.println(sum);
    sc.close();
  }

  public void part2() {
  }
}