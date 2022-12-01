import java.io.*;

class Main {
  
  public static void main(String[] args) {
    System.out.println("Hello world!");
    try {
      Day1.readContents();
    }
    catch (IOException ex) {
      System.out.println(ex.toString());
    }
  }
}