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
 * Salesforce DTO for SObject Asset
 */
@XStreamAlias("Asset")
public class Asset extends AbstractSObjectBase {

    // ContactId
    private String ContactId;

    @JsonProperty("ContactId")
    public String getContactId() {
        return this.ContactId;
    }

    @JsonProperty("ContactId")
    public void setContactId(String ContactId) {
        this.ContactId = ContactId;
    }

    // AccountId
    private String AccountId;

    @JsonProperty("AccountId")
    public String getAccountId() {
        return this.AccountId;
    }

    @JsonProperty("AccountId")
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    // Product2Id
    private String Product2Id;

    @JsonProperty("Product2Id")
    public String getProduct2Id() {
        return this.Product2Id;
    }

    @JsonProperty("Product2Id")
    public void setProduct2Id(String Product2Id) {
        this.Product2Id = Product2Id;
    }

    // IsCompetitorProduct
    private Boolean IsCompetitorProduct;

    @JsonProperty("IsCompetitorProduct")
    public Boolean getIsCompetitorProduct() {
        return this.IsCompetitorProduct;
    }

    @JsonProperty("IsCompetitorProduct")
    public void setIsCompetitorProduct(Boolean IsCompetitorProduct) {
        this.IsCompetitorProduct = IsCompetitorProduct;
    }

    // SerialNumber
    private String SerialNumber;

    @JsonProperty("SerialNumber")
    public String getSerialNumber() {
        return this.SerialNumber;
    }

    @JsonProperty("SerialNumber")
    public void setSerialNumber(String SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    // InstallDate
    private java.time.ZonedDateTime InstallDate;

    @JsonProperty("InstallDate")
    public java.time.ZonedDateTime getInstallDate() {
        return this.InstallDate;
    }

    @JsonProperty("InstallDate")
    public void setInstallDate(java.time.ZonedDateTime InstallDate) {
        this.InstallDate = InstallDate;
    }

    // PurchaseDate
    private java.time.ZonedDateTime PurchaseDate;

    @JsonProperty("PurchaseDate")
    public java.time.ZonedDateTime getPurchaseDate() {
        return this.PurchaseDate;
    }

    @JsonProperty("PurchaseDate")
    public void setPurchaseDate(java.time.ZonedDateTime PurchaseDate) {
        this.PurchaseDate = PurchaseDate;
    }

    // UsageEndDate
    private java.time.ZonedDateTime UsageEndDate;

    @JsonProperty("UsageEndDate")
    public java.time.ZonedDateTime getUsageEndDate() {
        return this.UsageEndDate;
    }

    @JsonProperty("UsageEndDate")
    public void setUsageEndDate(java.time.ZonedDateTime UsageEndDate) {
        this.UsageEndDate = UsageEndDate;
    }

    // Status
    @XStreamConverter(PicklistEnumConverter.class)
    private Asset_StatusEnum Status;

    @JsonProperty("Status")
    public Asset_StatusEnum getStatus() {
        return this.Status;
    }

    @JsonProperty("Status")
    public void setStatus(Asset_StatusEnum Status) {
        this.Status = Status;
    }

    // Price
    private Double Price;

    @JsonProperty("Price")
    public Double getPrice() {
        return this.Price;
    }

    @JsonProperty("Price")
    public void setPrice(Double Price) {
        this.Price = Price;
    }

    // Quantity
    private Double Quantity;

    @JsonProperty("Quantity")
    public Double getQuantity() {
        return this.Quantity;
    }

    @JsonProperty("Quantity")
    public void setQuantity(Double Quantity) {
        this.Quantity = Quantity;
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
