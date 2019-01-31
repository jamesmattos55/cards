package edu.cnm.deepdive;

/**
 * This enum implements suits of a standard  playing cards. Each enumerated
 * value uses the standard symbol from that suite taken from unicode as its string
 * representation.
 *
 * @author James Mattos &amp; Deep Dive Coding Java + Android Bootcamp Cohort 6
 * @version 1.0
 */
public enum Suit {
  CLUBS("C"),
  DIAMONDS("D"),
  HEARTS("H"),
  SPADES("S");

  private final String symbol;

  private Suit(String symbol) {
    this.symbol = symbol;
  }

  @Override
  public String toString() {
    return symbol;
  }
}
