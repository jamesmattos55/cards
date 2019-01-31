package edu.cnm.deepdive;

/**
 * Instances of this class represent single cards in adeck of standard playing cards.
 * These instances are immutable : once initialized, the rank and suit of a card cant be changed.
 *
 * @author James Mattos
 * @version 1.0
 */

public class Card {

  private Rank rank;
  private Suit suit;

  /**
   * Initializes the <code>Card</code> instance with the specified {@link Suit} and {@link Rank}.
   * @param rank card's rank (a, 2, &hellip; K).
   * @param suit card's suit (Club, Diamonds, Hearts, Spades)
   */

  public Card(Rank rank, Suit suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public Rank getRank() {
    return rank;
  }

  public Suit getSuit() {
    return suit;
  }

  @Override
  public String toString() {
    return String.format("%s %s", rank, suit);
  }

}
