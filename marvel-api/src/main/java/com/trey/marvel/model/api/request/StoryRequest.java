package com.trey.marvel.model.api.request;

import java.util.Date;
import java.util.List;

/**
 * Created by Trey Robinson on 2/17/14.
 */
public class StoryRequest extends BaseRequest{

    private Date modifiedSince;
    private List<Integer> comics;
    private List<Integer> series;
    private List<Integer> events;
    private List<Integer> creators;
    private List<Integer> characters;
    private OrderBy orderBy;

    public StoryRequest(RequestSignature requestSignature){
        super(requestSignature);
        orderBy = OrderBy.Default;
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

    public List<Integer> getSeries() {
        return series;
    }

    public void setSeries(List<Integer> series) {
        this.series = series;
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

    public OrderBy getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy;
    }

    public enum OrderBy {
        Default(null)
        ,Id("id")
        ,IdDescending("-id")
        ,ModifiedDate("modified")
        ,ModifiedDateDescending("-modified");

        private String value;

        OrderBy(String value){
            this.value = value;
        }

        public String getValue(){
            return this.value;
        }
    }

}
