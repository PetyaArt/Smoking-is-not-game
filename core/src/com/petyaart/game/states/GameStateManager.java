package com.petyaart.game.states;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Stack;

/**
 * Created by Peter on 31.01.2018.
 */

public class GameStateManager {

    private Stack<State> mStates;

    public GameStateManager(){
        mStates = new Stack<State>();
    }

    public void push(State state){
        mStates.push(state);
    }

    public void pop(State state){
        mStates.pop().dispose();
    }

    public void set(State state){
        mStates.pop().dispose();
        mStates.push(state);
    }

    public void update(float dt){
        mStates.peek().update(dt);
    }

    public void render(SpriteBatch sb){
        mStates.peek().render(sb);
    }
}
