package com.trey.marvel.model.api.vo;

import java.net.URL;
import java.util.Date;
import java.util.List;

/**
 * Created by Trey Robinson on 2/16/14.
 */
public class Series {

    public int id;
    public String title;
    public String description;
    public String resourceURI;
    public List<Url> urls;
    public int startYear;
    public int endYear;
    public String rating;
    public Date modified;
    public ImageInfo thumbnail;
    public ItemList comics;
    public ItemList stories;
    public ItemList events;
    public CharacterList characters;
    public CreatorList creators;
    public Item next;
    public Item previous;
}
