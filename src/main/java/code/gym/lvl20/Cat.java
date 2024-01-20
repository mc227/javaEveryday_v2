package code.gym.lvl20;


import java.io.PrintWriter;

public class Cat {
    public String name;
    public int age;
    public int weight;

    public void save(PrintWriter writer) throws Exception {
        writer.println(name);
        writer.println(age);
        writer.println(weight);
        writer.flush();
    }


    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Mark";
        cat.age = 39;
        cat.weight = 200;
        try (PrintWriter writer = new PrintWriter("mark.txt")){
            cat.save(writer);
            System.out.println("Successfully saved cat info!!!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}