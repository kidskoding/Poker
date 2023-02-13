import greenfoot.*;
public class Poker extends World
{
    public Poker() {       
        super(1280, 720, 1); 
        createGame();
    }
    private void createGame() {
        Color c = new Color(1, 126, 60);
        GreenfootImage bg = new GreenfootImage(this.getWidth(), this.getHeight());        
        bg.setColor(c);
        bg.fill();
        this.setBackground(bg);
    }
}
