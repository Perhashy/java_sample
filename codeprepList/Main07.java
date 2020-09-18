package codeprepList;

import java.util.List;
import java.util.ArrayList;

public class Main07 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    for (int i = 1; i <= 10; i++) {
      list.add(i);
    }

    System.out.println(list);
    System.out.println(list.stream());
  }
}
