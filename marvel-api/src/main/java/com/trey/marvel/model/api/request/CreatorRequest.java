package com.trey.marvel.model.api.request;

import java.util.Date;
import java.util.List;

/**
 * Created by Trey Robinson on 2/18/14.
 */
public class CreatorRequest extends BaseRequest {

    private String firstName;
    private String middleName;
    private String lastName;
    private String suffix;
    private Date modifiedSince;
    private List<Integer> comics;
    private List<Integer> events;
    private List<Integer> series;
    private List<Integer> stories;
    private OrderBy orderBy;

    public CreatorRequest(RequestSignature requestSignature) {
        super(requestSignature);
        orderBy = OrderBy.Default;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
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

    public List<Integer> getEvents() {
        return events;
    }

    public void setEvents(List<Integer> events) {
        this.events = events;
    }

    public List<Integer> getSeries() {
        return series;
    }

    public void setSeries(List<Integer> series) {
        this.series = series;
    }

    public List<Integer> getStories() {
        return stories;
    }

    public void setStories(List<Integer> stories) {
        this.stories = stories;
    }

    public OrderBy getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy;
    }

    public enum OrderBy {
        Default(null)
        ,FistName("firstName")
        ,FirstNameDescending("-firstName")
        ,LastName("lastName")
        ,LastNameDescending("-lastName")
        ,MiddleName("middletName")
        ,MiddleNameDescending("-middleName")
        ,Suffix("suffix")
        ,SuffixDescending("-suffix")
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
