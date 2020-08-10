package progate.Java4.Java4_19;

public class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    Person person2 = new Person("John", "Christopher", "Smith", 65, 1.75, 80.0);

    person1.printData();
    person2.printData();

    System.out.println("----------------------");
    System.out.println("person2のミドルネームは" + person2.getMiddleName() + "です");
  }
}