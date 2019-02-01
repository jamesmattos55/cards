package edu.cnm.deepdive;

/**
 * This enum implements suits of a standard  playing cards. Each enumerated value uses the standard
 * symbol from that suite taken from unicode as its string representation.
 *
 * @author James Mattos &amp; Deep Dive Coding Java + Android Bootcamp Cohort 6
 * @version 1.0
 */
public enum Suit {

  CLUBS("\u2663", Color.BLACK),
  DIAMONDS("\u2662", Color.RED),
  HEARTS("\u2661", Color.RED),
  SPADES("\u2260", Color.BLACK);

  private final String symbol;
  private final Color color;

  private Suit(String symbol, Color color) {
    this.symbol = symbol;
    this.color = color;
  }

  public Color getColor(){
    return color;
  }

  @Override
  public String toString() {
    return symbol;
  }

  public enum Color {
    RED, BLACK;
  }
}
