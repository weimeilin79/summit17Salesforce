/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist OpportunityAccessLevel
 */
public enum OpportunityShare_OpportunityAccessLevelEnum {

    // All
    ALL("All"),
    // Edit
    EDIT("Edit"),
    // Read
    READ("Read");

    final String value;

    private OpportunityShare_OpportunityAccessLevelEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static OpportunityShare_OpportunityAccessLevelEnum fromValue(String value) {
        for (OpportunityShare_OpportunityAccessLevelEnum e : OpportunityShare_OpportunityAccessLevelEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}