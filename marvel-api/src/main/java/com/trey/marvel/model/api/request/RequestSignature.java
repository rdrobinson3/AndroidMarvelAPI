package com.trey.marvel.model.api.request;

import com.trey.marvel.model.api.utils.HashUtil;

import java.util.Calendar;
import java.util.TimeZone;

/**
 * Created by Trey Robinson on 2/12/14.
 */
public class RequestSignature {

    public static String apiKey;
    public static String privateKey;

    public long timeStamp;
    public String publicKey = apiKey;
    public String hashSignature;
    private static Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));


    private RequestSignature(){
        this.timeStamp = calendar.getTimeInMillis() / 1000L;
        this.hashSignature = HashUtil.md5(String.valueOf(this.timeStamp) + privateKey + publicKey);
    }

    public static RequestSignature create(){
        return  new RequestSignature();
    }

}
