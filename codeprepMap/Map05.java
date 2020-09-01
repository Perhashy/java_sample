package codeprepMap;

import java.util.Map;
import java.util.HashMap;

public class Map05 {
  public static void main(String[] args) {
    Map<String, String> map = new HashMap<>();
    map.put("a", "Apple");
    map.put("b", "Banana");

    System.out.println(map.getOrDefault("a", "Anime"));
    System.out.println(map.getOrDefault("c", "Cartoon"));
  }
}