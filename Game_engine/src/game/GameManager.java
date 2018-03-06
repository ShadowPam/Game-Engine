package game;

import game_engine.AbstractGame;
import game_engine.GameLoop;
import game_engine.Render;

public class GameManager extends AbstractGame {

    public GameManager(){
    }

    @Override
    public void update(GameLoop gc, float dt) {
    }

    @Override
    public void render(GameLoop gc, Render r) {
    }
    
    public static void main(String args[]){
        GameLoop gc = new GameLoop(new GameManager());
        gc.start();  
    }
    
}
