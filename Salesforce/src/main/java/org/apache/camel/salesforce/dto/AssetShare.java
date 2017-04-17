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
 * Salesforce DTO for SObject AssetShare
 */
@XStreamAlias("AssetShare")
public class AssetShare extends AbstractSObjectBase {

    // AssetId
    private String AssetId;

    @JsonProperty("AssetId")
    public String getAssetId() {
        return this.AssetId;
    }

    @JsonProperty("AssetId")
    public void setAssetId(String AssetId) {
        this.AssetId = AssetId;
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

    // AssetAccessLevel
    @XStreamConverter(PicklistEnumConverter.class)
    private AssetShare_AssetAccessLevelEnum AssetAccessLevel;

    @JsonProperty("AssetAccessLevel")
    public AssetShare_AssetAccessLevelEnum getAssetAccessLevel() {
        return this.AssetAccessLevel;
    }

    @JsonProperty("AssetAccessLevel")
    public void setAssetAccessLevel(AssetShare_AssetAccessLevelEnum AssetAccessLevel) {
        this.AssetAccessLevel = AssetAccessLevel;
    }

    // RowCause
    @XStreamConverter(PicklistEnumConverter.class)
    private AssetShare_RowCauseEnum RowCause;

    @JsonProperty("RowCause")
    public AssetShare_RowCauseEnum getRowCause() {
        return this.RowCause;
    }

    @JsonProperty("RowCause")
    public void setRowCause(AssetShare_RowCauseEnum RowCause) {
        this.RowCause = RowCause;
    }

}
