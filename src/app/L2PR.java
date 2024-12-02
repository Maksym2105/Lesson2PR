package app;

import app.models.Animal;
import app.models.Cat;
import app.models.Dog;

public class L2PR {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Мурчик");
        Cat cat2 = new Cat("Барсік");
        Dog dog1 = new Dog("Бобік");
        Dog dog2 = new Dog("Умка");

        cat1.run(150);
        cat1.swim(10);

        cat2.run(350);
        cat2.swim(85);

        dog1.run(450);
        dog1.swim(15);

        dog2.run(700);
        dog2.swim(5);



        System.out.println("Кількість тварин: " + Animal.getAnimalCount() + ".");
        System.out.println("Кількість собак: " + Dog.getDogCount() + ".");
        System.out.println("Кількість котів: " + Cat.getCatCount() + ".");
    }
}