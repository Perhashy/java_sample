public class Sample6 {
  public static void main(String[] args) {
    int num = 30;
    if (num % 5 == 0) {
      System.out.println("5で割り切れます");
    } else if (num % 3 == 0) {
      System.out.println("3で割り切れます");
    } else {
      System.out.println("5でも3でも割り切れません");
    }
    
    // 三項演算子
    String s = num %5 == 0 ? "5で割り切れます" : "5で割り切れません";
    System.out.println(s);
  }
}