package jankenSample;

public enum Hand {
  Rock,
  Scissors,
  Paper;

  @Override
  public String toString() {
    switch (this) {
      case Rock: return "グー";
      case Scissors: return "チョキ";
      case Paper: return "パー";
    }
    throw new IllegalStateException();
  }

  public static Hand fromInt(int n) {
    switch (n % 3) {
      case 0: return Rock;
      case 1: return Scissors;
      case 2: return Paper;
    }
    throw new IllegalArgumentException(Integer.toString(n));
  }
}