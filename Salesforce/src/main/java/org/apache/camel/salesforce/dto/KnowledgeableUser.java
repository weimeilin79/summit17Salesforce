/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject KnowledgeableUser
 */
@XStreamAlias("KnowledgeableUser")
public class KnowledgeableUser extends AbstractSObjectBase {

    // UserId
    private String UserId;

    @JsonProperty("UserId")
    public String getUserId() {
        return this.UserId;
    }

    @JsonProperty("UserId")
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    // TopicId
    private String TopicId;

    @JsonProperty("TopicId")
    public String getTopicId() {
        return this.TopicId;
    }

    @JsonProperty("TopicId")
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    // RawRank
    private Integer RawRank;

    @JsonProperty("RawRank")
    public Integer getRawRank() {
        return this.RawRank;
    }

    @JsonProperty("RawRank")
    public void setRawRank(Integer RawRank) {
        this.RawRank = RawRank;
    }

}