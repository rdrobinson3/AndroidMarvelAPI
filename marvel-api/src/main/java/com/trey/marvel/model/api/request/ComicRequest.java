package com.trey.marvel.model.api.request;

import java.util.Date;
import java.util.List;

/**
 * Created by Trey Robinson on 2/15/14.
 */
public class ComicRequest extends BaseRequest {


    private Format format;
    private FormatType formatType;
    private boolean noVariants;
    private DateDescriptor dateDescriptor;
    private String dateRange;
    private boolean hasDigitalIssue;
    private Date modifiedSince;
    private List<Integer> creators;
    private List<Integer> characters;
    private List<Integer> series;
    private List<Integer> events;
    private List<Integer> stories;
    private List<Integer> sharedAppearances;
    private List<Integer> collaborators;
    private OrderBy orderBy;
    private int limit;
    private int offset;

    public ComicRequest(RequestSignature requestSignature) {
        super(requestSignature);
        format = Format.Default;
        formatType = FormatType.Default;
        dateDescriptor = DateDescriptor.Default;
        orderBy = OrderBy.Default;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public FormatType getFormatType() {
        return formatType;
    }

    public void setFormatType(FormatType formatType) {
        this.formatType = formatType;
    }

    public boolean isNoVariants() {
        return noVariants;
    }

    public void setNoVariants(boolean noVariants) {
        this.noVariants = noVariants;
    }

    public DateDescriptor getDateDescriptor() {
        return dateDescriptor;
    }

    public void setDateDescriptor(DateDescriptor dateDescriptor) {
        this.dateDescriptor = dateDescriptor;
    }

    public String getDateRange() {
        return dateRange;
    }

    public void setDateRange(String dateRange) {
        this.dateRange = dateRange;
    }

    public boolean isHasDigitalIssue() {
        return hasDigitalIssue;
    }

    public void setHasDigitalIssue(boolean hasDigitalIssue) {
        this.hasDigitalIssue = hasDigitalIssue;
    }

    public Date getModifiedSince() {
        return modifiedSince;
    }

    public void setModifiedSince(Date modifiedSince) {
        this.modifiedSince = modifiedSince;
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

    public List<Integer> getStories() {
        return stories;
    }

    public void setStories(List<Integer> stories) {
        this.stories = stories;
    }

    public List<Integer> getSharedAppearances() {
        return sharedAppearances;
    }

    public void setSharedAppearances(List<Integer> sharedAppearances) {
        this.sharedAppearances = sharedAppearances;
    }

    public List<Integer> getCollaborators() {
        return collaborators;
    }

    public void setCollaborators(List<Integer> collaborators) {
        this.collaborators = collaborators;
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

    public enum Format {
        Default(null)
        ,Comic ("comic")
        ,Magazine ("magazine")
        ,TradePaperback("trade paperback")
        ,Hardcover ("hardcover")
        ,Digest ("digest")
        ,GraphicNovel ("graphic novel")
        ,DigitalComic ("digital comic")
        ,InfiniteComic ("infinite comic");

        private String value;

        Format(String value){
            this.value = value;
        }

        public String getValue(){
            return  this.value;
        }
    }

    public enum FormatType {
        Default(null)
        ,Comic("comic")
        ,Collection("collection");

        private String value;

        FormatType(String value){
            this.value = value;
        }

        public String getValue(){
            return this.value;
        }


    }

    public enum DateDescriptor{
        Default(null)
        ,LastWeek("lastWeek")
        ,ThisWeek("thisWeek")
        ,NextMonth("nextMonth")
        ,ThisMonth("thisMonth");

        private String value;

        DateDescriptor(String value){
            this.value = value;
        }

        public String getValue(){
            return this.value;
        }
    }
    public enum OrderBy {
        Default(null)
        ,FOCDate("focDate")
        ,FOCDateDescending("-focDate")
        ,OnSaleDate("onsaleDate")
        ,OnSaleDateDescending("-onsaleDate")
        ,Title("title")
        ,TitleDescending("-title")
        ,IssueNumber("issueNumber")
        ,IssueNumberDescending("-issueNumber")
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
