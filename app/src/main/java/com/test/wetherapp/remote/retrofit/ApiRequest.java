package com.test.wetherapp.remote.retrofit;

import com.test.wetherapp.remote.model.Region1;
import com.test.wetherapp.remote.model.RegionGroup;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiRequest {
    @GET("group?")
    Call<RegionGroup> getGroup(
            @Query("id") String ids,
            @Query("units") String units,
            @Query("appid") String appId);

    @GET("weather?")
    Call<Region1> getRegion(
            @Query("q") String name,
            @Query("units") String units,
            @Query("appid") String appId);
}
