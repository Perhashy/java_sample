package progate.Java4.Java4_21;

public class Person {
  private static int count = 0;

  private String firstName;
  private String middleName;
  private String lastName;
  private int age;
  private double height;
  private double weight;
  private String job;

  Person(String firstName, String lastName, int age, double height, double weight, String job) {
    Person.count ++;

    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.job = job;
  }
  Person(String firstName, String middleName, String lastName, int age, double height, double weight, String job) {
    this(firstName, lastName, age, height, weight, job);
    this.middleName = middleName;
  }

  public String getMiddleName() {
    return this.middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getJob() {
    return this.job;
  }

  public void setJob(String job) {
    this.job = job;
  }

  public String fullName() {
    if (this.middleName == null) {
      return this.firstName + " " + this.lastName;
    } else {
      return this.firstName + " " + this.middleName + " " + this.lastName;
    }
  }

  public double bmiCalc() {
    return this.weight / this.height / this.height;
  }

  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("BMIは" + this.bmiCalc() + "です");
    System.out.println("仕事は" + this.job + "です");
  }

  public static void printCount() {
    System.out.println("合計" + Person.count + "人です");
  }
}