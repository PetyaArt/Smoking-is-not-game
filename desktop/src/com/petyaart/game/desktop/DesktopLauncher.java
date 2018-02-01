package com.petyaart.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.petyaart.game.SmokingGame;

import static com.petyaart.game.SmokingGame.HEIGHT;
import static com.petyaart.game.SmokingGame.WIDTH;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = WIDTH;
		config.height = HEIGHT;
		new LwjglApplication(new SmokingGame(), config);
	}
}
