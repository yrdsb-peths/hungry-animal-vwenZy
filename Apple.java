import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Apple extends Actor
{
    public void act()
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        int appleLife = 3;
        setLocation(x, y + 7);
        
        MyWorld world = (MyWorld) getWorld();
        /*if(getY() > world.getHeight() && world.getLife() == 0) {
            world.gameOver();
            world.removeObject(this);
        }
        if(getY() > world.getHeight() && world.getLife() != 0) {
            world.setLife(world.getLife() - 1);
            world.spawnApple();
        }*/
        
        if(getY() > world.getHeight()) {
            world.setLife(appleLife - 1);
            appleLife = world.getLife();
            if(appleLife < 0) {
                world.gameOver();
                world.removeObject(this);
            } else {
                world.removeObject(this);
                world.spawnApple();
            }
        }
        if(Greenfoot.isKeyDown("j")){
            move(-2);
        }
        if(Greenfoot.isKeyDown("l")){
            move(2);
        }
        if(Greenfoot.isKeyDown("space")){
            turn(2);
        }
        if(Greenfoot.isKeyDown("k")){
            moveDown();
        }
        if(Greenfoot.isKeyDown("i")){
            moveUp();
        }
    }
    public void moveDown(){
        setLocation(getX(), getY()+2);
    }
    public void moveUp(){
        setLocation(getX(), getY()-2);
    }
}
