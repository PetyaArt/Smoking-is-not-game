package com.petyaart.game.sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.petyaart.game.SmokingGame;

/**
 * Created by Peter on 31.01.2018.
 */

public class Cigarette {
    private Vector3 mPosition;
    private Texture cigarette;
    private Rectangle cigaretteBlock;

    public Cigarette(int x, int y){
        mPosition = new Vector3(x, y, 0);
        cigarette = new Texture("cigarette.jpg");
        cigaretteBlock = new Rectangle(x, y, cigarette.getWidth(), cigarette.getHeight());
    }

    public Vector3 getPosition() {
        return mPosition;
    }

    public Texture getCigarette() {
        return cigarette;
    }

    public void update(){
        cigaretteBlock.setPosition(mPosition.x, mPosition.y);
    }

    public void LeftOrRight(float lr) {
        if (lr == 0f)mPosition.x -= 100 * Gdx.graphics.getDeltaTime();
        if (lr == 1f)mPosition.x += 100 * Gdx.graphics.getDeltaTime();
        check();
    }

    public void shift(float lol){
        mPosition.x = lol;
        check();
    }

    public void check(){
        if (mPosition.x  <= 0) mPosition.x = 0;
        if (mPosition.x >= (SmokingGame.WIDTH / 2 - 84)) mPosition.x = (SmokingGame.WIDTH / 2 - 84);
    }

    public Rectangle getCigaretteBlock() {
        return cigaretteBlock;
    }
}
