package jankenSample;

import java.util.Random;

public class Player {
  private String name;
  private Random random = new Random();

  public Player(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public Hand nextHand() {
    int n = random.nextInt(3);
    return Hand.fromInt(n);
  }
}