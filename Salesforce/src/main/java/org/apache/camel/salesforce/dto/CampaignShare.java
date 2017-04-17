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
 * Salesforce DTO for SObject CampaignShare
 */
@XStreamAlias("CampaignShare")
public class CampaignShare extends AbstractSObjectBase {

    // CampaignId
    private String CampaignId;

    @JsonProperty("CampaignId")
    public String getCampaignId() {
        return this.CampaignId;
    }

    @JsonProperty("CampaignId")
    public void setCampaignId(String CampaignId) {
        this.CampaignId = CampaignId;
    }

    // UserOrGroupId
    private String UserOrGroupId;

    @JsonProperty("UserOrGroupId")
    public String getUserOrGroupId() {
        return this.UserOrGroupId;
    }

    @JsonProperty("UserOrGroupId")
    public void setUserOrGroupId(String UserOrGroupId) {
        this.UserOrGroupId = UserOrGroupId;
    }

    // CampaignAccessLevel
    @XStreamConverter(PicklistEnumConverter.class)
    private CampaignShare_CampaignAccessLevelEnum CampaignAccessLevel;

    @JsonProperty("CampaignAccessLevel")
    public CampaignShare_CampaignAccessLevelEnum getCampaignAccessLevel() {
        return this.CampaignAccessLevel;
    }

    @JsonProperty("CampaignAccessLevel")
    public void setCampaignAccessLevel(CampaignShare_CampaignAccessLevelEnum CampaignAccessLevel) {
        this.CampaignAccessLevel = CampaignAccessLevel;
    }

    // RowCause
    @XStreamConverter(PicklistEnumConverter.class)
    private CampaignShare_RowCauseEnum RowCause;

    @JsonProperty("RowCause")
    public CampaignShare_RowCauseEnum getRowCause() {
        return this.RowCause;
    }

    @JsonProperty("RowCause")
    public void setRowCause(CampaignShare_RowCauseEnum RowCause) {
        this.RowCause = RowCause;
    }

}
