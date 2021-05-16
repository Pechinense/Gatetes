package com.example.gatetes.WebServiceClient;

import com.example.gatetes.Clases.Gatetes;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface WebServiceClient {
    public static final String BASE_URL= "https://api.thecatapi.com/v1/";
    public static final String API_KEY= "x-api-key: 928008da-dd55-4958-af7c-9f1c0f98e1ee";


    @Headers(API_KEY)
    @GET("breeds")
    Call<List<Gatetes>> getRazas();

}
