package codeprepExc;

public class Main06 {
  private static int divide(int a, int b) {
    // return a/ b;

    // if (b == 0) {
    //   throw new IllegalArgumentException("除数が0です");
    // }
    // return a/ b;

    try {
      return a / b;
    } catch (ArithmeticException e) {
      throw new IllegalArgumentException("除数が0です", e);
    }
  }

  public static void main(String[] args) {
    System.out.println("テスト1：" + divide(12, 4));
    System.out.println("テスト2：" + divide(12, 0));
    System.out.println("テスト3：" + divide(12, 2));
  }
}
