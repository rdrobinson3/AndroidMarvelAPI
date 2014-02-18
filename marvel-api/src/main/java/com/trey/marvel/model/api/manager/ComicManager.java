package com.trey.marvel.model.api.manager;

import com.trey.marvel.model.api.MarvelApi;
import com.trey.marvel.model.api.request.CharacterRequest;
import com.trey.marvel.model.api.request.ComicRequest;
import com.trey.marvel.model.api.response.ServiceResponse;
import com.trey.marvel.model.api.service.Characters;
import com.trey.marvel.model.api.service.Comics;
import com.trey.marvel.model.api.vo.*;
import com.trey.marvel.model.api.vo.Character;

import retrofit.Callback;

/**
 * Created by Trey Robinson on 2/17/14.
 */
public class ComicManager extends  BaseManager{

    private Comics comics;

    public ComicManager() {
        comics = MarvelApi.getInstance().getRestAdapter().create(Comics.class);
    }

    public void listComics(ComicRequest request, Callback<ServiceResponse<Comic>> callback) {
        comics.listComics(request.getLimit()
                , request.getOffset()
                , String.valueOf(request.getTimestamp())
                , request.getApiKey()
                , request.getHashSignature()
                , request.getFormat().getValue()
                , request.getFormatType().getValue()
                , request.isNoVariants()
                , request.getDateDescriptor().getValue()
                , request.getDateRange()
                , request.isHasDigitalIssue()
                , request.getModifiedSince()
                , parameterizeList(request.getCreators())
                , parameterizeList(request.getSeries())
                , parameterizeList(request.getEvents())
                , parameterizeList(request.getStories())
                , parameterizeList(request.getSharedAppearances())
                , parameterizeList(request.getCollaborators())
                , request.getOrderBy().getValue(), callback);
    }

    public void getComicWithId(int comicId, ComicRequest request, Callback<ServiceResponse<Comic>> callback){
        comics.getComicWithId(comicId
                , String.valueOf(request.getTimestamp())
                , request.getApiKey()
                , request.getHashSignature()
                , callback);
    }

    public void getCharactersForComic(int comicId, CharacterRequest request, Callback<ServiceResponse<Character>> callback){
        comics.getCharactersForComic(comicId
                , request.getLimit()
                , request.getOffset()
                , String.valueOf(request.getTimestamp())
                , request.getApiKey()
                , request.getHashSignature()
                , request.getName()
                , request.getModifiedSince()
                , parameterizeList(request.getStories())
                , parameterizeList(request.getSeries())
                , parameterizeList(request.getEvents())
                , request.getOrderBy().getValue()
                , callback);
    }
}
