package code.gym.lvl20.lesson3;

import java.io.*;

public class Cat implements Serializable {
    public String name;
    public int age;
    public int weight;

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cat cat = new Cat();
        FileOutputStream fileOutputStream = new FileOutputStream("cat.dat");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(cat);
        fileOutputStream.close();
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("cat.dat");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Object object = objectInputStream.readObject();
        fileInputStream.close();
        objectInputStream.close();

        Cat c = (Cat) object;
    }
}
