public class Sample3 {
  public static void main(String[] args) {
    // 変数を使った計算
    int a = 4;
    int b = a + 3;
    System.out.println(b);

    // 計算と代入を同時に行う
    a += 2;
    System.out.println(a);

    // インクリメント
    int c = 2;
    System.out.println(c);
    System.out.println(++c);
    System.out.println(c++);
    System.out.println(c);
  }
}