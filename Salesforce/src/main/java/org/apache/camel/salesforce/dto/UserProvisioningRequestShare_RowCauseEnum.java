/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist RowCause
 */
public enum UserProvisioningRequestShare_RowCauseEnum {

    // ImplicitChild
    IMPLICITCHILD("ImplicitChild"),
    // ImplicitParent
    IMPLICITPARENT("ImplicitParent"),
    // ImplicitPerson
    IMPLICITPERSON("ImplicitPerson"),
    // Manual
    MANUAL("Manual"),
    // Owner
    OWNER("Owner"),
    // Rule
    RULE("Rule"),
    // Team
    TEAM("Team"),
    // Territory
    TERRITORY("Territory"),
    // Territory2Forecast
    TERRITORY2FORECAST("Territory2Forecast"),
    // TerritoryManual
    TERRITORYMANUAL("TerritoryManual"),
    // TerritoryRule
    TERRITORYRULE("TerritoryRule");

    final String value;

    private UserProvisioningRequestShare_RowCauseEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static UserProvisioningRequestShare_RowCauseEnum fromValue(String value) {
        for (UserProvisioningRequestShare_RowCauseEnum e : UserProvisioningRequestShare_RowCauseEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
