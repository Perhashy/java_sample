package progate.Java3;

public class Java3_5 {
  public static void main(String[] args) {
    String name = fullName("Kate", "Jones");

    System.out.println(name);
  }

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }
}