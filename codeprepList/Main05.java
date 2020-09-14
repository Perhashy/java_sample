package codeprepList;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main05 {
  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    Collections.addAll(list, "aaa", "bbb", "ccc");

    System.out.println(list);
  }
}
