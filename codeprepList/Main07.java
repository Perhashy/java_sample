package codeprepList;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main07 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= 10; i++) {
      list.add(i);
    }

    System.out.println(list);
    System.out.println(list.stream());

    System.out.println("---------------------");
    List<Integer> list2 = list.stream().collect(Collectors.toList());
    System.out.println(list2);
  }
}
