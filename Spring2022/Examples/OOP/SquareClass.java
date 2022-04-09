class Square {

  // Attributes, or descriptors for our Square.
  public int length;

  // Our constructor. Let's us say Square(n) meaning a square with side length n.
  public Square(int l) {
    this.length = l;
  }

  // Function to calculate the area, simply does side * side.
  public int area() {
    int area = this.length * this.length;
    return area;
  }

  public int perimeter() {
    return this.length * 4;
  }

}

class SquareClass {

  public static void main(String args[]) {
    System.out.println("Hello World");

    Square s = new Square(5);
    System.out.println(s.area());
  }  
}