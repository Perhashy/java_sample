package codeprepList;

import java.util.List;
import java.util.ArrayList;

public class Main06 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(1);
    list.add(4);
    list.add(2);
    System.out.println(list);

    System.out.println("---------------------");
    list.sort(null);
    System.out.println(list);

    System.out.println("---------------------");
    list.sort((a, b) -> b - a);
    System.out.println(list);
  }
}
