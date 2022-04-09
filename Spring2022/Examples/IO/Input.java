import java.util.Scanner;

class Input {
  
  public static void main(String[] args) {
    Scanner my_scanner = new Scanner(System.in);

    System.out.println("Enter a word");

    String word = my_scanner.nextLine();  // Read user input
    System.out.println("The user input the word: " + word);  // Output user input
  }
  
}