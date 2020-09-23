package codeprepUnicode;

public class Main01 {
  public static void main(String[] args) {
    System.out.println(Math.pow(2, 8));

    System.out.println("---------------------");
    System.out.println(Math.pow(2, 16));

    System.out.println("---------------------");
    for (int i = 0; i <256; i++) {
      System.out.println(
        String.format("%3s", Integer.toString(i)) +
        "：" +
        String.format("%2s", Integer.toHexString(i)).replace(" ", "0").toUpperCase() +
        "：" +
        String.format("%8s", Integer.toBinaryString(i)).replace(" ", "0")
      );
    }
  }
}
