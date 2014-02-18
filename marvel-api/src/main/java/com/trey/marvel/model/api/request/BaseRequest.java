package com.trey.marvel.model.api.request;

/**
 * Created by Trey Robinson on 2/14/14.
 */
public class BaseRequest {

    private RequestSignature requestSignature;
    private int limit;
    private int offset;

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

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

}
