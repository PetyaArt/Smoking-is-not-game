package com.petyaart.game.sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.petyaart.game.SmokingGame;


import static java.lang.Math.sqrt;

/**
 * Created by Peter on 31.01.2018.
 */

public class Ball {
    private Vector3 mPosition;
    private Texture mBall;
    private double playerSpeed=60;
    private double playerMoveX=0;
    private double playerMoveY=0;
    private Rectangle square;

    public Ball(int x, int y){
        mPosition = new Vector3(x, y, 0);
        mBall = new Texture("square.png");
        PlayerVector(MathUtils.random(-1f, 1f), MathUtils.random(0.3f, 1f));
        square = new Rectangle(x, y, mBall.getWidth(), mBall.getHeight());
    }

    public Texture getBall() {
        return mBall;
    }

    public Vector3 getPosition() {
        return mPosition;

    }

    public void update(){
       mPosition.x +=(playerMoveX*playerSpeed) * Gdx.graphics.getDeltaTime();
       mPosition.y +=(playerMoveY*playerSpeed) * Gdx.graphics.getDeltaTime();
        square.setPosition(mPosition.x, mPosition.y);
       if (mPosition.x >= SmokingGame.WIDTH / 2 - 5){
           playerMoveX*=-1;
       }
       if (mPosition.x <= 0){
           playerMoveX*=-1;
       }
       if (mPosition.y >= SmokingGame.HEIGHT / 2 - 5){
           playerMoveY*=-1;
       }
    }

    public void PlayerVector(final double _x,final double _y)
    {
        playerMoveX=_x;
        playerMoveY=_y;

        double len = sqrt(playerMoveX*playerMoveX+playerMoveY*playerMoveY);

        playerMoveX/=len;
        playerMoveY/=len;
    }

    public boolean collides(Rectangle player){
        return player.overlaps(square);
    }

    public void setPlayerMoveY(double playerMoveY) {
        this.playerMoveY *= playerMoveY;
    }

    public void setPlayerMoveX(double playerMoveX) {
        this.playerMoveX *= playerMoveX;
    }

    public void dispose() {
        mBall.dispose();
    }
}
