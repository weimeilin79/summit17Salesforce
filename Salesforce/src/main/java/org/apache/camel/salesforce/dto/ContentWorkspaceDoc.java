/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject ContentWorkspaceDoc
 */
@XStreamAlias("ContentWorkspaceDoc")
public class ContentWorkspaceDoc extends AbstractSObjectBase {

    // ContentWorkspaceId
    private String ContentWorkspaceId;

    @JsonProperty("ContentWorkspaceId")
    public String getContentWorkspaceId() {
        return this.ContentWorkspaceId;
    }

    @JsonProperty("ContentWorkspaceId")
    public void setContentWorkspaceId(String ContentWorkspaceId) {
        this.ContentWorkspaceId = ContentWorkspaceId;
    }

    // ContentDocumentId
    private String ContentDocumentId;

    @JsonProperty("ContentDocumentId")
    public String getContentDocumentId() {
        return this.ContentDocumentId;
    }

    @JsonProperty("ContentDocumentId")
    public void setContentDocumentId(String ContentDocumentId) {
        this.ContentDocumentId = ContentDocumentId;
    }

    // IsOwner
    private Boolean IsOwner;

    @JsonProperty("IsOwner")
    public Boolean getIsOwner() {
        return this.IsOwner;
    }

    @JsonProperty("IsOwner")
    public void setIsOwner(Boolean IsOwner) {
        this.IsOwner = IsOwner;
    }

}
