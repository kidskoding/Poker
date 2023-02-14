import greenfoot.*;
public class Button extends Actor
{
    private GreenfootImage text;
    private GreenfootImage buttonLayout;
    public Button(String name) {
        buttonLayout = new GreenfootImage(300, 100);
        buttonLayout.drawRect(100, 100, 100, 20);
        buttonLayout.setColor(Color.RED);
        buttonLayout.fill();
        setImage(buttonLayout);
        
        text = new GreenfootImage(name, 40, null, null);
        buttonLayout.drawImage(text, 18, 35);
    }
}
