package no.knowit.hammerbolt;

import com.kilobolt.framework.Game;
import com.kilobolt.framework.Graphics;
import com.kilobolt.framework.Screen;

import static com.kilobolt.framework.Graphics.ImageFormat;

public class LoadingScreen extends Screen {
    public LoadingScreen(Game game) {
        super(game);
    }

    @Override
    public void update(float deltaTime) {
        Graphics graphics = game.getGraphics();
        Assets.menu = graphics.newImage("dragon.png", ImageFormat.RGB565);
        Assets.click = game.getAudio().createSound("bomb.ogg");

        game.setScreen(new MainMenuScreen(game));
    }

    @Override
    public void paint(float deltaTime) {

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

    @Override
    public void backButton() {

    }
}
