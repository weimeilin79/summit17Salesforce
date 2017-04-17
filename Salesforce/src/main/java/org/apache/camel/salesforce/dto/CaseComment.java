/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject CaseComment
 */
@XStreamAlias("CaseComment")
public class CaseComment extends AbstractSObjectBase {

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

    // IsPublished
    private Boolean IsPublished;

    @JsonProperty("IsPublished")
    public Boolean getIsPublished() {
        return this.IsPublished;
    }

    @JsonProperty("IsPublished")
    public void setIsPublished(Boolean IsPublished) {
        this.IsPublished = IsPublished;
    }

    // CommentBody
    private String CommentBody;

    @JsonProperty("CommentBody")
    public String getCommentBody() {
        return this.CommentBody;
    }

    @JsonProperty("CommentBody")
    public void setCommentBody(String CommentBody) {
        this.CommentBody = CommentBody;
    }

}
