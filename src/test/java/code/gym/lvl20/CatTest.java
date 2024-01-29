package code.gym.lvl20;

import org.junit.jupiter.api.Test;
import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CatTest {

    @Test
    public void testSaveAndLoad() {
        Cat cat = new Cat();
        cat.name = "Tom";
        cat.age = 3;
        cat.weight = 5;

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintWriter printWriter = new PrintWriter(outputStream);

        try {
            cat.save(printWriter);
            printWriter.close();

            ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            Cat loadedCat = new Cat();
            loadedCat.load(bufferedReader);

            assertEquals(cat.name, loadedCat.name);
            assertEquals(cat.age, loadedCat.age);
            assertEquals(cat.weight, loadedCat.weight);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
