package code.gym.lvl20;


import java.io.BufferedReader;
import java.io.PrintWriter;

public class Cat {
    public String name;
    public int age;
    public int weight;

    public void save(PrintWriter writer) throws Exception{
        writer.println(name);
        writer.println(age);
        writer.println(weight);
        writer.flush();
    }

    public void load(BufferedReader reader) throws Exception{
        name = reader.readLine();
        age = Integer.parseInt(reader.readLine());
        weight = Integer.parseInt(reader.readLine());
    }
}