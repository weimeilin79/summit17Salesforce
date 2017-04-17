/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist SessionSecurityLevel
 */
public enum AuthSession_SessionSecurityLevelEnum {

    // HIGH_ASSURANCE
    HIGH_ASSURANCE("HIGH_ASSURANCE"),
    // LOW
    LOW("LOW"),
    // STANDARD
    STANDARD("STANDARD");

    final String value;

    private AuthSession_SessionSecurityLevelEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static AuthSession_SessionSecurityLevelEnum fromValue(String value) {
        for (AuthSession_SessionSecurityLevelEnum e : AuthSession_SessionSecurityLevelEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
