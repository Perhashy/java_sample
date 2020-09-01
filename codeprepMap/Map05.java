package codeprepMap;

import java.util.Map;
import java.util.HashMap;

public class Map05 {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("a", "Apple");
    map.put("b", "Banana");

    System.out.println("---------------------");
    System.out.println(map.getOrDefault("a", "Anime"));
    System.out.println(map.getOrDefault("c", "Cartoon"));

    System.out.println("---------------------");
    System.out.println(map.size());

    System.out.println("---------------------");
    System.out.println(map.containsKey("a"));
    System.out.println(map.containsKey("c"));

    System.out.println("---------------------");
    System.out.println(map.containsValue("Apple"));
    System.out.println(map.containsValue("Cherry"));

    System.out.println("---------------------");
    // Map<String, String> map2 = new HashMap<String, String>();
    // map2.put("c", "Cherry");
    // map2.put("d", "Donut");

    // map.putAll(map2);
    System.out.println(map);
    map.putIfAbsent("a", "Apple");
    map.putIfAbsent("c", "Cherry");
    System.out.println(map);

    System.out.println("---------------------");
    System.out.println(map);
    map.remove("a");
    System.out.println(map);
  }
}