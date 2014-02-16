package com.trey.marvel.model.api.response;

/**
 * Created by Trey Robinson on 2/13/14.
 */
public class ServiceResponse<E>{
    public int code;
    public String status;
    public String etag;
    public DataContainer<E> data;

}
