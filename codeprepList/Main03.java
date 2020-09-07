package codeprepList;

import java.util.List;
import java.util.ArrayList;

public class Main03 {
  public static void main(String[] args) {
    List<Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    List<Integer> list2 = new ArrayList<>();
    list2.add(3);
    list2.add(4);

    System.out.println(list1);
    System.out.println(list2);

    list1.addAll(list2);
    System.out.println(list1);
    System.out.println(list2);
  }
}
