package progate.Java4.Java4_13;

public class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);

    person1.printData();

    System.out.println("合計" + Person.count + "人です");
  }
}