package codeprepExc;

enum Status {
  NotStarted,
  Processing,
  Finished,
}

public class Main08 {
  private static void printStatus(Status status) {
    switch (status) {
      case NotStarted:
        System.out.println("まだ処理されていません");
        break;
      case Processing:
        System.out.println("処理中です");
        break;
      case Finished:
        System.out.println("処理済みです");
        break;
      default:
        throw new IllegalStateException();
    }
  }
  public static void main(String[] args) {
    printStatus(Status.Processing);
  }
}
