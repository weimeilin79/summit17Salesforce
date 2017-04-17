/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist OpportunityAccessForAccountOwner
 */
public enum UserRole_OpportunityAccessForAccountOwnerEnum {

    // Edit
    EDIT("Edit"),
    // None
    NONE("None"),
    // Read
    READ("Read");

    final String value;

    private UserRole_OpportunityAccessForAccountOwnerEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static UserRole_OpportunityAccessForAccountOwnerEnum fromValue(String value) {
        for (UserRole_OpportunityAccessForAccountOwnerEnum e : UserRole_OpportunityAccessForAccountOwnerEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
