package codeprepList;

import java.util.List;
import java.util.LinkedList;

public class Main11 {
  public static void main(String[] args){
    LinkedList<Integer> list = new LinkedList<>();
    list.add(2);
    list.add(3);
    list.add(4);

    list.addFirst(1);
    list.addLast(5);

    System.out.println(list);
  }
}
