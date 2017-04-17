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
 * Salesforce DTO for SObject UserProvAccount
 */
@XStreamAlias("UserProvAccount")
public class UserProvAccount extends AbstractSObjectBase {

    // SalesforceUserId
    private String SalesforceUserId;

    @JsonProperty("SalesforceUserId")
    public String getSalesforceUserId() {
        return this.SalesforceUserId;
    }

    @JsonProperty("SalesforceUserId")
    public void setSalesforceUserId(String SalesforceUserId) {
        this.SalesforceUserId = SalesforceUserId;
    }

    // ConnectedAppId
    private String ConnectedAppId;

    @JsonProperty("ConnectedAppId")
    public String getConnectedAppId() {
        return this.ConnectedAppId;
    }

    @JsonProperty("ConnectedAppId")
    public void setConnectedAppId(String ConnectedAppId) {
        this.ConnectedAppId = ConnectedAppId;
    }

    // ExternalUserId
    private String ExternalUserId;

    @JsonProperty("ExternalUserId")
    public String getExternalUserId() {
        return this.ExternalUserId;
    }

    @JsonProperty("ExternalUserId")
    public void setExternalUserId(String ExternalUserId) {
        this.ExternalUserId = ExternalUserId;
    }

    // ExternalUsername
    private String ExternalUsername;

    @JsonProperty("ExternalUsername")
    public String getExternalUsername() {
        return this.ExternalUsername;
    }

    @JsonProperty("ExternalUsername")
    public void setExternalUsername(String ExternalUsername) {
        this.ExternalUsername = ExternalUsername;
    }

    // ExternalEmail
    private String ExternalEmail;

    @JsonProperty("ExternalEmail")
    public String getExternalEmail() {
        return this.ExternalEmail;
    }

    @JsonProperty("ExternalEmail")
    public void setExternalEmail(String ExternalEmail) {
        this.ExternalEmail = ExternalEmail;
    }

    // ExternalFirstName
    private String ExternalFirstName;

    @JsonProperty("ExternalFirstName")
    public String getExternalFirstName() {
        return this.ExternalFirstName;
    }

    @JsonProperty("ExternalFirstName")
    public void setExternalFirstName(String ExternalFirstName) {
        this.ExternalFirstName = ExternalFirstName;
    }

    // ExternalLastName
    private String ExternalLastName;

    @JsonProperty("ExternalLastName")
    public String getExternalLastName() {
        return this.ExternalLastName;
    }

    @JsonProperty("ExternalLastName")
    public void setExternalLastName(String ExternalLastName) {
        this.ExternalLastName = ExternalLastName;
    }

    // LinkState
    @XStreamConverter(PicklistEnumConverter.class)
    private UserProvAccount_LinkStateEnum LinkState;

    @JsonProperty("LinkState")
    public UserProvAccount_LinkStateEnum getLinkState() {
        return this.LinkState;
    }

    @JsonProperty("LinkState")
    public void setLinkState(UserProvAccount_LinkStateEnum LinkState) {
        this.LinkState = LinkState;
    }

    // Status
    @XStreamConverter(PicklistEnumConverter.class)
    private UserProvAccount_StatusEnum Status;

    @JsonProperty("Status")
    public UserProvAccount_StatusEnum getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(UserProvAccount_StatusEnum Status) {
        this.Status = Status;
    }

    // DeletedDate
    private java.time.ZonedDateTime DeletedDate;

    @JsonProperty("DeletedDate")
    public java.time.ZonedDateTime getDeletedDate() {
        return this.DeletedDate;
    }

    @JsonProperty("DeletedDate")
    public void setDeletedDate(java.time.ZonedDateTime DeletedDate) {
        this.DeletedDate = DeletedDate;
    }

}
