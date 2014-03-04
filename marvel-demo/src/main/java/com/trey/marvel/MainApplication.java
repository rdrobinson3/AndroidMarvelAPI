package com.trey.marvel;

import android.app.Application;

import com.trey.marvel.model.api.MarvelApi;
import com.trey.marvel.model.api.manager.ComicManager;
import com.trey.marvel.model.api.request.ComicRequest;
import com.trey.marvel.model.api.request.CreatorRequest;
import com.trey.marvel.model.api.request.EventRequest;
import com.trey.marvel.model.api.request.RequestSignature;
import com.trey.marvel.model.api.manager.CharacterManager;
import com.trey.marvel.model.api.request.CharacterRequest;
import com.trey.marvel.model.api.request.SeriesRequest;
import com.trey.marvel.model.api.request.StoryRequest;
import com.trey.marvel.model.api.response.ServiceResponse;
import com.trey.marvel.model.api.vo.Character;
import com.trey.marvel.model.api.vo.Comic;
import com.trey.marvel.model.api.vo.Creator;
import com.trey.marvel.model.api.vo.Event;
import com.trey.marvel.model.api.vo.Series;
import com.trey.marvel.model.api.vo.Story;

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



        MarvelApi.create("YOUR PRIVATE KEY", "YOUR PUBLIC KEY", getApplicationContext(), 5*1024*1024);

        StoryRequest request = new StoryRequest(RequestSignature.create());
        request.setLimit(20);
        request.setOffset(0);

        ComicManager client = new ComicManager();
        client.getStoriesForComicId(41530, request, new Callback<ServiceResponse<Story>>() {
            @Override
            public void success(ServiceResponse<Story> characterServiceResponse, Response response) {

            }

            @Override
            public void failure(RetrofitError retrofitError) {

            }
        });
//        EventRequest request = new EventRequest(RequestSignature.create());
//        request.setLimit(20);
//        request.setOffset(0);

//        CharacterManager client = new CharacterManager();
//        client.getEventsForCharacterId(1009521, request, new Callback<ServiceResponse<Event>>() {
//            @Override
//            public void success(ServiceResponse<Event> characterServiceResponse, Response response) {
//
//            }
//
//            @Override
//            public void failure(RetrofitError retrofitError) {
//
//            }
//        });
/**
        CharacterRequest request = new CharacterRequest(RequestSignature.create());
        request.setLimit(20);
        request.setOffset(0);

        CharacterManager client = new CharacterManager();
        client.fetchCharacters(request, new Callback<ServiceResponse<Character>>() {
            @Override
            public void success(ServiceResponse<Character> characterServiceResponse, Response response) {

            }

            @Override
            public void failure(RetrofitError retrofitError) {

            }
        });
 **/
/**
        CharacterRequest request = new CharacterRequest(RequestSignature.create());
        request.setLimit(20);
        request.setOffset(0);

        CharacterManager client = new CharacterManager();
        client.fetchCharacters(request, new Callback<ServiceResponse<Character>>() {
            @Override
            public void success(ServiceResponse<Character> characterServiceResponse, Response response) {

            }

            @Override
            public void failure(RetrofitError retrofitError) {

            }
        });

 **/
//
//        EventRequest request = new CharacterRequest(RequestSignature.create());
//        request.setLimit(20);
//        request.setOffset(0);
//
//        CharacterManager client = new CharacterManager();
//        client.get(1009521, new Callback<ServiceResponse<Character>>() {
//            @Override
//            public void success(ServiceResponse<Character> listCharacterResponse, Response response) {
//                ServiceResponse<Character> resp = listCharacterResponse;
//
//            }
//
//            @Override
//            public void failure(RetrofitError retrofitError) {
//
//            }
//        });


/**
        ComicRequest request = new ComicRequest(RequestSignature.create());
        request.setLimit(20);
        request.setOffset(0);

        CharacterManager client = new CharacterManager();
        client.getComicsForCharacterId(1009521, request, new Callback<ListComicsResponse>() {
            @Override
            public void success(ListComicsResponse listComicsResponse, Response response) {


            }

            @Override
            public void failure(RetrofitError retrofitError) {

            }
        });

 **/
    }

}
