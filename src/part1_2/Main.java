package part1_2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Part 1.2");
        ArrayList<Animal> list = new ArrayList<>();
        list.add(new Cat());
        list.add(new Dog());
        list.add(new Cow());
        list.add(new Dog());

        for (Animal animal : list) {
            animal.makeSound();
        }
    }
}
