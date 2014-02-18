package com.trey.marvel.model.api.vo;

import java.util.Date;

/**
 * Created by Trey Robinson on 2/17/14.
 */
public class Story {

    public int id;
    public String title;
    public String description;
    public String resourceURI;
    public String type;
    public Date modified;
    public ImageInfo thumbnail;
    public ItemList comics;
    public SeriesList series;
    public CharacterList characters;
    public CreatorList creators;
    public Item originalIssue;

}
