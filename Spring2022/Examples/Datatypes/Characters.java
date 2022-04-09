class Characters {
  public static void main(String[] args) {
    
    char letter_1 = 'a';
    char letter_2 = 'b';
    char letter_3 = 'c';

    // Question to ask class: Can anyone guess why this prints out an integer value instead of 'abc'?
    System.out.println(letter_1 + letter_2 + letter_3);

    // We can make a character uppercase and lowercase
    // using Character.toUpperCase() and Character.toLowerCase()
    System.out.println(Character.toUpperCase(letter_1));

    String s = 'a' + 'b';
    System.out.println(s);
    
  }
}