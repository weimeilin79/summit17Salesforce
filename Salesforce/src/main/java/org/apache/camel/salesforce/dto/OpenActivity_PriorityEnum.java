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
public enum OpenActivity_PriorityEnum {

    // High
    HIGH("High"),
    // Low
    LOW("Low"),
    // Normal
    NORMAL("Normal");

    final String value;

    private OpenActivity_PriorityEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static OpenActivity_PriorityEnum fromValue(String value) {
        for (OpenActivity_PriorityEnum e : OpenActivity_PriorityEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}