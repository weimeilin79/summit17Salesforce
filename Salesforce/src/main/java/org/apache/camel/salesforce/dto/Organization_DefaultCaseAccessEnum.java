/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist DefaultCaseAccess
 */
public enum Organization_DefaultCaseAccessEnum {

    // Edit
    EDIT("Edit"),
    // None
    NONE("None"),
    // Read
    READ("Read"),
    // ReadEditTransfer
    READEDITTRANSFER("ReadEditTransfer");

    final String value;

    private Organization_DefaultCaseAccessEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Organization_DefaultCaseAccessEnum fromValue(String value) {
        for (Organization_DefaultCaseAccessEnum e : Organization_DefaultCaseAccessEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
