/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Rating
 */
public enum Lead_RatingEnum {

    // Cold
    COLD("Cold"),
    // Hot
    HOT("Hot"),
    // Warm
    WARM("Warm");

    final String value;

    private Lead_RatingEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Lead_RatingEnum fromValue(String value) {
        for (Lead_RatingEnum e : Lead_RatingEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
