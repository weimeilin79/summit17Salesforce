/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Sun Apr 16 12:59:17 EDT 2017
 */
package com.redhat.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ForecastCategoryName
 */
public enum Opportunity_ForecastCategoryNameEnum {

    // Best Case
    BEST_CASE("Best Case"),
    // Closed
    CLOSED("Closed"),
    // Commit
    COMMIT("Commit"),
    // Omitted
    OMITTED("Omitted"),
    // Pipeline
    PIPELINE("Pipeline");

    final String value;

    private Opportunity_ForecastCategoryNameEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Opportunity_ForecastCategoryNameEnum fromValue(String value) {
        for (Opportunity_ForecastCategoryNameEnum e : Opportunity_ForecastCategoryNameEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}