import java.io.*;
import java.util.*;
import java.nio.file.*;

class Day1 {
  
  public static void readContents() throws IOException {
    List<String> lines = Files.readAllLines(Paths.get("./inputs/input1.txt"));
    for (String line: lines) {
      System.out.println(line);
    }
  }
}