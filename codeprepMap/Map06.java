package codeprepMap;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;

public class Map06 {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("a", "Apple");
    map.put("b", "Banana");
    map.put("c", "Cherry");

    Iterator<String> it = map.keySet().iterator();
    while (it.hasNext()) {
      String key = it.next();
      System.out.println(key);
    }

    System.out.println("---------------------");
    Iterator<String> it2 = map.values().iterator();
    while (it2.hasNext()) {
      String value = it2.next();
      System.out.println(value);
    }
  }
}