class ForLoop {
  
  public static void main(String[] args) {

    // A for loop that runs 10 times
    // Notice how i starts at 0.
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }

    // Question: In the above for-loop, what is our starting index, ending index, and how much will i increase after each iteration of the loop.

    // If we wanted to loop through an array, we use a for loop as well.
    String[] groceries = {"Bread", "Cheese", "Butter", "Milk"};
    for (int i = 0; i < groceries.length; i++) {
      System.out.println(groceries[i]);
    }
    
  }
  
}