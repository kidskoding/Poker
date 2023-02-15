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
        Stack<Card> left = new Stack<Card>();
        Stack<Card> right = new Stack<Card>();
        int numCards = deck.size();
        for(int i = 0; i < numCards / 2; i++) {
            left.push(deck.pop());
        }
        while(deck.size() > 0) {
            right.push(deck.pop());
        }
        Random rand = new Random();
        while(left.size() > 0 || right.size() > 0) {
            int x = rand.nextInt(3) + 1;
            for(int i = 0; i < x; i++) {
                if(left.size() > 0) {
                    deck.push(left.pop());
                }
            }
            int y = rand.nextInt(3) + 1;
            for(int i = 0; i < y; i++) {
                if(right.size() > 0) {
                    deck.push(right.pop());
                }
            }
        }
    }
    public Stack<Card> getDeck() {
        return deck;
    }
}