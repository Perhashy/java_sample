package codeprepMap;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class MyKey {
  private String key;

  public MyKey(String key) {
    this.key = key;
  }

  public String getKey() {
    return this.key;
  }

  @Override
  public String toString() {
    return this.key;
  }

  @Override
  public int hashCode() {
    return this.key.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    return obj instanceof MyKey && this.key.equals(((MyKey)obj).key);
  }
}

public class Map08 {
  private static void testMap(Map<MyKey, String> map) {
    map.put(new MyKey("a"), "α");
    map.put(new MyKey("b"), "β");
    map.put(new MyKey("g"), "γ");
    map.put(new MyKey("d"), "δ");
    map.put(new MyKey("e"), "ε");

    System.out.println(map.getClass());
    for (MyKey key : map.keySet()) {
      MyKey alternativeKey = new MyKey(key.getKey());
      System.out.println(key + " = " + map.get(key) + ", " + map.get(alternativeKey));
    }
  }
  public static void main(String[] args) {
    testMap(new HashMap<MyKey, String>());
    testMap(new LinkedHashMap<MyKey, String>());
    // testMap(new TreeMap<MyKey, String>());
  }
}