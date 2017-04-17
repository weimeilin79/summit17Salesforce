/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist BackgroundDirection
 */
public enum Dashboard_BackgroundDirectionEnum {

    // Diagonal
    DIAGONAL("Diagonal"),
    // LeftToRight
    LEFTTORIGHT("LeftToRight"),
    // TopToBottom
    TOPTOBOTTOM("TopToBottom");

    final String value;

    private Dashboard_BackgroundDirectionEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Dashboard_BackgroundDirectionEnum fromValue(String value) {
        for (Dashboard_BackgroundDirectionEnum e : Dashboard_BackgroundDirectionEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}