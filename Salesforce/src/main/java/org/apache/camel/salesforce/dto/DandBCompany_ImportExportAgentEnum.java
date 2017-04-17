/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ImportExportAgent
 */
public enum DandBCompany_ImportExportAgentEnum {

    // A
    A("A"),
    // B
    B("B"),
    // C
    C("C"),
    // D
    D("D"),
    // E
    E("E"),
    // F
    F("F"),
    // G
    G("G"),
    // H
    H("H");

    final String value;

    private DandBCompany_ImportExportAgentEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static DandBCompany_ImportExportAgentEnum fromValue(String value) {
        for (DandBCompany_ImportExportAgentEnum e : DandBCompany_ImportExportAgentEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
