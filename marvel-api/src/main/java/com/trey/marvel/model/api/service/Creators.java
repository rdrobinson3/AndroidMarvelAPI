package com.trey.marvel.model.api.service;

import com.trey.marvel.model.api.response.ServiceResponse;
import com.trey.marvel.model.api.vo.Comic;
import com.trey.marvel.model.api.vo.Creator;
import com.trey.marvel.model.api.vo.Event;
import com.trey.marvel.model.api.vo.Series;
import com.trey.marvel.model.api.vo.Story;

import java.util.Date;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by Trey Robinson on 2/21/14.
 */
public interface Creators {

    @GET("/v1/public/creators")
    public void listCreators(@Query("limit") int limit
            , @Query("offset") int offset
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , @Query("firstName") String firstName
            , @Query("middleName") String middleName
            , @Query("lastName") String lastName
            , @Query("suffix") String suffix
            , @Query("modifiedSince") Date modifiedSince
            , @Query("comics") String comics
            , @Query("series") String series
            , @Query("stories") String stories
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Creator>> callback);

    @GET("/v1/public/creators{creatorId}")
    public void getCreatorWithId(@Path("creatorId") int creatorId
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , Callback<ServiceResponse<Creator>> callback);


    @GET("/v1/public/creators{creatorId}/comics")
    public void getComicsForCreatorId(@Path("creatorId") int creatorId
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

    @GET("/v1/public/creators{creatorId}/events")
    public void getEventsForCreatorId(@Path("creatorId") int creatorId
            , @Query("limit") int limit
            , @Query("offset") int offset
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , @Query("name") String name
            , @Query("modifiedSince") Date modifiedSince
            , @Query("creator") String creators
            , @Query("characters") String characters
            , @Query("series") String series
            , @Query("stories") String stories
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Event>> callback);

    @GET("/v1/public/creators{creatorId}/series")
    public void getSeriesForCreatorId(@Path("creatorId") int creatorId
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

    @GET("/v1/public/creators{creatorId}/stories")
    public void getStoriesForCreatorId(@Path("creatorId") int creatorId
            , @Query("limit") int limit
            , @Query("offset") int offset
            , @Query("ts") String timestamp
            , @Query("apikey") String apikey
            , @Query("hash") String hashSignature
            , @Query("modifiedSince") Date modifiedSince
            , @Query("series") String series
            , @Query("events") String events
            , @Query("creator") String creators
            , @Query("characters") String characters
            , @Query("orderBy") String orderBy
            , Callback<ServiceResponse<Story>> callback);

}
