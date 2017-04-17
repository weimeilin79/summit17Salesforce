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
public enum UserProvAccount_StatusEnum {

    // Active
    ACTIVE("Active"),
    // Deactivated
    DEACTIVATED("Deactivated"),
    // Deleted
    DELETED("Deleted");

    final String value;

    private UserProvAccount_StatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static UserProvAccount_StatusEnum fromValue(String value) {
        for (UserProvAccount_StatusEnum e : UserProvAccount_StatusEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}