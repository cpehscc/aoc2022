import java.io.*;
import java.util.*;

class Day7 {
  
  public Day7() {
    super();
  }
  public void part1() throws FileNotFoundException {
    Scanner sc = new Scanner(new File("./inputs/input7.txt"));
    MyTreeNode<String> root = new MyTreeNode<>("/");
    MyTreeNode<String> current = root;
    while (sc.hasNextLine()) {
      String nextLine = sc.nextLine();
      String[] tokens = nextLine.split(" ");
      if (tokens[0] == "$") {
        if (tokens[1] == "cd") {
          if (tokens[2] == "..") // $ cd .. 
            current = current.getParent();
          else { // $ cd directory
            String directory = tokens[2];
            current = current.getChild(directory);
          }
        }
        else { // $ ls 
          continue;
        }
      }
      else { 
        if (tokens[0] == "dir") { // dir
          String name = tokens[1];
          current.addChild(name);
        }
        else { // file
          String name = tokens[1];
          current.addChild(name);
        }
      }
    }
    sc.close();
  }

  public void part2() throws FileNotFoundException {
    Scanner sc = new Scanner(new File("./inputs/input7.txt"));
    while (sc.hasNextLine()) {
      String next = sc.nextLine();
    }
    sc.close();
  }
}