package app.models;

public class Animal {

    protected String name;
    private static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int distance) {
    }

    public void swim(int distance) {
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}