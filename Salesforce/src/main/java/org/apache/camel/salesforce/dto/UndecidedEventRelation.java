/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject UndecidedEventRelation
 */
@XStreamAlias("UndecidedEventRelation")
public class UndecidedEventRelation extends AbstractSObjectBase {

    // RelationId
    private String RelationId;

    @JsonProperty("RelationId")
    public String getRelationId() {
        return this.RelationId;
    }

    @JsonProperty("RelationId")
    public void setRelationId(String RelationId) {
        this.RelationId = RelationId;
    }

    // EventId
    private String EventId;

    @JsonProperty("EventId")
    public String getEventId() {
        return this.EventId;
    }

    @JsonProperty("EventId")
    public void setEventId(String EventId) {
        this.EventId = EventId;
    }

    // RespondedDate
    private java.time.ZonedDateTime RespondedDate;

    @JsonProperty("RespondedDate")
    public java.time.ZonedDateTime getRespondedDate() {
        return this.RespondedDate;
    }

    @JsonProperty("RespondedDate")
    public void setRespondedDate(java.time.ZonedDateTime RespondedDate) {
        this.RespondedDate = RespondedDate;
    }

    // Response
    private String Response;

    @JsonProperty("Response")
    public String getResponse() {
        return this.Response;
    }

    @JsonProperty("Response")
    public void setResponse(String Response) {
        this.Response = Response;
    }

    // Type
    private String Type;

    @JsonProperty("Type")
    public String getType() {
        return this.Type;
    }

    @JsonProperty("Type")
    public void setType(String Type) {
        this.Type = Type;
    }

}
