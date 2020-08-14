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
}