package two.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        try{
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            Human human = new Human("Smith", new Asset("home",999_999.99),new Asset("car",2999.9));
            human.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            inputStream.close();
            System.out.println(human.equals(somePerson));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static class Human {
        private String name;
        private List<Asset> assets = new ArrayList<>();

        public Human(String name, Asset... assets) {
            this.name = name;
            if(assets!=null){
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        public Human() {
        }

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter writer = new PrintWriter(outputStream);
            writer.println(this.name);
            for(Asset current: this.assets){
                writer.println(current.getName());
                writer.println(current.getPrice());
            }
            writer.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            this.name = reader.readLine();
            while(reader.ready()) {
                String assetName = reader.readLine();
                double assetPrice = Double.parseDouble(reader.readLine());
                this.assets.add(new Asset(assetName,assetPrice));
            }
            reader.close();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return assets != null ? assets.equals(human.assets) : human.assets == null;
        }
        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }
    }
}
