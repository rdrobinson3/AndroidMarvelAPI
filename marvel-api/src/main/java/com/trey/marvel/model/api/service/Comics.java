package com.trey.marvel.model.api.service;

import com.trey.marvel.model.api.response.ServiceResponse;
import com.trey.marvel.model.api.vo.*;
import com.trey.marvel.model.api.vo.Character;

import java.util.Date;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by Trey Robinson on 2/17/14.
 */
public interface Comics {

    @GET("/v1/public/comics")
    public void listComics(@Query("limit") int limit
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

    @GET("/v1/public/comics/{comicId}")
    public void getComicWithId(@Path("comicId") int comicId
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , Callback<ServiceResponse<Comic>> callback);

    @GET("/v1/public/comics/{comicId}/characters")
    public void getCharactersForComic(@Path("comicId") int comicId
            , @Query("limit") int limit
            , @Query("offset") int offset
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , @Query("name") String name
            , @Query("modifiedSince") Date modifiedSince
            , @Query("series") String series
            , @Query("events") String events
            , @Query("stories") String comics
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Character>> callback);

}
