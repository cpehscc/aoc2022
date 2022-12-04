import java.io.*;

class Main {
  
  public static void main(String[] args) {
    try {
      Day4.part2();
    }
    catch (FileNotFoundException ex) {
      System.out.println(ex.toString());
    }
  }
}