package com.trey.marvel;

import android.app.Application;

import com.trey.marvel.model.api.MarvelApi;
import com.trey.marvel.model.api.request.RequestSignature;
import com.trey.marvel.model.api.manager.CharacterManager;
import com.trey.marvel.model.api.request.CharacterRequest;
import com.trey.marvel.model.api.response.ListCharacterResponse;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Trey Robinson on 2/12/14.
 */
public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();



        MarvelApi.create("YOUR PRIVATE KEY HERE", "YOUR PUBLIC KEY HERE", getApplicationContext());

        RequestSignature signature = MarvelApi.getInstance().generateRequestSignature();

        CharacterRequest request = new CharacterRequest(signature);
        request.setLimit(20);
        request.setOffset(0);

        CharacterManager client = new CharacterManager();
        client.getCharacterWithId(1009521, new Callback<ListCharacterResponse>() {
            @Override
            public void success(ListCharacterResponse listCharacterResponse, Response response) {
                     ListCharacterResponse resp = listCharacterResponse;

            }

            @Override
            public void failure(RetrofitError retrofitError) {

            }
        });
    }
}
