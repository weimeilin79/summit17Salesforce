/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject OwnedContentDocument
 */
@XStreamAlias("OwnedContentDocument")
public class OwnedContentDocument extends AbstractSObjectBase {

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

    // Title
    private String Title;

    @JsonProperty("Title")
    public String getTitle() {
        return this.Title;
    }

    @JsonProperty("Title")
    public void setTitle(String Title) {
        this.Title = Title;
    }

    // FileType
    private String FileType;

    @JsonProperty("FileType")
    public String getFileType() {
        return this.FileType;
    }

    @JsonProperty("FileType")
    public void setFileType(String FileType) {
        this.FileType = FileType;
    }

    // ContentSize
    private Integer ContentSize;

    @JsonProperty("ContentSize")
    public Integer getContentSize() {
        return this.ContentSize;
    }

    @JsonProperty("ContentSize")
    public void setContentSize(Integer ContentSize) {
        this.ContentSize = ContentSize;
    }

    // FileExtension
    private String FileExtension;

    @JsonProperty("FileExtension")
    public String getFileExtension() {
        return this.FileExtension;
    }

    @JsonProperty("FileExtension")
    public void setFileExtension(String FileExtension) {
        this.FileExtension = FileExtension;
    }

    // ContentUrl
    private String ContentUrl;

    @JsonProperty("ContentUrl")
    public String getContentUrl() {
        return this.ContentUrl;
    }

    @JsonProperty("ContentUrl")
    public void setContentUrl(String ContentUrl) {
        this.ContentUrl = ContentUrl;
    }

    // ExternalDataSourceName
    private String ExternalDataSourceName;

    @JsonProperty("ExternalDataSourceName")
    public String getExternalDataSourceName() {
        return this.ExternalDataSourceName;
    }

    @JsonProperty("ExternalDataSourceName")
    public void setExternalDataSourceName(String ExternalDataSourceName) {
        this.ExternalDataSourceName = ExternalDataSourceName;
    }

}
