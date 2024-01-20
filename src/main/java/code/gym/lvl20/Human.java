package code.gym.lvl20;

import java.io.BufferedReader;
import java.io.PrintWriter;

public class Human {
    public Cat cat;
    public Dog dog;

    public void save(PrintWriter writer) throws Exception{
        String isCatPresent = cat != null ? "Yes" : "No";
        writer.println(isCatPresent);
        writer.flush();

        if (cat != null)
            cat.save(writer);

        String isDogPresent = dog != null ? "Yes" : "No";
        writer.println(isDogPresent);
        writer.flush();

        if (dog != null)
            dog.save(writer);
    }

    public void load(BufferedReader reader) throws Exception{
        String isCatPresent = reader.readLine();
        if (isCatPresent.equals("Yes"))
            cat = new Cat();
            cat.load(reader);

        String isDogPresent = reader.readLine();
        if (isDogPresent.equals("Yes"))
            dog = new Dog();
            dog.load(reader);
    }
}
