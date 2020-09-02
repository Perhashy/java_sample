package codeprepMap;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Map07 {
  private static void testMap(Map<String, String> map) {
    map.put("a", "α");
    map.put("b", "β");
    map.put("g", "γ");
    map.put("d", "δ");
    map.put("e", "ε");

    System.out.println(map.getClass());
    map.forEach((key, value) -> {
      System.out.println(key + " = " + value);
    });
  }
  public static void main(String[] args) {
    testMap(new HashMap<String, String>());
    testMap(new LinkedHashMap<String, String>());
    testMap(new TreeMap<String, String>());
  }
}