import java.io.*;
import java.util.*;

class Day5 {

  List<Stack<Character>> stacks;
  
  public Day5() {
    stacks = new ArrayList<Stack<Character>>();
    for (int i = 0; i < 9; i++)
      stacks.add(new Stack<Character>());

    stacks.get(0).push('H');
    stacks.get(0).push('C');
    stacks.get(0).push('R');

    stacks.get(1).push('B');
    stacks.get(1).push('J');
    stacks.get(1).push('H');
    stacks.get(1).push('L');
    stacks.get(1).push('S');
    stacks.get(1).push('F');

    stacks.get(2).push('R');
    stacks.get(2).push('M');
    stacks.get(2).push('D');
    stacks.get(2).push('H');
    stacks.get(2).push('J');
    stacks.get(2).push('T');
    stacks.get(2).push('Q');

    stacks.get(3).push('S');
    stacks.get(3).push('G');
    stacks.get(3).push('R');
    stacks.get(3).push('H');
    stacks.get(3).push('Z');
    stacks.get(3).push('B');
    stacks.get(3).push('J');
    
    stacks.get(4).push('R');
    stacks.get(4).push('P');
    stacks.get(4).push('F');
    stacks.get(4).push('Z');
    stacks.get(4).push('T');
    stacks.get(4).push('D');
    stacks.get(4).push('C');
    stacks.get(4).push('B');

    stacks.get(5).push('T');
    stacks.get(5).push('H');
    stacks.get(5).push('C');
    stacks.get(5).push('G');

    stacks.get(6).push('S');
    stacks.get(6).push('N');
    stacks.get(6).push('V');
    stacks.get(6).push('Z');
    stacks.get(6).push('B');
    stacks.get(6).push('P');
    stacks.get(6).push('W');
    stacks.get(6).push('L');
    
    stacks.get(7).push('R');
    stacks.get(7).push('J');
    stacks.get(7).push('Q');
    stacks.get(7).push('G');
    stacks.get(7).push('C');

    stacks.get(8).push('L');
    stacks.get(8).push('D');
    stacks.get(8).push('T');
    stacks.get(8).push('R');
    stacks.get(8).push('H');
    stacks.get(8).push('P');
    stacks.get(8).push('F');
    stacks.get(8).push('S');
  }
  
  public void part1() throws FileNotFoundException { 
    Scanner sc = new Scanner(new File("./inputs/input5.txt"));
    while (sc.hasNextLine()) {
      String next = sc.nextLine();
      String[] words = next.split(" ");
      int numCrates = Integer.parseInt(words[1]);
      int startCrate = Integer.parseInt(words[3]) - 1;
      int endCrate = Integer.parseInt(words[5]) - 1;

      for (int i = 0; i < numCrates; i++) {
        char temp = stacks.get(startCrate).pop();
        stacks.get(endCrate).push(temp);
      } 
    }
    
    for (Stack<Character> s: stacks)
      System.out.print(s.peek());
    
    sc.close();
  }

  public void part2() throws FileNotFoundException {
    Scanner sc = new Scanner(new File("./inputs/input5.txt"));
    while (sc.hasNextLine()) {
      String next = sc.nextLine();
      String[] words = next.split(" ");
      int numCrates = Integer.parseInt(words[1]);
      int startCrate = Integer.parseInt(words[3]) - 1;
      int endCrate = Integer.parseInt(words[5]) - 1;

      ArrayList<Character> temp = new ArrayList<Character>();
      for (int i = 0; i < numCrates; i++)
        temp.add(0, stacks.get(startCrate).pop());
      stacks.get(endCrate).addAll(temp); 
    }
    
    for (Stack<Character> s: stacks)
      System.out.print(s.peek());
    
    sc.close();
  }
}
