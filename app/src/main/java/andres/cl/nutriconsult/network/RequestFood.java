package andres.cl.nutriconsult.network;

import andres.cl.nutriconsult.models.PortionWrapper;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by Andrés on 10-08-2017.
 */

public interface RequestFood {

    @GET("search/{food}")
    Call<PortionWrapper> getFood(@Path("food") String food, @Query("fields") String fields);
    //item_name,nf_calories,nf_total_fat
}
