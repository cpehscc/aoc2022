import java.io.*;
import java.util.*;

class Day9 {
  
  public Day9() {

  }
  
  public void part1() throws FileNotFoundException {
    int x, y;
    x = y = 0;
    Scanner sc = new Scanner(new File("./inputs/input9.txt"));
    while (sc.hasNextLine()) {
      String next = sc.nextLine();  
      String[] tokens = next.split(" ");
      String direction = tokens[0];
      int steps = Integer.parseInt(tokens[1]);
      if (direction.equals("U"))
        y += steps;
      if (direction.equals("D"))
        y-= steps;
      if (direction.equals("L"))
        x -= steps;
      if (direction.equals("R"))
        x += steps;
    }
    System.out.println("x: " + Integer.toString(x));
    System.out.println("y: " + Integer.toString(y));
    sc.close();
  }

  public void part2() {
  }
}