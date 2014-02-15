package com.trey.marvel.model.api.request;

/**
 * Created by Trey Robinson on 2/14/14.
 */
public class BaseRequest {

    private RequestSignature requestSignature;

    public BaseRequest(RequestSignature requestSignature){
        this.requestSignature = requestSignature;
    }

    private long getTimestamp(){
        return requestSignature.timeStamp;
    }

    private String getHashSignature(){
        return requestSignature.hashSignature;
    }

    private String getApiKey(){
        return requestSignature.apiKey;
    }


}
