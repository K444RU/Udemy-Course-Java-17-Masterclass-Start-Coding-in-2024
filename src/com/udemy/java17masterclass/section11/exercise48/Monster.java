package java17masterclass.section11.exercise48;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(this.name);
        list.add(String.valueOf(this.hitPoints));
        list.add(String.valueOf(this.strength));
        return list;
    }

    @Override
    public void read(List<String> saved) {
        if (saved != null && !saved.isEmpty()) {
            this.name = saved.get(0);
            this.hitPoints = Integer.parseInt(saved.get(1));
            this.strength = Integer.parseInt(saved.get(2));
        }
    }

    @Override
    public String toString() {
        return "Monster{name='" + this.name + "', hitPoints=" + this.hitPoints +
                ", strength=" + this.strength + "}";
    }
}
