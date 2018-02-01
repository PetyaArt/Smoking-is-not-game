package com.petyaart.game.states;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by Peter on 31.01.2018.
 */

public abstract class State {

    protected OrthographicCamera mCamera;
    protected Vector3 mouse;
    protected GameStateManager gsm;

    public State(GameStateManager gsm){
        this.gsm = gsm;
        mCamera = new OrthographicCamera();
        mouse = new Vector3();
    }

    protected abstract void handleInput(); //Метод для пользовательского ввода
    public abstract void update(float dt); //Обнавляет картинки через определенные промежутки времени
    public abstract void render(SpriteBatch sb);
    public abstract void dispose();

}
