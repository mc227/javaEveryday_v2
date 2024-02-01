package code.gym.java.blog.serialization.in.java;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        FileOutputStream fileOutputStream = new FileOutputStream("piper.ser");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//        objectOutputStream.writeObject(new UserInfo("Piper","Roddy", "Passport info"));
//        fileOutputStream.close();
//        objectOutputStream.close();
        FileInputStream fileInputStream = new FileInputStream("piper.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        UserInfo userInfo = (UserInfo) objectInputStream.readObject();
        System.out.println(userInfo);
        objectInputStream.close();
    }
}
