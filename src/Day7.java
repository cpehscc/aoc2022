import java.io.*;
import java.util.*;

class Day7 {

  private int sum; 
  private int delete;
  private int required;
  
  public Day7() {
    sum = delete = required = 0;
  }
  
  public void part1() throws FileNotFoundException {
    Scanner sc = new Scanner(new File("./inputs/input7.txt"));
    MyTreeNode root = new MyTreeNode("/", "dir");
    MyTreeNode current = root;
    while (sc.hasNextLine()) {
      String nextLine = sc.nextLine();
      String[] tokens = nextLine.split(" ");
      if (tokens[0].equals("$")) {
        if (tokens[1].equals("cd")) {
          if (tokens[2].equals("..")) // $ cd .. 
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
        if (tokens[0].equals("dir")) { // dir
          String name = tokens[1];
          current.addChild(name, "dir");
        }
        else { // file
          int size = Integer.parseInt(tokens[0]);
          String name = tokens[1];
          current.addChild(name, "file", size);
        }
      }
    }
    getSum(root);
    System.out.println(sum);
    sc.close();
  }

  public void getSum(MyTreeNode root) {
    MyTreeNode current = root;
    if (current.getType().equals("dir") && current.getSize() <= 100000)
      sum += current.getSize();
    if (current.hasChildren()) {
      for (MyTreeNode t: current.getChildren())
        getSum(t);
    }
  }

  public void part2() throws FileNotFoundException {
    Scanner sc = new Scanner(new File("./inputs/input7.txt"));
    MyTreeNode root = new MyTreeNode("/", "dir");
    MyTreeNode current = root;
    while (sc.hasNextLine()) {
      String nextLine = sc.nextLine();
      String[] tokens = nextLine.split(" ");
      if (tokens[0].equals("$")) {
        if (tokens[1].equals("cd")) {
          if (tokens[2].equals("..")) // $ cd .. 
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
        if (tokens[0].equals("dir")) { // dir
          String name = tokens[1];
          current.addChild(name, "dir");
        }
        else { // file
          int size = Integer.parseInt(tokens[0]);
          String name = tokens[1];
          current.addChild(name, "file", size);
        }
      }
    }
    int unused = 70000000 - root.getSize();
    required = 30000000 - unused;
    delete = root.getSize();
    getDelete(root);
    System.out.println(delete);
    sc.close();
  }

  public void getDelete(MyTreeNode current) {
    if (current.getType().equals("dir") && current.getSize() >= required && current.getSize() < delete) 
      delete = current.getSize();
    if (current.hasChildren()) {
      for (MyTreeNode t: current.getChildren())
        getDelete(t);
    }
  }
}