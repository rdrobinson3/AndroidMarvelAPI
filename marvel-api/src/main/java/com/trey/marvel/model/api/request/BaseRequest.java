package com.trey.marvel.model.api.request;

/**
 * Created by Trey Robinson on 2/14/14.
 */
public class BaseRequest {

    private RequestSignature requestSignature;

    public BaseRequest(RequestSignature requestSignature){
        this.requestSignature = requestSignature;
    }

    public long getTimestamp(){
        return requestSignature.timeStamp;
    }

    public String getHashSignature(){
        return requestSignature.hashSignature;
    }

    public String getApiKey(){
        return requestSignature.apiKey;
    }

}
