package codeprepMap;

import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collections;

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

    System.out.println("---------------------");
    Iterator<Map.Entry<String, String>> it3 = map.entrySet().iterator();
    while (it3.hasNext()) {
      Map.Entry<String, String> entry = it3.next();
      System.out.println(entry.getKey() + " = " + entry.getValue());
    }

    System.out.println("---------------------");
    for (Map.Entry<String, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + " = " + entry.getValue());
    }

    System.out.println("---------------------");
    map.forEach((key, value) -> {
      System.out.println(key + " = " + value);
    });

    System.out.println("---------------------");
    Map<String, String> map2 = Collections.synchronizedMap(map);
    System.out.println(map2);
  }
}