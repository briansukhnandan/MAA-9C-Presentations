class Exercise6 {

  public static String reverse(String n) {
    String rev = "";
    for (int i = n.length()-1; i >= 0; i--) {
      rev = rev + n.charAt(i);
    }

    return rev;
    
  }
  
  public static void main(String[] args) {
    System.out.println(reverse("Hello"));
  }
  
}