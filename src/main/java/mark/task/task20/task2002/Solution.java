package mark.task.task20.task2002;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static class CodeGym {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter writer = new PrintWriter(outputStream);
            if (this.users.size() > 0) {
                for(User current: this.users){
                    StringBuilder sb = new StringBuilder();
                    sb.append(current.getFirstName());
                    sb.append("/");
                    sb.append(current.getLastName());
                    sb.append("/");

                }
            }
        }

        public void load(InputStream inputStream) throws Exception {

        }
    }
}
