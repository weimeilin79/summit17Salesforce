/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Outcome
 */
public enum ApexTestResult_OutcomeEnum {

    // CompileFail
    COMPILEFAIL("CompileFail"),
    // Fail
    FAIL("Fail"),
    // Pass
    PASS("Pass"),
    // Skip
    SKIP("Skip");

    final String value;

    private ApexTestResult_OutcomeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ApexTestResult_OutcomeEnum fromValue(String value) {
        for (ApexTestResult_OutcomeEnum e : ApexTestResult_OutcomeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
