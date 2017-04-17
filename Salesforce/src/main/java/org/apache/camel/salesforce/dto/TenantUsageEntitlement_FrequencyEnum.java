/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Frequency
 */
public enum TenantUsageEntitlement_FrequencyEnum {

    // Fortnightly
    FORTNIGHTLY("Fortnightly"),
    // Monthly
    MONTHLY("Monthly"),
    // Once
    ONCE("Once"),
    // Quarterly
    QUARTERLY("Quarterly"),
    // Weekly
    WEEKLY("Weekly"),
    // Yearly
    YEARLY("Yearly");

    final String value;

    private TenantUsageEntitlement_FrequencyEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static TenantUsageEntitlement_FrequencyEnum fromValue(String value) {
        for (TenantUsageEntitlement_FrequencyEnum e : TenantUsageEntitlement_FrequencyEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
