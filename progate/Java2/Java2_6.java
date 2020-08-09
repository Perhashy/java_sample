package progate.Java2;

public class Java2_6 {
  public static void main(String[] args) {
    int num = 12;

    switch (num % 3) {
      case 0:
        System.out.println("3で割り切れます");
        break;
      case 1:
        System.out.println("3で割ると1余ります");
        break;
      case 2:
        System.out.println("3で割ると2余ります");
        break;
    }
  }
}