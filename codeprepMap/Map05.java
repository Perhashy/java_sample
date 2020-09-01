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
  }
}