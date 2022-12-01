import java.io.*;

class Main {
  
  public static void main(String[] args) {
    try {
      Day1.readContents();
    }
    catch (FileNotFoundException ex) {
      System.out.println(ex.toString());
    }
  }
}