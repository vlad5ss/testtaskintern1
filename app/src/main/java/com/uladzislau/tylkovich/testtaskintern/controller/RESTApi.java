package com.uladzislau.tylkovich.testtaskintern.controller;

import com.uladzislau.tylkovich.testtaskintern.model.RESTresponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by mac on 6/21/17.
 */

public interface RESTApi {
    @GET("place/nearbysearch/json?")
    Call<RESTresponse> getPlaces(@Query("key") String key, @Query("location") String coordinates, @Query("radius") String radius);
}
