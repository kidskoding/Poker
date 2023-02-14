import greenfoot.*;
import java.io.*;
import java.awt.Desktop;
public class Instructions extends Actor
{
    private GreenfootImage text;
    private GreenfootImage buttonLayout;
    
    public static final File f = new File("C:\\Users\\aniru\\OneDrive\\Documents\\Greenfoot\\Poker\\images\\pokerhands.jpg");
    public Instructions() {
        buttonLayout = new GreenfootImage(300, 100);
        buttonLayout.drawRect(100, 100, 100, 20);
        buttonLayout.setColor(Color.RED);
        buttonLayout.fill();
        setImage(buttonLayout);
        
        text = new GreenfootImage("View Poker Hands", 40, null, null);
        buttonLayout.drawImage(text, 18, 35);
    }
    public void act() {
        if(Greenfoot.mouseClicked(this)) {
            try {
                Desktop desktop = Desktop.getDesktop();
                if(!Desktop.isDesktopSupported()) {
                    return;
                }
                if(f.exists()) {
                    desktop.open(f);
                }
            }
            catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}