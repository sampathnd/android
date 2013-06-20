package com.sam.bhavana;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Splash implements Screen {

	private Texture logo;
	private SpriteBatch spriteBatch;
	private Bhavana bhavana;
	private TimerScreen timerScreen;

	public Splash(Bhavana bhavana, TimerScreen timerScreen) {
		this.bhavana = bhavana;
		this.timerScreen = timerScreen;
	}
	
	@Override
	public void show() {
		logo = new Texture(Gdx.files.internal("baboon.png"));
		spriteBatch = new SpriteBatch();
	}

	@Override
	public void render(float delta) {
		handleInput();

		GL10 gl = Gdx.graphics.getGL10();        
		gl.glClear(GL10.GL_COLOR_BUFFER_BIT);

		spriteBatch.begin();
		spriteBatch.draw(logo, 0, 0, Bhavana.WIDTH, Bhavana.HEIGHT);
		spriteBatch.end();

	}
	
	 private void handleInput()
	    {
	        if(Gdx.input.justTouched())
	        {
	            bhavana.setScreen(timerScreen);
	        }
	    }

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}


	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
