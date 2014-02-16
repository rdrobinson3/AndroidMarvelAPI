package com.trey.marvel.model.api.manager;

import com.trey.marvel.model.api.MarvelApi;
import com.trey.marvel.model.api.request.ComicRequest;
import com.trey.marvel.model.api.request.RequestSignature;
import com.trey.marvel.model.api.request.CharacterRequest;
import com.trey.marvel.model.api.response.ListComicsResponse;
import com.trey.marvel.model.api.response.ServiceResponse;
import com.trey.marvel.model.api.service.Characters;
import com.trey.marvel.model.api.vo.Character;
import com.trey.marvel.model.api.vo.Comic;

import org.apache.commons.lang3.StringUtils;

import retrofit.Callback;

/**
 * Created by Trey Robinson on 2/12/14.
 */
public class CharacterManager {

    private Characters characters;

    public CharacterManager() {
        characters = MarvelApi.getInstance().getRestAdapter().create(Characters.class);
    }

    public void fetchCharacters(CharacterRequest request, Callback<ServiceResponse<Character>> callback) {
        characters.listCharacters(request.getLimit()
                , request.getOffset()
                , String.valueOf(request.getTimestamp())
                , request.getApiKey()
                , request.getHashSignature()
                , request.getName()
                , request.getModifiedSince()
                , StringUtils.join(request.getStories(), ",")
                , StringUtils.join(request.getSeries(), ",")
                , StringUtils.join(request.getEvents(), ",")
                , request.getOrderBy().getValue()
                , callback);
    }

    //this request takes no additional arguments so the request signature is generate automatically here rather than
    //being included in an empty request. This may change in the future to include a base request for consistency.
    public void getCharacterWithId(int characterId, Callback<ServiceResponse<Character>> callback) {
        RequestSignature request = RequestSignature.create();
        characters.getCharacterWithId(characterId
                , String.valueOf(request.timeStamp)
                , request.publicKey
                , request.hashSignature
                , callback);

    }

    public void getComicsForCharacterId(int characterId, ComicRequest request, Callback<ServiceResponse<Comic>> callback){
        characters.getComicsForCharacterId(characterId
                ,request.getLimit()
                ,request.getOffset()
                ,String.valueOf(request.getTimestamp())
                ,request.getApiKey()
                ,request.getHashSignature()
                ,request.getFormat().getValue()
                ,request.getFormatType().getValue()
                ,request.isNoVariants()
                ,request.getDateDescriptor().getValue()
                ,request.getDateRange()
                ,request.isHasDigitalIssue()
                ,request.getModifiedSince()
                ,StringUtils.join(request.getCreators(), ",")
                ,StringUtils.join(request.getSeries(), ",")
                ,StringUtils.join(request.getEvents(), ",")
                ,StringUtils.join(request.getStories(), ",")
                ,StringUtils.join(request.getSharedAppearances(), ",")
                ,StringUtils.join(request.getCollaborators(), ",")
                ,request.getOrderBy().getValue(), callback);
    }
}
