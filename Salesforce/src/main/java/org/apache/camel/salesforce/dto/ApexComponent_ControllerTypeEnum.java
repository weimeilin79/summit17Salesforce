/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ControllerType
 */
public enum ApexComponent_ControllerTypeEnum {

    // 0
    _0("0"),
    // 1
    _1("1"),
    // 2
    _2("2"),
    // 3
    _3("3"),
    // 4
    _4("4"),
    // 5
    _5("5");

    final String value;

    private ApexComponent_ControllerTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ApexComponent_ControllerTypeEnum fromValue(String value) {
        for (ApexComponent_ControllerTypeEnum e : ApexComponent_ControllerTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
