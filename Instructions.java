import greenfoot.*;
import java.io.*;
import java.awt.Desktop;
public class Instructions extends Button
{
    public static final File f = new File("C:\\Users\\aniru\\OneDrive\\Documents\\Greenfoot\\Poker\\images\\pokerhands.jpg");
    public Instructions() {
        super("View Poker Hands");
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