package com.trey.marvel.model.api.vo;

import java.util.Date;
import java.util.List;

/**
 * Created by Trey Robinson on 2/18/14.
 */
public class Creator {

    public int id;
    public String firstName;
    public String middleName;
    public String lastName;
    public String suffix;
    public String fullName;
    public Date modified;
    public ImageInfo thumbnail;
    public String resourceURI;
    public ItemList comics;
    public ItemList series;
    public ItemList stories;
    public ItemList events;
    public List<Url> urls;


}
