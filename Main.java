import java.io.*;

class Main {
  
  public static void main(String[] args) {
    try {
      Day6 test = new Day6();
      test.part1();
    }
    catch (FileNotFoundException ex) {
      System.out.println(ex.toString());
    }
  }
}