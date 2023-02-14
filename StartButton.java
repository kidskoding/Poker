import greenfoot.*;
public class StartButton extends Button
{
    public StartButton() {
        super("START");
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Poker());
        }
    }
}
