package pt.ipbeja.estig.po2.boulderdash.model;

import javafx.scene.control.ButtonType;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Created by Fausto Arquilino (15966) and Tiago Santos (15964)
 * 15/06/2021
 */

public class LevelDesign {

    private int chosenLevel;

    public LevelDesign() {

    }

    public int getChosenLevel() {
        return chosenLevel;
    }

    /**
     * Sets the level number of the game
     * @param chosenLevel the level number
     */
    public void setChosenLevel(int chosenLevel) {
        this.chosenLevel = chosenLevel;
    }

    /**
     * Set the level map of the game
     * @return a array of strings that represents the level map
     */
    public String[] selectLevelDesign() {

        try {
            if (this.chosenLevel == 1) {
                List<String> level = Files.readAllLines(Paths.get("src//files//Level1//level1_map.txt"));
                return level.toArray(new String[0]);

            }
            if (this.chosenLevel == 2) {
                List<String> level = Files.readAllLines(Paths.get("src//files//Level2//level2_map.txt"));
                return level.toArray(new String[0]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

