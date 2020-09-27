package codeprepExc;

public class Main01 {
  private static int divide(int a, int b) {
    try {
      return a / b;
    } catch (ArithmeticException e) {
      return 0;
    }
  }
  public static void main(String[] args) {
    System.out.println("テスト：" + divide(12, 4));
    System.out.println("テスト：" + divide(12, 0));
    System.out.println("テスト：" + divide(12, 2));
  }
}
