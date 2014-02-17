package com.trey.marvel.model.api.vo;

import java.util.Date;
import java.util.List;

/**
 * Created by Trey Robinson on 2/12/14.
 */
public class Character {

    public int id;
    public String name;
    public String description;
    public Date modified;
    public String resourceURI;
    public List<Url> urls;
    public ImageInfo thumbnail;
    public ItemList comics;
    public ItemList stories;
    public ItemList events;
    public ItemList series;

}
