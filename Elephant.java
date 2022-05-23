import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Elephant extends Actor
{
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("a")){
            move(-10);
        }
        if(Greenfoot.isKeyDown("d")){
            move(10);
        }
        if(Greenfoot.isKeyDown("space")){
            turn(2);
        }
        if(Greenfoot.isKeyDown("s")){
            moveDown();
        }
        if(Greenfoot.isKeyDown("w")){
            moveUp();
        }
        // Eat the apple
        if(isTouching(Apple.class)){
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.increaseScore();
            world.spawnApple();
        }
    }
    public void moveDown(){
        setLocation(getX(), getY()+8);
    }
    public void moveUp(){
        setLocation(getX(), getY()-8);
    }
}
