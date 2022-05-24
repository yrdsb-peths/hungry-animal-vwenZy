import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Elephant.
 * 
 * @author Zhang
 * @version May 23 version 2
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    // GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] flyRight = new GreenfootImage[4];
    GreenfootImage[] flyLeft = new GreenfootImage[4];
    
    // Direction the elephant is facing.
    String facing = "right";
    
    /**
     * Constructor - The code that gets run one time when object is created.
     */
    public Elephant()
    {
        for(int i = 0; i < flyRight.length; i++)
        {
            flyRight[i] = new GreenfootImage("images/bird_fly/fly" + i + ".png");
            flyRight[i].scale(80, 70);
        }
        
        for(int i = 0; i < flyLeft.length; i++)
        {
            flyLeft[i] = new GreenfootImage("images/bird_fly/fly" + i + ".png");
            flyLeft[i].mirrorHorizontally();
            flyLeft[i].scale(80, 70);
        }
        // Initial elephant image.
        setImage(flyRight[0]);
    }
    
    /*
     * Animate the elephant
     */
    int imageIndex = 0;
    public void animateElephant()
    {
        if(facing.equals("right")) {
            setImage(flyRight[imageIndex]);
            imageIndex = (imageIndex + 1) % flyRight.length;
        } else {
            setImage(flyLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % flyLeft.length;
        }
    }
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left")) {
            move(-1);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("right")) {
            move(1);
            facing = "right";
        }
        if(Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + 1);
        }
        if(Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - 1);
        }
        
        // Remove the apple when touching.
        eat();
        
        // Animate the elephant.
        animateElephant();
    }
    
    /**
     * Eat the apple and spawn new apple if an apple is eaten.
     */
    public void eat()
    {
        // check if elephant is touching apple
        if(isTouching(Apple1.class)) {
            removeTouching(Apple1.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            // elephantSound.play();
        }
    }
}
