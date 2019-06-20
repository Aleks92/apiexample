import org.junit.Test;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class GitHubTest {

    @Test
    public void testRepositories() throws Exception {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.github.com/")
                .build();
        GitHubClient client = retrofit
                .create(GitHubClient.class);

        List<Repository> body = client.listRepos("Aleks92").execute().body();

        assertThat(body.get(0).owner.login, equalTo("Aleks92"));
        System.out.println(body.get(0).owner.login);


    }
}
