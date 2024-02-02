package code.gym.java.course.java.multithreading;

public class Main {
    public static void main(String[] args) {
//        String s = "cat";
//        s = s + "-" + s;
//        System.out.println(s);
        String s = "cat";
        StringBuilder s2 = new StringBuilder(s);
        s2.append("-");
        s2.append(s);
        s = s2.toString();
        System.out.println(s);
    }
}
