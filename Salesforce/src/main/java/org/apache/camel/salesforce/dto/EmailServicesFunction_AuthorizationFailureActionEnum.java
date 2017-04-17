/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist AuthorizationFailureAction
 */
public enum EmailServicesFunction_AuthorizationFailureActionEnum {

    // 0
    _0("0"),
    // 1
    _1("1"),
    // 2
    _2("2"),
    // 3
    _3("3");

    final String value;

    private EmailServicesFunction_AuthorizationFailureActionEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static EmailServicesFunction_AuthorizationFailureActionEnum fromValue(String value) {
        for (EmailServicesFunction_AuthorizationFailureActionEnum e : EmailServicesFunction_AuthorizationFailureActionEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}