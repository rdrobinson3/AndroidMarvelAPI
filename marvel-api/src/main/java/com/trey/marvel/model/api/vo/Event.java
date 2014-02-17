package com.trey.marvel.model.api.vo;

import java.util.Date;
import java.util.List;

/**
 * Created by Trey Robinson on 2/16/14.
 */
public class Event {
    public int id;
    public String title;
    public String description;
    public String resourceURL;
    public List<Url> urls;
    public Date modified;
    public Date start;
    public Date end;
    public ImageInfo thumbnail;
    public ItemList comics;
    public ItemList stories;
    public ItemList series;
    public CharacterList characters;
    public CreatorList creators;
    public Item next;
    public Item previous;

}
