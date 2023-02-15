import greenfoot.*;
import java.util.*;
public class Poker extends World {
    private Player player;
    private Player cpu;
    
    private List<Card> playerHand;
    private List<Card> cpuHand;
    private List<Card> cards;
    
    private int round;
    private Deck deck;
    
    public Poker() {  
        super(1280, 720, 1);
        this.player = new Player();
        this.cpu = new CPU();
        playerHand = player.getHand();
        cpuHand = cpu.getHand();
        this.deck = new Deck();
        this.round = 1;
        createGame();
    }
    
    private void createGame() {
        Color c = new Color(1, 126, 60);
        GreenfootImage bg 
            = new GreenfootImage(this.getWidth(), this.getHeight());        
        bg.setColor(c);
        bg.fill();
        this.setBackground(bg);
        GreenfootImage score = new GreenfootImage("Round " 
            + round + ": " + player.getScore() + " - " + cpu.getScore(), 
            45, null, null); 
        this.getBackground().drawImage(score, 50, 30);
        while(!deck.getDeck().isEmpty()) {
            Card aCard = deck.getDeck().pop();
            this.addObject(aCard, 1050, 400);
        }
        cards = this.getObjectsAt(1050, 400, Card.class);
        for(int i = 0; i < 10; i++) {
            if(i < 5) {
                playerHand.add(cards.get(i));
            }
            else {
                cpuHand.add(cards.get(i));
            }
        }
        int x = 0;
        for(Card card : playerHand) {
            card.setLocation(300 + x, 610);
            x += 150;
        }
        x = 0;        
        GreenfootImage redBack = new GreenfootImage("playingcard_back_red.png");
        redBack.scale(234 / 2, 322 / 2);
        for(Card card : cpuHand) {
            card.setBack(redBack);
            card.setLocation(300 + x, 180);
            x += 150;
        }
    }
    
    public void playGame() {
        for(Card card : playerHand) {
            card.showCard();
        }
        if(this.allFaceUp(playerHand)) {
            //Greenfoot.delay(80);
            for(Card card : playerHand) {
                if(playerHand.indexOf(card) != -1) {
                    if(Greenfoot.mouseClicked(card)) {
                        card.setLocation(100, 400);
                        Greenfoot.delay(20);
                        this.removeObject(card);
                        
                        Card newCard = cards.get(cards.size() - 1);                        
                        newCard.showCard();
                        newCard.setLocation(300 + 150 
                            * playerHand.indexOf(card), 610);
                    }
                }
                if(playerHand.indexOf(card) == -1) {
                    if(Greenfoot.mouseClicked(card)) {
                        card.showCard();
                    }
                }
            }
        }
        round++;
    }
    
    public void act() {
        playGame();
    }
    private boolean allFaceUp(List<Card> hand) {
        for(int i = 0; i < hand.size(); i++) {
            if(!hand.get(i).isShowing()) {
                return false;
            }
        }
        return true;
    }
}