/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist CallType
 */
public enum Task_CallTypeEnum {

    // Inbound
    INBOUND("Inbound"),
    // Internal
    INTERNAL("Internal"),
    // Outbound
    OUTBOUND("Outbound");

    final String value;

    private Task_CallTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Task_CallTypeEnum fromValue(String value) {
        for (Task_CallTypeEnum e : Task_CallTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
