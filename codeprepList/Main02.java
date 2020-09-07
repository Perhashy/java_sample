package codeprepList;

import java.util.List;
import java.util.ArrayList;

public class Main02 {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(2);

    list.add(2, 3);
    list.add(3, 4);
    System.out.println(list);
  }
}
