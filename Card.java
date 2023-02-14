import greenfoot.*;
public class Card extends Actor {
    private static String[] faces = {"ace", "2", "3", "4", "5", "6", "7", "8", 
        "9", "10", "jack", "queen", "king"};
    private static String[] suits = {"club", 
        "diamond", "heart", "spade"};
    private GreenfootImage back 
        = new GreenfootImage("playingcard_back_blue.png");
        
    private int id;
    private int value;
    private String suit;
    private String face;
    private GreenfootImage front;

    public Card(int idNum) {
        id = idNum;
        suit = suits[id/13];
        face = faces[id%13];
        front = new GreenfootImage(face + "_" + "of" + "_" + suit + "s" + ".jpg");
        back.scale(234 / 2, 322 / 2);
        front.scale(back.getWidth(), back.getHeight());
        setImage(front);
        value = 1 + id % 13;
        hideCard();
    }
    
    public void setBack(GreenfootImage back) {
        this.back = back;
        setImage(back);
    }
    public int getValue() {
        return value;
    }
    public void showCard() {
        setImage(front);
    }
    public void hideCard() {
        setImage(back);
    }
    public boolean isShowing() {
        return getImage() == front;
    }
    public void flip() {
        if(isShowing()) {
            setImage(back); 
        }
        else {
            setImage(front);
        }
    }
    
    public void act() { 
        if(Greenfoot.mouseClicked(this) && isShowing()) hideCard(); 
        else if(Greenfoot.mouseClicked(this) && !isShowing()) showCard(); 
    }
}