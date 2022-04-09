class Conditionals {
  
  public static void main(String[] args) {
    int exam_score = 72;

    // The way to think about if-statements that make it easier is to pretend that the thing in the parenthesis is a statement that is either True or False. If that statement is True then the thing under the If statement will execute, if it is false then the thing under the Else will execute.
    if (exam_score > 85) {
      System.out.println("Gonna get pizza after class :)");
    }
    else {
      System.out.println("Gonna go home hungry :(");
    }

    // Question: What will the below If statement output?
    if (true) {
      System.out.println("NASA");
    }
    else {
      System.out.println("MAA");
    }

    // Question: What about this if-statement below?
    if (false) {
      System.out.println("NASA");
    }
    else {
      System.out.println("MAA");
    }
    
  }
  
}