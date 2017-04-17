/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject CollaborationGroupMember
 */
@XStreamAlias("CollaborationGroupMember")
public class CollaborationGroupMember extends AbstractSObjectBase {

    // CollaborationGroupId
    private String CollaborationGroupId;

    @JsonProperty("CollaborationGroupId")
    public String getCollaborationGroupId() {
        return this.CollaborationGroupId;
    }

    @JsonProperty("CollaborationGroupId")
    public void setCollaborationGroupId(String CollaborationGroupId) {
        this.CollaborationGroupId = CollaborationGroupId;
    }

    // MemberId
    private String MemberId;

    @JsonProperty("MemberId")
    public String getMemberId() {
        return this.MemberId;
    }

    @JsonProperty("MemberId")
    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    // CollaborationRole
    @XStreamConverter(PicklistEnumConverter.class)
    private CollaborationGroupMember_CollaborationRoleEnum CollaborationRole;

    @JsonProperty("CollaborationRole")
    public CollaborationGroupMember_CollaborationRoleEnum getCollaborationRole() {
        return this.CollaborationRole;
    }

    @JsonProperty("CollaborationRole")
    public void setCollaborationRole(CollaborationGroupMember_CollaborationRoleEnum CollaborationRole) {
        this.CollaborationRole = CollaborationRole;
    }

    // NotificationFrequency
    @XStreamConverter(PicklistEnumConverter.class)
    private CollaborationGroupMember_NotificationFrequencyEnum NotificationFrequency;

    @JsonProperty("NotificationFrequency")
    public CollaborationGroupMember_NotificationFrequencyEnum getNotificationFrequency() {
        return this.NotificationFrequency;
    }

    @JsonProperty("NotificationFrequency")
    public void setNotificationFrequency(CollaborationGroupMember_NotificationFrequencyEnum NotificationFrequency) {
        this.NotificationFrequency = NotificationFrequency;
    }

    // LastFeedAccessDate
    private java.time.ZonedDateTime LastFeedAccessDate;

    @JsonProperty("LastFeedAccessDate")
    public java.time.ZonedDateTime getLastFeedAccessDate() {
        return this.LastFeedAccessDate;
    }

    @JsonProperty("LastFeedAccessDate")
    public void setLastFeedAccessDate(java.time.ZonedDateTime LastFeedAccessDate) {
        this.LastFeedAccessDate = LastFeedAccessDate;
    }

}