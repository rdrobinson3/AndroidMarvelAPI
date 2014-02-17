package com.trey.marvel.model.api.vo;

import java.util.Date;
import java.util.List;

/**
 * Created by Trey Robinson on 2/14/14.
 */
public class Comic {

    public int id;
    public int digitalId;
    public String title;
    public double issueNumber;
    public String variantDescription;
    public String description;
    public Date modified;
    public String isbn;
    public String upc;
    public String diamondCode;
    public String ean;
    public String issn;
    public String format;
    public int pageCount;
    public List<TextObject> textObjects;
    public String resourceURI;
    public List<Url> urls;
    public Item series;
    public List<Item> variants;
    public List<Item> collection;
    public List<Item> collectedIssues;
    public List<IndustryDate> dates;
    public List<Price> prices;
    public ImageInfo thumbnail;
    public List<ImageInfo> images;
    public CreatorList creators;
    public CharacterList characters;
    public ItemList stories;
    public ItemList events;


}
