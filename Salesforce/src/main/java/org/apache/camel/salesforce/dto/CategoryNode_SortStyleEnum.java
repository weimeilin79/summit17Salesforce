/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist SortStyle
 */
public enum CategoryNode_SortStyleEnum {

    // alphabetical
    ALPHABETICAL("alphabetical"),
    // custom
    CUSTOM("custom");

    final String value;

    private CategoryNode_SortStyleEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static CategoryNode_SortStyleEnum fromValue(String value) {
        for (CategoryNode_SortStyleEnum e : CategoryNode_SortStyleEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
