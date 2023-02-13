import greenfoot.*;
public class StartScreen extends World
{
    public StartScreen()
    {    
        super(1280, 720, 1); 
        makeScreen();
    }
    private void makeScreen() {
        GreenfootImage text = new GreenfootImage("Welcome, please type your name", 
        45, null, null);
        Color blue = new Color(84, 203, 235);
        GreenfootImage bg = new GreenfootImage(this.getWidth(), this.getHeight());
        bg.setColor(blue);
        bg.fill();
        bg.drawImage(text, this.getWidth() / 3 - 35, 50);
        this.setBackground(bg);
    }
    
}
