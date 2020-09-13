package codeprepList;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Main04 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    for (int i=1; i<=10; i++) {
      list.add("Item-" + i);
    }

    for (String item : list) {
      System.out.println(item);
    }

    System.out.println("---------------------");
    Iterator<String> it = list.iterator();
    while (it.hasNext()) {
      String item = it.next();
      System.out.println(item);
    }
  }
}
