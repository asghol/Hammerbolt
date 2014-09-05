package no.knowit.hammerbolt;

import com.kilobolt.framework.Screen;
import com.kilobolt.framework.implementation.AndroidGame;

public class HammerboltGame extends AndroidGame {
    @Override
    public Screen getInitScreen() {
        return new LoadingScreen(this);
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
