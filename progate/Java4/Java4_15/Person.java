package progate.Java4.Java4_15;

public class Person {
  public static int count = 0;

  public String firstName;
  public String middleName;
  public String lastName;
  public int age;
  public double height;
  public double weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    Person.count ++;

    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }
  Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
    Person.count ++;

    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  public double bmiCalc() {
    return this.weight / this.height / this.height;
  }

  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("BMIは" + this.bmiCalc() + "です");
  }

  public static void printCount() {
    System.out.println("合計" + Person.count + "人です");
  }
}