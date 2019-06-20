import com.google.gson.Gson;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.InputStream;

public class JsonTest {

    @Test
    public void testUserFromJson() throws Exception{
        InputStream stream = ClassLoader.getSystemResourceAsStream("users.json");
        String json = IOUtils.toString(stream, "UTF8");
        User user = new Gson().fromJson(json, User.class);
        System.out.println(user.login);

    }

    @Test
    public void testUserToJson() throws Exception{
        User user = new User();
        user.login = "aleks-iv";
        user.email = "al@mail.ru";
        System.out.println(new Gson().toJson(user));
    }

}
