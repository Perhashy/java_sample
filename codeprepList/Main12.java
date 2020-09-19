package codeprepList;

import java.util.List;
import java.util.LinkedList;

public class Main12 {
  private static void reference(List<Integer> list, int index) {
    long start = System.currentTimeMillis();
    int n = list.get(index);
    System.out.println(String.format("要素： %d, 所要時間： %d ms", n, System.currentTimeMillis() - start));
  }
  public static void main(String[] args){
    int count = 800000;
    LinkedList<Integer> list = new LinkedList<>();
    for (int i = 1; i <= count; i++) {
      list.add(i);
    }
    reference(list, 0);
    reference(list, count / 2);
    reference(list, list.size() - 1);
  }
}
