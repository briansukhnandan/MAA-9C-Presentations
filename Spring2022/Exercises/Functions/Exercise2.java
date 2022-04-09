class Exercise2 {

  public static int multiplyAll(int[] n) {
    int product = 1;
    for (int i = 0; i < n.length; i++) {
      product *= n[i];
    }
    return product;
  }
  
  public static void main(String[] args) {
    int[] x = {1,2,3,4,5};
    System.out.println(multiplyAll(x));
  }
  
}