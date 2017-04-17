/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Industry
 */
public enum LeadCleanInfo_IndustryEnum {

    // Agriculture
    AGRICULTURE("Agriculture"),
    // Apparel
    APPAREL("Apparel"),
    // Banking
    BANKING("Banking"),
    // Biotechnology
    BIOTECHNOLOGY("Biotechnology"),
    // Chemicals
    CHEMICALS("Chemicals"),
    // Communications
    COMMUNICATIONS("Communications"),
    // Construction
    CONSTRUCTION("Construction"),
    // Consulting
    CONSULTING("Consulting"),
    // Education
    EDUCATION("Education"),
    // Electronics
    ELECTRONICS("Electronics"),
    // Energy
    ENERGY("Energy"),
    // Engineering
    ENGINEERING("Engineering"),
    // Entertainment
    ENTERTAINMENT("Entertainment"),
    // Environmental
    ENVIRONMENTAL("Environmental"),
    // Finance
    FINANCE("Finance"),
    // Food & Beverage
    FOOD___BEVERAGE("Food & Beverage"),
    // Government
    GOVERNMENT("Government"),
    // Healthcare
    HEALTHCARE("Healthcare"),
    // Hospitality
    HOSPITALITY("Hospitality"),
    // Insurance
    INSURANCE("Insurance"),
    // Machinery
    MACHINERY("Machinery"),
    // Manufacturing
    MANUFACTURING("Manufacturing"),
    // Media
    MEDIA("Media"),
    // Not For Profit
    NOT_FOR_PROFIT("Not For Profit"),
    // Other
    OTHER("Other"),
    // Recreation
    RECREATION("Recreation"),
    // Retail
    RETAIL("Retail"),
    // Shipping
    SHIPPING("Shipping"),
    // Technology
    TECHNOLOGY("Technology"),
    // Telecommunications
    TELECOMMUNICATIONS("Telecommunications"),
    // Transportation
    TRANSPORTATION("Transportation"),
    // Utilities
    UTILITIES("Utilities");

    final String value;

    private LeadCleanInfo_IndustryEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static LeadCleanInfo_IndustryEnum fromValue(String value) {
        for (LeadCleanInfo_IndustryEnum e : LeadCleanInfo_IndustryEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
