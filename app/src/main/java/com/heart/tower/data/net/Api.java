package com.heart.tower.data.net;

import com.heart.tower.entities.CallRez;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface Api {

    @GET("failik.php")
    Call<CallRez> call(@Header("User-Agent") String userAgent, @Header("Accept-Language") String lang);
}
