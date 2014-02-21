package com.trey.marvel.model.api.request;

import java.util.Date;
import java.util.List;

/**
 * Created by Trey Robinson on 2/16/14.
 */
public class SeriesRequest extends BaseRequest{

    private String title;
    private Date modifiedSince;
    private List<Integer> comics;
    private List<Integer> stories;
    private List<Integer> events;
    private List<Integer> creators;
    private List<Integer> characters;
    private SeriesType seriesType;
    private Contains contains;
    private OrderBy orderBy;
    private int limit;
    private int offset;

    public SeriesRequest(RequestSignature requestSignature){
        super(requestSignature);
        orderBy = OrderBy.Default;
        contains = Contains.Default;
        seriesType = SeriesType.Default;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getModifiedSince() {
        return modifiedSince;
    }

    public void setModifiedSince(Date modifiedSince) {
        this.modifiedSince = modifiedSince;
    }

    public List<Integer> getComics() {
        return comics;
    }

    public void setComics(List<Integer> comics) {
        this.comics = comics;
    }

    public List<Integer> getStories() {
        return stories;
    }

    public void setStories(List<Integer> stories) {
        this.stories = stories;
    }

    public List<Integer> getEvents() {
        return events;
    }

    public void setEvents(List<Integer> events) {
        this.events = events;
    }

    public List<Integer> getCreators() {
        return creators;
    }

    public void setCreators(List<Integer> creators) {
        this.creators = creators;
    }

    public List<Integer> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Integer> characters) {
        this.characters = characters;
    }

    public SeriesType getSeriesType() {
        return seriesType;
    }

    public void setSeriesType(SeriesType seriesType) {
        this.seriesType = seriesType;
    }

    public Contains getContains() {
        return contains;
    }

    public void setContains(Contains contains) {
        this.contains = contains;
    }

    public OrderBy getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy;
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

    public enum OrderBy {
        Default(null)
        ,Title("title")
        ,TitleDescending("-title")
        ,ModifiedDate("modified")
        ,ModifiedDateDescending("-modified")
        ,StartYear("startYear")
        ,StartYearDescending("-startYear");

        private String value;

        OrderBy(String value){
            this.value = value;
        }

        public String getValue(){
            return this.value;
        }
    }

    public enum SeriesType {
        Default(null)
        ,Collection("collection")
        ,Oneshot("oneshot")
        ,Limited("limited")
        ,Ongoing("ongoing");

        private String value;

        SeriesType(String value){
            this.value = value;
        }

        public String getValue(){
            return this.value;
        }
    }

    public enum Contains {
        Default(null)
        ,Comic("comic")
        ,Magazine("magazine")
        ,TradePaperback("trade paperback")
        ,Hardcover("hardcover")
        ,Digest("digest")
        ,GraphicNovel("graphic novel")
        ,DigitalComic("digital comic");

        private String value;

        Contains(String value){
            this.value = value;
        }

        public String getValue(){
            return this.value;
        }
    }
}
