import java.io.*;

class Main {
  
  public static void main(String[] args) {
    try {
      Day7 test = new Day7();
      test.part1();
    }
    catch (FileNotFoundException ex) {
      System.out.println(ex.toString());
    }
  }
}