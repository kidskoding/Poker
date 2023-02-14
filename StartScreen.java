import greenfoot.*;
import java.io.*;
public class StartScreen extends World
{
    private Actor button1;
    private Actor button2;
    public StartScreen() {    
        super(1280, 720, 1);
        makeScreen();
        button1 = new Instructions();
        button2 = new StartButton();
        this.addObject(button1, 401, 298);
        this.addObject(button2, 931, 298);
    }

    private void makeScreen() {
        GreenfootImage bg = new GreenfootImage(this.getWidth(), 
                this.getHeight());
        greenfoot.Color blue = new greenfoot.Color(84, 203, 235);
        bg.setColor(blue);
        bg.fill();
        this.setBackground(bg);
    }
}