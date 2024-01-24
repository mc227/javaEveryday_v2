package code.gym.lvl20;

import java.io.BufferedReader;
import java.io.PrintWriter;

public class Human {
    public Cat cat;
    public Dog dog;

    public void save(PrintWriter writer) throws Exception {
        cat.save(writer);
        dog.save(writer);
    }

    public void load(BufferedReader reader) throws Exception {
        cat = new Cat();
        cat.load(reader);
        dog = new Dog();
        dog.load(reader);
    }
}
