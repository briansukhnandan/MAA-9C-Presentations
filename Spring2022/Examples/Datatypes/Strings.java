class Strings {
  public static void main(String[] args) {
    
    // Let's make 2 strings.
    String my_first_string = "My name is ";
    String my_second_string = "Brian";

    // Adding 2 strings is the same as combining them together one after the other.
    // This operation is known as string concatenation.
    // There are two ways to achieve it:
    System.out.println(my_first_string + my_second_string); // Using +
    System.out.println(my_first_string.concat(my_second_string)); // Using .concat()
    // Result: My name is Brian

    // We can also append characters to strings. Java will take care of the conversion.
    char test_character = 'S';
    System.out.println(my_second_string + test_character); // BrianS

    // We can also access a specific part of a string if we want to.
    // Remember that a String is an array of characters under the hood.
    // This is why the 0 means start at beginning of String up to (and not including) 
    // character 3.
    String part_of_string = my_second_string.substring(0, 3);
    System.out.println(part_of_string); // Bri

    // We can also access individual letters of a string like an array.
    // When we do this, a singular character will be returned.
    char single_letter = my_second_string.charAt(1);
    System.out.println(single_letter); // r

    // We can also get information about the string such as its length.
    System.out.println(my_second_string.length()); // 5 - Length of "Brian"

    // As well as make it upper/lowercase using .toUpperCase() and .toLowerCase()
    System.out.println(my_second_string.toUpperCase()); // BRIAN
    System.out.println(my_second_string.toLowerCase()); // brian
    
  }
}