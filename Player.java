import greenfoot.*;
import java.util.*;
public class Player {
    private int score;
    private List<Card> hand;
    private int name;
    public Player() {
        this.score = 0;
        this.hand = new ArrayList<Card>();
    }
    public int getScore() {
        return score;
    }
    public List<Card> getHand() {
        return hand;
    }
}
