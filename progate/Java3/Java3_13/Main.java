package progate.Java3.Java3_13;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("名前：");
    String firstName = sc.next();

    System.out.print("名字：");
    String lastName = sc.next();

    System.out.print("年齢：");
    int age = sc.nextInt();

    System.out.print("身長(m)：");
    double height = sc.nextDouble();

    System.out.print("体重(kg)：");
    double weight = sc.nextDouble();

    Person.printData(Person.fullName(firstName, lastName), age, height, weight);
  }

}