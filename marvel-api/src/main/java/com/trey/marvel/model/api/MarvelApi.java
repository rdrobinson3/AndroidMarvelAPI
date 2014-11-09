package com.trey.marvel.model.api;

import android.content.Context;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.OkHttpClient;
import com.trey.marvel.model.api.request.RequestSignature;
import com.trey.marvel.model.api.response.DateAdapter;

import java.io.IOException;
import java.util.Date;

import retrofit.RestAdapter;
import retrofit.client.OkClient;
import retrofit.converter.GsonConverter;

/**
 * Main API class. Initialize by calling create. Afterwards the API can be retrieved by calling getInstance().
 * The application context is used to create a response cache. Cache size is configurable.
 *
 * Created by Trey Robinson on 2/12/14.
 */
public class MarvelApi {

    public static final String PORT = "80";
    public static final String API_URL = "http://gateway.marvel.com" + ":" + PORT;

    private static MarvelApi API;

    private RestAdapter mRestAdapter;

    /**
     * Returns an instance of the MarvelApi. Must initialize static instance with
     * a call to {@link #create(String, String, android.content.Context, long)}
     * @return
     */
    public static MarvelApi getInstance(){
        return API;
    }

    /**
     * Retrieve all characters matching the provided request parameters.
     * @param privateKey The private key provided by Marvel
     * @param publicKey THe public key provided by Marvel
     * @param applicationContext Application Context for creating cache location
     * @param cacheSize Size of the Cache
     */
    public static void create(String privateKey, String publicKey, Context applicationContext, long cacheSize){
        API =  new MarvelApi(privateKey, publicKey, applicationContext, cacheSize);
    }

    /**
     * Retrieve all characters matching the provided request parameters.
     * @param privateKey The private key provided by Marvel
     * @param publicKey THe public key provided by Marvel
     * @param applicationContext Application Context for creating cache location
     * @param cacheSize Size of the Cache
     */
    private MarvelApi(String privateKey, String publicKey, Context applicationContext, long cacheSize){

        //Set the static keys so they can be used to generate the request signatures.
        RequestSignature.apiKey = publicKey;
        RequestSignature.privateKey = privateKey;

        OkHttpClient okHttpClient = new OkHttpClient();
        Cache cache = null;

        try {
            cache = new Cache(applicationContext.getCacheDir(), cacheSize);
        } catch (IOException e) {
            e.printStackTrace();
        }

        okHttpClient.setCache(cache);

        Gson gson = new GsonBuilder()
                .registerTypeAdapter(Date.class, new DateAdapter())
                .create();

        mRestAdapter = new RestAdapter.Builder()
                .setClient(new OkClient(okHttpClient))
                .setConverter(new GsonConverter(gson))
                .setEndpoint(API_URL)
                .build();
    }

    public RestAdapter getRestAdapter(){
        return mRestAdapter;
    }
}
