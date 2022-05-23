import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 */
public class MyWorld extends World
{
    public int score = 0;
    public int life = 3;
    public Label scoreLabel = new Label(score, 80);
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        
        Elephant e = new Elephant();
        addObject(e, 300, 350);
 
        // Create a score label
        addObject(scoreLabel, 50, 50);
        
        spawnApple();
    }
    
    public void spawnApple()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        Apple a1 = new Apple();
        addObject(a1, x, y);
    }
    
    public int getScore()
    {
        return score;
    }
    
    public int getLife()
    {
        return life;
    }
    
    public void setLife(int x)
    {
        x = life;
    }
    
    public void spawnElephant()
    {
        int x = 300;
        int y = 300;
        Elephant e2 = new Elephant();
        addObject(e2, x, y);
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over!", 100);
        addObject(gameOverLabel, 300, 200);
    }
}
