package invadem;

import processing.core.PImage;

/**
 * the tank of the player 2
 */
public class Tank2 extends AbstractTank {

    public Tank2(int x, int y) {
        super(x, y);
    }

    /**
     * load hearts of the tank
     */
    @Override
    public void loadHearts() {
        hearts[0] = new Heart(20, 95);
        hearts[1] = new Heart(60, 95);
        hearts[2] = new Heart(100, 95);
    }

    /**
     * load images of the tank
     */
    @Override
    public void loadImages() {
        sprites = new PImage[2];
        sprites[0] = p.loadImage("src/main/resources/tank2.png");
        sprites[1] = p.loadImage("src/main/resources/tank2_boom.png");
        currentSpriteIndex = 0;

    }


}
