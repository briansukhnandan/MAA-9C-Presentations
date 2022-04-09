class Dog {

  public String name;
  public int age;
  public String breed;

  public Dog(String n, int a, String b) {
    this.name = n;
    this.age = a;
    this.breed = b;
  }

  public void bark() {
    System.out.println("Woof!");
  }

  public void setName(String s) {
    this.name = s;
  }
  
}

class DogClass {
  public static void main(String args[]) {

    Dog d = new Dog("Sparky", 5, "Rottweiler");
    d.bark();
    
  }
}