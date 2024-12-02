package app.models;

public class Cat extends Animal{

    private static int catCount = 0;
    private static final int MAX_RUN_DISTANCE = 200;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= MAX_RUN_DISTANCE) {
            System.out.println(name + " пробіг " + distance + " м.");
        } else {
            System.out.println(name + " не може пробігти більше " + MAX_RUN_DISTANCE + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не вміє плавати.");
    }

    public static int getCatCount() {
        return catCount;
    }
}