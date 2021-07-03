package Lesson4;

import java.util.Random;

public class Auto {
    Random random = new Random();
    private int number;
    private int speed;
    private int height;
    private int width;
    private int weight;
    private boolean isCargo;

    public int getNumber() {
        return number;
    }
    public int getSpeed() {
        return speed;
    }
    public int getHeight() {return height; }
    public int getWidth() {
        return width;
    }
    public int getWeight() {
        return weight;
    }
    public boolean isCargo() {
        return isCargo;
    }

    public Auto(int num) {
        this.number = num;
        this.speed = random.nextInt(150);
        this.height = random.nextInt(500);
        this.width = random.nextInt(300);
        this.weight = random.nextInt(40);
        this.isCargo = getWeight() > 5;
    }
}
