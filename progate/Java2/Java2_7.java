package progate.Java2;

public class Java2_7 {
  public static void main(String[] args) {
    int num = 13;

    switch (num % 5) {
      case 0:
        System.out.println("大吉です");
        break;
      case 1:
        System.out.println("中吉です");
        break;
      case 4:
        System.out.println("凶です");
        break;
      default:
        System.out.println("吉です");
        break;
    }
  }
}