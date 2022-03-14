class Exercise4and5 {

  public static float FtoC(int n) {
    float f = n-32;
    f = f * 0.5555f;
    return f;
  }

  public static float CtoF(int n) {
    float f = n * 1.8f;
    f = f + 32;
    return f;
  }
  
  public static void main(String[] args) {
    System.out.println(FtoC(212));
    System.out.println(CtoF(100));
  }
  
}