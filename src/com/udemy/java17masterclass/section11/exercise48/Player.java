package java17masterclass.section11.exercise48;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(this.name);
        list.add("" + this.hitPoints);
        list.add("" + this.strength);
        list.add(this.weapon);
        return list;
    }

    @Override
    public void read(List<String> saved) {
        if (saved != null && !saved.isEmpty()) {
            this.name = saved.get(0);
            this.hitPoints = Integer.parseInt(saved.get(1));
            this.strength = Integer.parseInt(saved.get(2));
            this.weapon = saved.get(3);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Player{name='" + this.name + "', hitPoints=" + this.hitPoints +
                ", strength=" + this.strength + ", weapon='" + this.weapon + "'}";
    }
}
