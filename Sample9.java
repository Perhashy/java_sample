public class Sample9 {
  String s = "str";
  static String ss = "sstr";

  public void method1() {
    System.out.println("非static");
  }

  public static void method2() {
    System.out.println("static");
  }
  public static void main(String[] args) {
    // System.out.println(s); 直接呼び出せない
    // インスタンスを作成して使える
    String s = new String("str");
    System.out.println(s);
    // 直接呼び出せる
    System.out.println(ss);

    // method1(); 呼び出せない
    // 呼び出せる
    method2();
  }
}