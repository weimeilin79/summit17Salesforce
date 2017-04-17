/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Status
 */
public enum BackgroundOperation_StatusEnum {

    // Canceled
    CANCELED("Canceled"),
    // Complete
    COMPLETE("Complete"),
    // Error
    ERROR("Error"),
    // Merged
    MERGED("Merged"),
    // New
    NEW("New"),
    // Running
    RUNNING("Running"),
    // Scheduled
    SCHEDULED("Scheduled"),
    // Waiting
    WAITING("Waiting");

    final String value;

    private BackgroundOperation_StatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static BackgroundOperation_StatusEnum fromValue(String value) {
        for (BackgroundOperation_StatusEnum e : BackgroundOperation_StatusEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
