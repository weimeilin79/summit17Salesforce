/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist PublishStatus
 */
public enum ContentVersion_PublishStatusEnum {

    // P
    P("P"),
    // R
    R("R"),
    // U
    U("U");

    final String value;

    private ContentVersion_PublishStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ContentVersion_PublishStatusEnum fromValue(String value) {
        for (ContentVersion_PublishStatusEnum e : ContentVersion_PublishStatusEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}