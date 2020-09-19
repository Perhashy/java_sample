package codeprepList;

import java.util.List;
import java.util.ArrayList;

public class Main09 {
  public static void addElements(List<Integer> list, int count) {
    long start = System.currentTimeMillis();
    for (int i = 1; i <= count; i++) {
      list.add(i);
    }
    System.out.println(String.format("所要時間： %d ms", System.currentTimeMillis() - start));
  }
  public static void main(String[] args){
    int count = 6000000;
    List<Integer> list1 = new ArrayList<>(count);
    addElements(list1, count);

    System.out.println("---------------------");
    List<Integer> list2 = new ArrayList<>(2);
    addElements(list2, count);
  }
}
