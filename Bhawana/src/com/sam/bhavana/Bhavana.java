package com.sam.bhavana;

import java.rmi.dgc.DGC;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.scenes.scene2d.ui.Widget;

public class Bhavana extends Game {

	public static int WIDTH;
	public static int HEIGHT;
	private Splash splashScreen;
	private TimerScreen timerScreen;

	@Override
	public void create() {
		WIDTH = Gdx.graphics.getWidth();
		HEIGHT = Gdx.graphics.getHeight();

		Texture.setEnforcePotImages(false);
        timerScreen = new TimerScreen(this);
		splashScreen = new Splash(this, timerScreen);
        setScreen(splashScreen);              

	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	@Override
	public void dispose() {
	}

}