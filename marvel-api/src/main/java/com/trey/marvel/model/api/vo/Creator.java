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
    public String resourceURI;
    public List<Url> urls;
    public ImageInfo thumbnail;
    public SeriesList series;
    public ItemList comics;
    public ItemList events;

}
