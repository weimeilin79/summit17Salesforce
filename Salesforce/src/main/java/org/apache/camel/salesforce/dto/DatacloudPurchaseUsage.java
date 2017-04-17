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
 * Salesforce DTO for SObject DatacloudPurchaseUsage
 */
@XStreamAlias("DatacloudPurchaseUsage")
public class DatacloudPurchaseUsage extends AbstractSObjectBase {

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

    // UserType
    @XStreamConverter(PicklistEnumConverter.class)
    private DatacloudPurchaseUsage_UserTypeEnum UserType;

    @JsonProperty("UserType")
    public DatacloudPurchaseUsage_UserTypeEnum getUserType() {
        return this.UserType;
    }

    @JsonProperty("UserType")
    public void setUserType(DatacloudPurchaseUsage_UserTypeEnum UserType) {
        this.UserType = UserType;
    }

    // PurchaseType
    @XStreamConverter(PicklistEnumConverter.class)
    private DatacloudPurchaseUsage_PurchaseTypeEnum PurchaseType;

    @JsonProperty("PurchaseType")
    public DatacloudPurchaseUsage_PurchaseTypeEnum getPurchaseType() {
        return this.PurchaseType;
    }

    @JsonProperty("PurchaseType")
    public void setPurchaseType(DatacloudPurchaseUsage_PurchaseTypeEnum PurchaseType) {
        this.PurchaseType = PurchaseType;
    }

    // DatacloudEntityType
    @XStreamConverter(PicklistEnumConverter.class)
    private DatacloudPurchaseUsage_DatacloudEntityTypeEnum DatacloudEntityType;

    @JsonProperty("DatacloudEntityType")
    public DatacloudPurchaseUsage_DatacloudEntityTypeEnum getDatacloudEntityType() {
        return this.DatacloudEntityType;
    }

    @JsonProperty("DatacloudEntityType")
    public void setDatacloudEntityType(DatacloudPurchaseUsage_DatacloudEntityTypeEnum DatacloudEntityType) {
        this.DatacloudEntityType = DatacloudEntityType;
    }

    // Usage
    private Double Usage;

    @JsonProperty("Usage")
    public Double getUsage() {
        return this.Usage;
    }

    @JsonProperty("Usage")
    public void setUsage(Double Usage) {
        this.Usage = Usage;
    }

    // Description
    private String Description;

    @JsonProperty("Description")
    public String getDescription() {
        return this.Description;
    }

    @JsonProperty("Description")
    public void setDescription(String Description) {
        this.Description = Description;
    }

}
