package codeprepList;

import java.util.List;
import java.util.ArrayList;

public class Main10 {
  private static void addElements(List<Integer> list, int count, boolean bFirst) {
    long start = System.currentTimeMillis();
    for (int i = 1; i <= count; i++) {
      if (bFirst) {
        list.add(0, i);
      } else {
        list.add(i);
      }
    }
    System.out.println(String.format("所要時間： %d ms", System.currentTimeMillis() - start));

  }
  public static void main(String[] args){
    int count = 50000;
    List<Integer> list1 = new ArrayList<>(count);
    addElements(list1, count, false);
    addElements(list1, count, true);
    addElements(list1, count, false);
    addElements(list1, count, true);
    addElements(list1, count, false);
  }
}
