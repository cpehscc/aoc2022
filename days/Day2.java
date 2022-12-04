import java.io.*;
import java.util.*;

class Day2 {
  
  public static void part1() throws FileNotFoundException {
    Scanner sc = new Scanner(new File("./inputs/input2.txt"));
    int points = 0;
    while (sc.hasNextLine()) {
      String next = sc.nextLine();
      String[] shapes = next.split(" ");
      switch (shapes[1]) {
        case "X": 
          points += 1;
          switch (shapes[0]) {
            case "A":
              points += 3;
              break;
            case "B":
              break;
            case "C":
              points += 6;
              break;
          }
          break;
        case "Y":
          points += 2;
          switch (shapes[0]) {
          case "A":
            points += 6;
            break;
          case "B":
            points += 3;
            break;
          case "C":
            break;
          }
          break;
        case "Z":
          points += 3;
          switch (shapes[0]) {
          case "A":
            break;
          case "B":
            points += 6;
            break;
          case "C":
            points += 3;
            break;
          }
          break;
      } 
    }
    sc.close();
    System.out.println(points);
  }

public static void part2() throws FileNotFoundException {
    Scanner sc = new Scanner(new File("./inputs/input2.txt"));
    int points = 0;
    while (sc.hasNextLine()) {
      String next = sc.nextLine();
      String[] shapes = next.split(" ");
      switch (shapes[1]) {
        case "X": 
          switch (shapes[0]) {
            case "A":
              points += 3;
              break;
            case "B":
              points += 1;
              break;
            case "C":
              points += 2;
              break;
          }
          break;
        case "Y":
          points += 3;
          switch (shapes[0]) {
          case "A":
            points += 1;
            break;
          case "B":
            points += 2;
            break;
          case "C":
            points += 3;
            break;
          }
          break;
        case "Z":
          points += 6;
          switch (shapes[0]) {
          case "A":
            points += 2;
            break;
          case "B":
            points += 3;
            break;
          case "C":
            points += 1;
            break;
          }
          break;
      }
    }
    sc.close();
    System.out.println(points);
  }
}