import java.io.*;
import java.util.*;
import java.nio.file.*;

class Main {

  public static void readContents() throws IOException {
    List<String> lines = Files.readAllLines(Paths.get("input.txt"));
    for (String line: lines) {
      System.out.println(line);
    }
  }
  
  public static void main(String[] args) {
    System.out.println("Hello world!");
    try {
      readContents();
    }
    catch (IOException ex) {
      System.out.println(ex.toString());
    }
  }
}