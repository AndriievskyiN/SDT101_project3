package soundmakers;

import java.util.ArrayList;

public class AnimalSoundTest {
    public static void main(String[] args) {
        ArrayList<SoundMaker> soundMakers = new ArrayList<>();

        soundMakers.add(new Cat());
        soundMakers.add(new Dog());
        soundMakers.add(new Cow());
        soundMakers.add(new Pig());
        soundMakers.add(new Bee());
        soundMakers.add(new Cricket());
        soundMakers.add(new Frog());

        System.out.println("Part 1.3");
        for (SoundMaker soundMaker : soundMakers) {
            soundMaker.makeSound();
        }
    }
}