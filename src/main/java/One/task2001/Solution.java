package One.task2001;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

    }

    public static class Human {
        public String name;
        public List<Asset> assets = new ArrayList<>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if(assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }
        public void save(OutputStream outputStream) throws Exception {
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.println(this.name);
            if(this.assets.size() > 0) {
                for (Asset current:this.assets){
                    printWriter.println(current.getName());
                    printWriter.println(current.getPrice());
                }
            }
            printWriter.close();
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            this.name = reader.readLine();
            while (reader.ready()){
                String assetName = reader.readLine();
                double assetPrice = Double.parseDouble(reader.readLine());
                this.assets.add(new Asset(assetName,assetPrice));
            }
            reader.close();
        }
    }
}
