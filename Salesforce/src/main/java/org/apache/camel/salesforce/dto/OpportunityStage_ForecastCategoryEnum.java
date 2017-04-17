/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ForecastCategory
 */
public enum OpportunityStage_ForecastCategoryEnum {

    // BestCase
    BESTCASE("BestCase"),
    // Closed
    CLOSED("Closed"),
    // Forecast
    FORECAST("Forecast"),
    // Omitted
    OMITTED("Omitted"),
    // Pipeline
    PIPELINE("Pipeline");

    final String value;

    private OpportunityStage_ForecastCategoryEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static OpportunityStage_ForecastCategoryEnum fromValue(String value) {
        for (OpportunityStage_ForecastCategoryEnum e : OpportunityStage_ForecastCategoryEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
