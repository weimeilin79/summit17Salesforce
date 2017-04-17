/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject Announcement
 */
@XStreamAlias("Announcement")
public class Announcement extends AbstractSObjectBase {

    // FeedItemId
    private String FeedItemId;

    @JsonProperty("FeedItemId")
    public String getFeedItemId() {
        return this.FeedItemId;
    }

    @JsonProperty("FeedItemId")
    public void setFeedItemId(String FeedItemId) {
        this.FeedItemId = FeedItemId;
    }

    // ExpirationDate
    private java.time.ZonedDateTime ExpirationDate;

    @JsonProperty("ExpirationDate")
    public java.time.ZonedDateTime getExpirationDate() {
        return this.ExpirationDate;
    }

    @JsonProperty("ExpirationDate")
    public void setExpirationDate(java.time.ZonedDateTime ExpirationDate) {
        this.ExpirationDate = ExpirationDate;
    }

    // ParentId
    private String ParentId;

    @JsonProperty("ParentId")
    public String getParentId() {
        return this.ParentId;
    }

    @JsonProperty("ParentId")
    public void setParentId(String ParentId) {
        this.ParentId = ParentId;
    }

}