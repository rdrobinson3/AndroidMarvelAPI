package com.trey.marvel.model.api.manager;

import com.trey.marvel.model.api.MarvelApi;
import com.trey.marvel.model.api.request.RequestSignature;
import com.trey.marvel.model.api.request.CharacterRequest;
import com.trey.marvel.model.api.response.ListCharacterResponse;
import com.trey.marvel.model.api.service.Characters;

import retrofit.Callback;

/**
 * Created by Trey Robinson on 2/12/14.
 */
public class CharacterManager {

    private Characters characters;

    public CharacterManager() {
        characters = MarvelApi.getInstance().getRestAdapter().create(Characters.class);
    }

    public void fetchCharacters(CharacterRequest request, Callback<ListCharacterResponse> callback) {
        RequestSignature signature = RequestSignature.create();
        characters.listCharacters(request.getLimit()
                , request.getOffset()
                , String.valueOf(signature.timeStamp)
                , signature.publicKey
                , signature.hashSignature
                , request.getName()
                , request.getModifiedSince()
                , request.getComicsParameter()
                , request.getSeriesParameter()
                , request.getEventsParameter()
                , request.getOrderBy().getValue()
                , callback);
    }

    public void getCharacterWithId(int characterId, Callback<ListCharacterResponse> callback) {
        RequestSignature signature = RequestSignature.create();
        characters.getCharacterWithId(characterId
                , String.valueOf(signature.timeStamp)
                , signature.publicKey
                , signature.hashSignature
                , callback);

    }
}
