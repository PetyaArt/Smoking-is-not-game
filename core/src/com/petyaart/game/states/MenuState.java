package com.petyaart.game.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.petyaart.game.SmokingGame;

import static com.petyaart.game.SmokingGame.HEIGHT;
import static com.petyaart.game.SmokingGame.WIDTH;


/**
 * Created by Peter on 31.01.2018.
 */

public class MenuState extends State {

    private Texture mPlaybtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        mCamera.setToOrtho(false, SmokingGame.WIDTH / 2, SmokingGame.HEIGHT / 2);
        mPlaybtn = new Texture("playbtn.png");
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
        sb.setProjectionMatrix(mCamera.combined);
        sb.begin();
        sb.draw(mPlaybtn, ((WIDTH / 4) - mPlaybtn.getWidth() / 2), HEIGHT / 4);
        sb.end();

    }

    @Override
    public void dispose() {
        mPlaybtn.dispose();
    }
}
