import greenfoot.*;
public class Input extends World
{
    private World w;
    public Input()
    {
        super(1280, 720, 1);
        String name = "@#$@#$";
        w = new StartScreen();
        while(!name.matches("[A-Za-z]{1,}")) {
            name = Greenfoot.ask("Please input your name!" + "\n" 
            + "It must consist of only Upper or lower case letters." 
            + "\n" + "NO SPACES OR SPECIAL LETTERS");
        }
        Greenfoot.setWorld(w);
        GreenfootImage greeting = new GreenfootImage("Welcome " + name + 
                    "!", 45, null, null);
        w.getBackground().drawImage(greeting, getWidth() / 3 + 80, 50);
    }
}