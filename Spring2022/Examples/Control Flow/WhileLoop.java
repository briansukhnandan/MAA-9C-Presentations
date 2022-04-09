import java.util.Random;

class WhileLoop {
  
  public static void main(String[] args) {

    // Create random number.
    Random rand = new Random();
    int upper_bound = 25;
    int random_num = rand.nextInt(upper_bound);

    int i = 0;
    while (random_num > 0) {
      random_num--;
      i++;
    }

    System.out.println(i);
    
  }
  
}