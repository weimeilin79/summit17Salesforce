/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ClickjackProtectionLevel
 */
public enum Site_ClickjackProtectionLevelEnum {

    // AllowAllFraming
    ALLOWALLFRAMING("AllowAllFraming"),
    // NoFraming
    NOFRAMING("NoFraming"),
    // SameOriginOnly
    SAMEORIGINONLY("SameOriginOnly");

    final String value;

    private Site_ClickjackProtectionLevelEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static Site_ClickjackProtectionLevelEnum fromValue(String value) {
        for (Site_ClickjackProtectionLevelEnum e : Site_ClickjackProtectionLevelEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}