/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist State
 */
public enum ProcessDefinition_StateEnum {

    // Active
    ACTIVE("Active"),
    // Inactive
    INACTIVE("Inactive"),
    // Obsolete
    OBSOLETE("Obsolete");

    final String value;

    private ProcessDefinition_StateEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ProcessDefinition_StateEnum fromValue(String value) {
        for (ProcessDefinition_StateEnum e : ProcessDefinition_StateEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
