import java.io.*;
import java.util.*;

class Day8 {

  int n;
  int[][] grid;

  public Day8() throws FileNotFoundException {
    Scanner sc = new Scanner(new File("./inputs/input8.txt"));
    n = 99;
    grid = new int[n][n];
    int i = 0;
    while (sc.hasNextLine()) {
      String next = sc.nextLine();  
      String[] tokens = next.split("");
      int j = 0;
      for (String s: tokens) {
        grid[i][j] = Integer.parseInt(s);
        j++;
      }
      i++;
    }
    sc.close();
  }
  
  public void part1() {
    int trees = 0;
    for (int k = 0; k < n; k++) {
      for (int l = 0; l < n; l++) {
         if (k == 0) 
           trees++;
         else if (k == n - 1)
           trees++;
         else if (l == 0)
           trees++;
         else if (l == n - 1)
           trees++;
         else {
           int current = grid[k][l]; 
           boolean visibleUp, visibleDown, visibleLeft, visibleRight;
           visibleUp = visibleDown = visibleLeft = visibleRight = true;
           for (int a = l - 1; a >= 0; a--) {
             if (grid[k][a] >= current)
               visibleLeft = false;
           }
           for (int b = l + 1; b < n; b++) {
             if (grid[k][b] >= current)
               visibleRight = false;
           }
           for (int c = k - 1; c >= 0; c--) {
             if (grid[c][l] >= current)
               visibleUp = false;
           }
           for (int d = k + 1; d < n; d++) {
             if (grid[d][l] >= current)
               visibleDown = false;
           }
           if (visibleLeft || visibleRight || visibleUp || visibleDown)
             trees++;
         }
      }             
    }
    System.out.println(trees);
  }

  public void part2() {
    ArrayList<Integer> scores =  new ArrayList<Integer>();
    for (int k = 0; k < n; k++) {
      for (int l = 0; l < n; l++) {
         if (k == 0) 
           scores.add(0);
         else if (k == n - 1)
           scores.add(0);
         else if (l == 0)
           scores.add(0);
         else if (l == n - 1)
           scores.add(0);
         else {
           int current = grid[k][l]; 
           int distanceLeft, distanceRight, distanceUp, distanceDown; 
           distanceLeft = distanceRight = distanceUp = distanceDown = 0;
           for (int a = l - 1; a >= 0; a--) {
             if (grid[k][a] < current)
               distanceLeft++;
             else {
               distanceLeft++;
               break;
             }
           }
           for (int b = l + 1; b < n; b++) {
             if (grid[k][b] < current)
               distanceRight++;  
             else {
               distanceRight++;
               break;
             }
           }
           for (int c = k - 1; c >= 0; c--) {
             if (grid[c][l] < current)
               distanceUp++;
             else {
               distanceUp++;
               break;
             }
           }
           for (int d = k + 1; d < n; d++) {
             if (grid[d][l] < current)
               distanceDown++;
             else {
               distanceDown++;
               break;
             }
           }
           scores.add(distanceLeft * distanceRight * distanceUp * distanceDown);
         }
      }
    }
    Collections.sort(scores, Collections.reverseOrder());
    System.out.println(scores.get(0));
  }
}