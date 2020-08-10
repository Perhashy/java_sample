package progate.Java4.Java4_5;

public class Main {
  public static void main(String[] args) {
    Person person1 = new Person();
    person1.hello();
    person1.name = "hashy";
    System.out.println(person1.name);

    Person person2 = new Person();
    person2.hello();
    person2.name = "hashy2";
    System.out.println(person2.name);
  }
}