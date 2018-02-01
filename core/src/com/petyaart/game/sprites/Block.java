package com.petyaart.game.sprites;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;

/**
 * Created by Peter on 31.01.2018.
 */

public class Block {
    private Vector3 mPosition;
    private Texture mBlock;
    private Rectangle mBLockTrue;
    private boolean mShow;

    public Block(float x, float y){
        mPosition = new Vector3(x, y, 0);
        mBlock = new Texture("square.png");
        mBLockTrue = new Rectangle(x, y, mBlock.getWidth(), mBlock.getHeight());
        mShow = true;
    }

    public boolean isShow() {
        return mShow;
    }

    public void setShow(boolean show) {
        mShow = show;
    }

    public Vector3 getPosition() {
        return mPosition;
    }

    public Texture getBlock() {
        return mBlock;
    }

    public Rectangle getBLockTrue() {
        return mBLockTrue;
    }

    public void reposition(int x){

    }

    public void dispose() {
        mBlock.dispose();
    }
}
