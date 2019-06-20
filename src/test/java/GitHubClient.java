import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface GitHubClient {
    @GET("users/{user}/repos")
    Call<List<Repository>> listRepos(@Path("user") String user);


}
