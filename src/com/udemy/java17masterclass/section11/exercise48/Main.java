package java17masterclass.section11.exercise48;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create a Player object
        Player player = new Player("Tim", 10, 15);
        System.out.println(player);
        saveObject(player);

        // Change Player's weapon and hitPoints
        player.setHitPoints(8);
        player.setWeapon("Axe");
        System.out.println(player);
        saveObject(player);

        // Read saved data back into Player
        List<String> savedValues = player.write();
        player.read(savedValues);
        System.out.println("After restoring:");
        System.out.println(player);

        // Create a Monster object
        Monster monster = new Monster("Werewolf", 20, 40);
        System.out.println(monster);
        saveObject(monster);

        // Simulate saving and restoring a Monster
        List<String> monsterSavedValues = monster.write();
        monster.read(monsterSavedValues);
        System.out.println("After restoring:");
        System.out.println(monster);
    }

    // Method to save an ISaveable object
    public static void saveObject(ISaveable objectToSave) {
        List<String> savedValues = objectToSave.write();
        System.out.println("Saving " + objectToSave.getClass().getSimpleName() + " data to storage:");
        for (int i = 0; i < savedValues.size(); i++) {
            System.out.println("Saved " + savedValues.get(i) + " to storage.");
        }
    }

    // Method to simulate reading from a storage medium (optional, can be extended)
    public static void loadObject(ISaveable objectToLoad, List<String> values) {
        objectToLoad.read(values);
        System.out.println("Loaded " + objectToLoad.getClass().getSimpleName() + " from storage.");
    }
}

