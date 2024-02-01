package code.gym.java.course.java.core.save.data.Externalizable;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Cat implements Externalizable {
    public String name;
    public int age;
    public int weight;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.name);
        out.writeObject(this.age);
        out.writeObject(this.weight);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        age = (int) in.readObject();
        weight = (int) in.readObject();
    }
}
