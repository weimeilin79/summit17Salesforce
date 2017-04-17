/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Priority
 */
public enum ActivityHistory_PriorityEnum {

    // High
    HIGH("High"),
    // Low
    LOW("Low"),
    // Normal
    NORMAL("Normal");

    final String value;

    private ActivityHistory_PriorityEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ActivityHistory_PriorityEnum fromValue(String value) {
        for (ActivityHistory_PriorityEnum e : ActivityHistory_PriorityEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
