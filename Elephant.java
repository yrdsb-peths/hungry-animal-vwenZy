import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("a")){
            move(-2);
        }
        if(Greenfoot.isKeyDown("d")){
            move(2);
        }
        if(Greenfoot.isKeyDown("space")){
            turn(2);
        }
    }
    
}
