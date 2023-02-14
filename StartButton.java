import greenfoot.*;
public class StartButton extends Actor
{
    private GreenfootImage text;
    private GreenfootImage buttonLayout;
    
    public StartButton() {
        buttonLayout = new GreenfootImage(300, 100);
        buttonLayout.drawRect(100, 100, 100, 20);
        buttonLayout.setColor(Color.RED);
        buttonLayout.fill();
        setImage(buttonLayout);
        
        text = new GreenfootImage("START", 40, null, null);
        buttonLayout.drawImage(text, 100, 35);
    }
    public void act()
    {
        if(Greenfoot.mouseClicked(this)) {
            Greenfoot.setWorld(new Poker());
        }
    }
}
