package code.gym.lvl20;


import java.io.BufferedReader;
import java.io.PrintWriter;

public class Human {
    public Cat cat;
    public Dog dog;

    public void save(PrintWriter writer) throws Exception {
        String isCatPresent = cat != null ? "yes":"no";
        writer.println(isCatPresent);
        writer.flush();
        if (cat != null)
            cat.save(writer);
        String isDogPresent = dog != null ? "yes":"no";
        writer.println(isDogPresent);
        writer.flush();
        if(dog != null)
            dog.save(writer);
    }

    public void load(BufferedReader reader) throws Exception {
        String isCatPresent = reader.readLine();
        if(isCatPresent.equals("yes")){
            cat = new Cat();
            cat.load(reader);
        }
        String isDogPresent = reader.readLine();
        if (isDogPresent.equals("yes")){
            dog = new Dog();
            dog.load(reader);
        }
    }
}


