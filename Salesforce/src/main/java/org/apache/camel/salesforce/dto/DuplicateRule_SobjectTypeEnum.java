/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist SobjectType
 */
public enum DuplicateRule_SobjectTypeEnum {

    // Account
    ACCOUNT("Account"),
    // Contact
    CONTACT("Contact"),
    // Lead
    LEAD("Lead");

    final String value;

    private DuplicateRule_SobjectTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static DuplicateRule_SobjectTypeEnum fromValue(String value) {
        for (DuplicateRule_SobjectTypeEnum e : DuplicateRule_SobjectTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}