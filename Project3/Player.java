package Project3;

public class Player {
    private int lives;

    public Player(){
        this.lives = 5;
    }

    public Player(int lives){
        this.lives = lives;
    }

    public int getLives(){
        return lives;
    }

    public void death(){
        lives--;
    }
    
}