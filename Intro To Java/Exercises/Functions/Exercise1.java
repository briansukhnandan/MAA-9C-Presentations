class Exercise1 {

  public static String evenOdd(int n) {
    if (n % 2 == 0) {
      return "Even";
    }
    else {
      return "Odd";
    }
  }
  
  public static void main(String[] args) {
    System.out.println(evenOdd(18));
    System.out.println(evenOdd(21));
  }
  
}