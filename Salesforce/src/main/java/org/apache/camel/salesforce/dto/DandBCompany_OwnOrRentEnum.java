/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist OwnOrRent
 */
public enum DandBCompany_OwnOrRentEnum {

    // 0
    _0("0"),
    // 1
    _1("1"),
    // 2
    _2("2");

    final String value;

    private DandBCompany_OwnOrRentEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static DandBCompany_OwnOrRentEnum fromValue(String value) {
        for (DandBCompany_OwnOrRentEnum e : DandBCompany_OwnOrRentEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}