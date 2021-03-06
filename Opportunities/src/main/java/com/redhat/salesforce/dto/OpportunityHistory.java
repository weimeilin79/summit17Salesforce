/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Sun Apr 16 12:59:17 EDT 2017
 */
package com.redhat.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject OpportunityHistory
 */
@XStreamAlias("OpportunityHistory")
public class OpportunityHistory extends AbstractSObjectBase {

    // OpportunityId
    private String OpportunityId;

    @JsonProperty("OpportunityId")
    public String getOpportunityId() {
        return this.OpportunityId;
    }

    @JsonProperty("OpportunityId")
    public void setOpportunityId(String OpportunityId) {
        this.OpportunityId = OpportunityId;
    }

    // StageName
    @XStreamConverter(PicklistEnumConverter.class)
    private OpportunityHistory_StageNameEnum StageName;

    @JsonProperty("StageName")
    public OpportunityHistory_StageNameEnum getStageName() {
        return this.StageName;
    }

    @JsonProperty("StageName")
    public void setStageName(OpportunityHistory_StageNameEnum StageName) {
        this.StageName = StageName;
    }

    // Amount
    private Double Amount;

    @JsonProperty("Amount")
    public Double getAmount() {
        return this.Amount;
    }

    @JsonProperty("Amount")
    public void setAmount(Double Amount) {
        this.Amount = Amount;
    }

    // ExpectedRevenue
    private Double ExpectedRevenue;

    @JsonProperty("ExpectedRevenue")
    public Double getExpectedRevenue() {
        return this.ExpectedRevenue;
    }

    @JsonProperty("ExpectedRevenue")
    public void setExpectedRevenue(Double ExpectedRevenue) {
        this.ExpectedRevenue = ExpectedRevenue;
    }

    // CloseDate
    private java.time.ZonedDateTime CloseDate;

    @JsonProperty("CloseDate")
    public java.time.ZonedDateTime getCloseDate() {
        return this.CloseDate;
    }

    @JsonProperty("CloseDate")
    public void setCloseDate(java.time.ZonedDateTime CloseDate) {
        this.CloseDate = CloseDate;
    }

    // Probability
    private Double Probability;

    @JsonProperty("Probability")
    public Double getProbability() {
        return this.Probability;
    }

    @JsonProperty("Probability")
    public void setProbability(Double Probability) {
        this.Probability = Probability;
    }

    // ForecastCategory
    @XStreamConverter(PicklistEnumConverter.class)
    private OpportunityHistory_ForecastCategoryEnum ForecastCategory;

    @JsonProperty("ForecastCategory")
    public OpportunityHistory_ForecastCategoryEnum getForecastCategory() {
        return this.ForecastCategory;
    }

    @JsonProperty("ForecastCategory")
    public void setForecastCategory(OpportunityHistory_ForecastCategoryEnum ForecastCategory) {
        this.ForecastCategory = ForecastCategory;
    }

}
