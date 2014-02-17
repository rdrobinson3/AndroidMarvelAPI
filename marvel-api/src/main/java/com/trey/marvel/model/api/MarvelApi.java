package com.trey.marvel.model.api;

import android.content.Context;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.squareup.okhttp.HttpResponseCache;
import com.squareup.okhttp.OkHttpClient;
import com.trey.marvel.model.api.request.RequestSignature;
import com.trey.marvel.model.api.response.DateAdapter;

import java.io.IOException;
import java.util.Date;

import retrofit.RestAdapter;
import retrofit.client.OkClient;
import retrofit.converter.GsonConverter;

/**
 * Created by Trey Robinson on 2/12/14.
 */
public class MarvelApi {

    public static final String PORT = "80";
    public static final String API_URL = "http://gateway.marvel.com" + ":" + PORT;

    private static MarvelApi API;

    private RestAdapter mRestAdapter;

    public static void create(String privateKey, String publicKey, Context applicationContext){
        API =  new MarvelApi(privateKey, publicKey, applicationContext);
    }

    public static MarvelApi getInstance(){
        return API;
    }

    private MarvelApi(String privateKey, String publicKey, Context applicationContext){

        RequestSignature.apiKey = publicKey;
        RequestSignature.privateKey = privateKey;

        OkHttpClient okHttpClient = new OkHttpClient();
        HttpResponseCache cache = null;

        try {
            cache = new HttpResponseCache(applicationContext.getCacheDir(), 1024);
        } catch (IOException e) {
            e.printStackTrace();
        }

        okHttpClient.setResponseCache(cache);

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Date.class, new DateAdapter())
                .create();

        mRestAdapter = new RestAdapter.Builder()
                .setClient(new OkClient(okHttpClient))
                .setConverter(new GsonConverter(gson))
                .setServer(API_URL)
                .build();
    }

    public RestAdapter getRestAdapter(){
        return mRestAdapter;
    }
}
