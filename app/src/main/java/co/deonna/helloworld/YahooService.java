package co.deonna.helloworld;

import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by dhodges on 7/21/17.
 */

public interface YahooService {

    @GET("yql?format=json")
    Single<YahooStockResult> yqlQuery(

            @Query("q") String query,
            @Query("env") String env
    );
}
