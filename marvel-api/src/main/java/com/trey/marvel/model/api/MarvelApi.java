package com.trey.marvel.model.api;

import android.content.Context;

import com.squareup.okhttp.HttpResponseCache;
import com.squareup.okhttp.OkHttpClient;
import com.trey.marvel.model.api.request.RequestSignature;

import java.io.IOException;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

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

        mRestAdapter = new RestAdapter.Builder()
                .setClient(new OkClient(okHttpClient))
                .setServer(API_URL)
                .build();
    }

    public RestAdapter getRestAdapter(){
        return mRestAdapter;
    }
}
