class Human {

  public String name;
  public int age;
  public String birthday;

  public Human(String n, int a, String b) {
    this.name = n;
    this.age = a;
    this.birthday = b;
  }

  public void introduction() {
    System.out.printf("Hello! My name is %s, I am %d years old, and my birthday is %s\n", this.name, this.age, this.birthday);
  }
  
}

class HumanClass {
  public static void main(String args[]) {
    Human b = new Human("Brian Sukhnandan", 23, "February 25th");
    b.introduction();
  }
}