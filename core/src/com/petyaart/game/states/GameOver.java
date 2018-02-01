package com.petyaart.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import static com.petyaart.game.SmokingGame.HEIGHT;
import static com.petyaart.game.SmokingGame.WIDTH;


/**
 * Created by Peter on 31.01.2018.
 */

public class GameOver extends State {

    private Texture mGameOver;

    public GameOver(GameStateManager gsm) {
        super(gsm);
        Gdx.gl.glClearColor(0.3f, 0.3f, 0.3f, 1);
        mGameOver = new Texture("gameover.png");
    }

    @Override
    protected void handleInput() {
        if(Gdx.input.justTouched()){
            gsm.set(new PlayState(gsm));
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        sb.begin();
        sb.draw(mGameOver, ((WIDTH / 4) - mGameOver.getWidth() / 2), HEIGHT / 4);
        sb.end();

    }

    @Override
    public void dispose() {
        mGameOver.dispose();
    }
}
