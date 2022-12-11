class Point {

  private int xCor;
  private int yCor;
  
  public Point(int x, int y) {
    xCor = x;
    yCor = y;
  }

  public String toString() {
    return ("x: " + Integer.toString(xCor) + " y: " + Integer.toString(yCor));
  }

  public int getX() {
    return xCor;
  }

  public int getY() {
    return yCor;
  }

  public boolean equals(Point p) {
    return (xCor == p.getX() && yCor == p.getY());
  }
}