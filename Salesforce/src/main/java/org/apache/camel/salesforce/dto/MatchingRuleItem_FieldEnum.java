/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Field
 */
public enum MatchingRuleItem_FieldEnum {

    // Account
    ACCOUNT("Account"),
    // AccountNumber
    ACCOUNTNUMBER("AccountNumber"),
    // AccountSource
    ACCOUNTSOURCE("AccountSource"),
    // Active
    ACTIVE("Active"),
    // Address
    ADDRESS("Address"),
    // AssistantName
    ASSISTANTNAME("AssistantName"),
    // AssistantPhone
    ASSISTANTPHONE("AssistantPhone"),
    // BillingAddress
    BILLINGADDRESS("BillingAddress"),
    // BillingCity
    BILLINGCITY("BillingCity"),
    // BillingCountry
    BILLINGCOUNTRY("BillingCountry"),
    // BillingPostalCode
    BILLINGPOSTALCODE("BillingPostalCode"),
    // BillingState
    BILLINGSTATE("BillingState"),
    // BillingStreet
    BILLINGSTREET("BillingStreet"),
    // City
    CITY("City"),
    // CleanStatus
    CLEANSTATUS("CleanStatus"),
    // Company
    COMPANY("Company"),
    // CompanyDunsNumber
    COMPANYDUNSNUMBER("CompanyDunsNumber"),
    // Country
    COUNTRY("Country"),
    // CurrentGenerators
    CURRENTGENERATORS("CurrentGenerators"),
    // CustomerPriority
    CUSTOMERPRIORITY("CustomerPriority"),
    // Department
    DEPARTMENT("Department"),
    // DunsNumber
    DUNSNUMBER("DunsNumber"),
    // Email
    EMAIL("Email"),
    // EmailBouncedReason
    EMAILBOUNCEDREASON("EmailBouncedReason"),
    // Fax
    FAX("Fax"),
    // FirstName
    FIRSTNAME("FirstName"),
    // HomePhone
    HOMEPHONE("HomePhone"),
    // Industry
    INDUSTRY("Industry"),
    // Jigsaw
    JIGSAW("Jigsaw"),
    // Languages
    LANGUAGES("Languages"),
    // LastName
    LASTNAME("LastName"),
    // LeadSource
    LEADSOURCE("LeadSource"),
    // Level
    LEVEL("Level"),
    // MailingAddress
    MAILINGADDRESS("MailingAddress"),
    // MailingCity
    MAILINGCITY("MailingCity"),
    // MailingCountry
    MAILINGCOUNTRY("MailingCountry"),
    // MailingPostalCode
    MAILINGPOSTALCODE("MailingPostalCode"),
    // MailingState
    MAILINGSTATE("MailingState"),
    // MailingStreet
    MAILINGSTREET("MailingStreet"),
    // MobilePhone
    MOBILEPHONE("MobilePhone"),
    // NaicsCode
    NAICSCODE("NaicsCode"),
    // NaicsDesc
    NAICSDESC("NaicsDesc"),
    // Name
    NAME("Name"),
    // NumberOfEmployees
    NUMBEROFEMPLOYEES("NumberOfEmployees"),
    // NumberofLocations
    NUMBEROFLOCATIONS("NumberofLocations"),
    // OtherAddress
    OTHERADDRESS("OtherAddress"),
    // OtherCity
    OTHERCITY("OtherCity"),
    // OtherCountry
    OTHERCOUNTRY("OtherCountry"),
    // OtherPhone
    OTHERPHONE("OtherPhone"),
    // OtherPostalCode
    OTHERPOSTALCODE("OtherPostalCode"),
    // OtherState
    OTHERSTATE("OtherState"),
    // OtherStreet
    OTHERSTREET("OtherStreet"),
    // Ownership
    OWNERSHIP("Ownership"),
    // Parent
    PARENT("Parent"),
    // Phone
    PHONE("Phone"),
    // PostalCode
    POSTALCODE("PostalCode"),
    // Primary
    PRIMARY("Primary"),
    // ProductInterest
    PRODUCTINTEREST("ProductInterest"),
    // Rating
    RATING("Rating"),
    // ReportsTo
    REPORTSTO("ReportsTo"),
    // SICCode
    SICCODE("SICCode"),
    // SLA
    SLA("SLA"),
    // SLASerialNumber
    SLASERIALNUMBER("SLASerialNumber"),
    // Salutation
    SALUTATION("Salutation"),
    // ShippingAddress
    SHIPPINGADDRESS("ShippingAddress"),
    // ShippingCity
    SHIPPINGCITY("ShippingCity"),
    // ShippingCountry
    SHIPPINGCOUNTRY("ShippingCountry"),
    // ShippingPostalCode
    SHIPPINGPOSTALCODE("ShippingPostalCode"),
    // ShippingState
    SHIPPINGSTATE("ShippingState"),
    // ShippingStreet
    SHIPPINGSTREET("ShippingStreet"),
    // Sic
    SIC("Sic"),
    // SicDesc
    SICDESC("SicDesc"),
    // Site
    SITE("Site"),
    // State
    STATE("State"),
    // Status
    STATUS("Status"),
    // Street
    STREET("Street"),
    // TextName
    TEXTNAME("TextName"),
    // TickerSymbol
    TICKERSYMBOL("TickerSymbol"),
    // Title
    TITLE("Title"),
    // Tradestyle
    TRADESTYLE("Tradestyle"),
    // Type
    TYPE("Type"),
    // UpsellOpportunity
    UPSELLOPPORTUNITY("UpsellOpportunity"),
    // Website
    WEBSITE("Website"),
    // YearStarted
    YEARSTARTED("YearStarted");

    final String value;

    private MatchingRuleItem_FieldEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static MatchingRuleItem_FieldEnum fromValue(String value) {
        for (MatchingRuleItem_FieldEnum e : MatchingRuleItem_FieldEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
