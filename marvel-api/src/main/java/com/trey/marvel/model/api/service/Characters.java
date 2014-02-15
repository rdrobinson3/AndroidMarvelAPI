package com.trey.marvel.model.api.service;

import com.trey.marvel.model.api.response.ListCharacterResponse;

import java.util.Date;
import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by Trey Robinson on 2/12/14.
 */
public interface Characters {

    @GET("/v1/public/characters")
    public void listCharacters(@Query("limit") int limit
            , @Query("offset") int offset
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , @Query("name") String name
            , @Query("modifiedSince") Date modifiedSince
            , @Query("comics") String comics
            , @Query("series") String series
            , @Query("events") String events
            , @Query("orderBy") String orderBy
            , Callback<ListCharacterResponse> callback);

    @GET("/v1/public/characters/{characterid}")
    public void getCharacterWithId(@Path("characterid") int characterId
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , Callback<ListCharacterResponse> callback);

    @GET("/v1/public/characters/{characterid}/comics")
    public void getComicsForCharacterId(@Path("characterid") int characterId
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , Callback<ListCharacterResponse> callback);

    @GET("/v1/public/characters/{characterid}/events")
    public void getEventsForCharacterId(@Path("characterid") int characterId
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , Callback<ListCharacterResponse> callback);

    @GET("/v1/public/characters/{characterid}/series")
    public void getSeriesForCharacterId(@Path("characterid") int characterId
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , Callback<ListCharacterResponse> callback);

    @GET("/v1/public/characters/{characterid}/stories")
    public void getStoriesForCharacterId(@Path("characterid") int characterId
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , Callback<ListCharacterResponse> callback);

}
