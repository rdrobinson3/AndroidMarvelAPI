package com.trey.marvel.model.api.service;

import com.trey.marvel.model.api.response.ServiceResponse;
import com.trey.marvel.model.api.vo.Character;
import com.trey.marvel.model.api.vo.Comic;
import com.trey.marvel.model.api.vo.Event;
import com.trey.marvel.model.api.vo.Series;
import com.trey.marvel.model.api.vo.Story;

import java.util.Date;

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
            , Callback<ServiceResponse<Character>> callback);

    @GET("/v1/public/characters/{characterid}")
    public void getCharacterWithId(@Path("characterid") int characterId
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , Callback<ServiceResponse<Character>> callback);

    @GET("/v1/public/characters/{characterid}/comics")
    public void getComicsForCharacterId(@Path("characterid") int characterId
            , @Query("limit") int limit
            , @Query("offset") int offset
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , @Query("format") String format
            , @Query("formatType") String formatType
            , @Query("noVariants") boolean noVariants
            , @Query("dateDescriptor") String dateDescriptor
            , @Query("dateRange") String dateRange
            , @Query("hasDigitalIssue") Boolean hasDigitalIssue
            , @Query("modifiedSince") Date modifiedSince
            , @Query("creators") String creators
            , @Query("series") String series
            , @Query("events") String events
            , @Query("stories") String stories
            , @Query("sharedAppearances") String sharedAppearances
            , @Query("collaborators") String collaborators
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Comic>> callback);


    @GET("/v1/public/characters/{characterid}/events")
    public void getEventsForCharacterId(@Path("characterid") int characterId
            , @Query("limit") int limit
            , @Query("offset") int offset
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , @Query("name") String name
            , @Query("modifiedSince") Date modifiedSince
            , @Query("creators") String creators
            , @Query("series") String series
            , @Query("comics") String comics
            , @Query("stories") String stories
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Event>> callback);

    @GET("/v1/public/characters/{characterid}/series")
    public void getSeriesForCharacterId(@Path("characterid") int characterId
            , @Query("limit") int limit
            , @Query("offset") int offset
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , @Query("title") String title
            , @Query("modifiedSince") Date modified
            , @Query("comics") String comics
            , @Query("stories") String stories
            , @Query("events") String events
            , @Query("creators") String creators
            , @Query("seriesType") String seriesType
            , @Query("contains") String contains
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Series>> callback);


    @GET("/v1/public/characters/{characterid}/stories")
    public void getStoriesForCharacterId(@Path("characterid") int characterId
            , @Query("limit") int limit
            , @Query("offset") int offset
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , @Query("modifiedSince") Date modified
            , @Query("comics") String comics
            , @Query("series") String series
            , @Query("events") String events
            , @Query("creators") String creators
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Story>> callback);


}
