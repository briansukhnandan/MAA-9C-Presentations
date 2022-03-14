class Exercise5 {

  public static int maxOf3Ints(int a, int b, int c) {

    int max = 0;
    if (a < b) {
      max = b; // Set max to be greater of the 2.
    }

    if (max < c) {
      max = c;
    }

    return max;
  }
  
  public static void main(String[] args) {
    System.out.println(maxOf3Ints(2, 27, 6));
  }
  
}