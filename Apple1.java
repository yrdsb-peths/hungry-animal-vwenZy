import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Apple.
 * 
 * @author Zhang
 * @version May 23 version 2
 */
public class Apple1 extends Actor
{
    /**
     * Act - do whatever the Apple1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        setLocation(getX(), getY() + 1);
        
        // Remove apple and draw 'Game Over'
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight()) {
            world.gameOver();
            world.removeObject(this);
        }
    }
}
