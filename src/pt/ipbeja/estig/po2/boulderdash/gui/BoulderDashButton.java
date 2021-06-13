import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Created by Fausto Arquilino (15966) and Tiago Santos (15964)
 * 31/05/2021
 * https://github.com/drh0use1/boulder-dash-C-implementation/tree/master/Textures
 */

public class BoulderDashButton extends Button {

    private static final Image Wall = new Image("/resources/Wall.png");
    private static final Image Diamond = new Image("/resources/Diamond.png");
    private static final Image Earth = new Image("/resources/Earth.png");
    private static final Image Empty = new Image("/resources/Empty.png");
    private static final Image Miner = new Image("/resources/Miner.png");
    private static final Image Monster = new Image("/resources/Monster.png");
    private static final Image Rock = new Image("/resources/Rock.png");

    private final ImageView imageView;

    public BoulderDashButton()
    {
        this.imageView = new ImageView();
        this.imageView.setFitWidth(50);
        this.imageView.setFitHeight(50);
        this.setGraphic(this.imageView);
        this.setPadding(Insets.EMPTY);
        this.setFocusTraversable(false);

    }

    /**
     * Sets a wall image
     */
    public void setWallImage()
    {
        this.imageView.setImage(Wall);
    }

    /**
     * Sets a diamond image
     */
    public void setDiamondImage()
    {
        this.imageView.setImage(Diamond);
    }

    /**
     * Sets a earth image
     */
    public void setEarthImage()
    {
        this.imageView.setImage(Earth);
    }

    /**
     * Sets the empty image
     */
    public void setEmptyImage()
    {
        this.imageView.setImage(Empty);
    }

    /**
     * Sets the miner image
     */
    public void setMinerImage() { this.imageView.setImage(Miner); }

    /**
     * Sets the monster image
     */
    public void setMonsterImage() { this.imageView.setImage(Monster); }

    /**
     * Sets the rock image
     */
    public void setRockImage() { this.imageView.setImage(Rock); }
}
