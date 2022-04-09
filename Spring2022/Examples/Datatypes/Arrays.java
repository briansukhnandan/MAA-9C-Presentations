class Arrays {
  public static void main(String[] args) {
    
    // Arrays can store anything yes, but each array can only store one type.
    // Meaning that for example we can have an array of ints, array of strings, etc.
    // We cannot mix and match with arrays in Java.
    int[] my_first_array = {1, 2, 3, 4, 5};

    // Mention that arrays start at 0.
    // What will be printed below?
    System.out.println(my_first_array[0]);
    System.out.println(my_first_array[2]);
    System.out.println(my_first_array[4]);

    // If we want to make an empty array, we must specify a size beforehand.
    String[] my_first_string_array = new String[5];

    // To overwrite the slots of an array, we can use the square brackets.
    my_first_string_array[0] = "Hello";
    my_first_string_array[1] = "World";
    my_first_string_array[2] = "Yay";

    // We can also get information about the array such as the length.
    System.out.println(my_first_array.length);

    // Exercise: Make a grocery list array. We will be learning how to 
    // print it all at once when we get to for loops.
    
  }
}