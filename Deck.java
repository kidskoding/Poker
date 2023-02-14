import greenfoot.*;
import java.util.*;
public class Deck extends Actor
{
    private Stack<Card> deck;
    public Deck() {
        this.deck = new Stack<Card>();
        this.createDeck();
    }
    public void createDeck() {
        for(int k = 0; k < 52; k++) {
            Card aCard = new Card(k);
            deck.push(aCard);
        }
        this.shuffle();
    }
    public void shuffle() {
        
    }
    public Stack<Card> getDeck() {
        return deck;
    }
}