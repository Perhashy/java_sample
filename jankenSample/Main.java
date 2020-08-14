package jankenSample;

public class Main {
  public static void main(String[] args) {
    Player player1 = new Player("プレイヤー1");
    Player player2 = new Player("プレイヤー2");

    Hand hand1 = player1.nextHand();
    Hand hand2 = player2.nextHand();

    System.out.println(
      String.format("%s: %s - %s :%s",
      player1.getName(), hand1,
      hand2, player2.getName()
      )
    );
  }
}