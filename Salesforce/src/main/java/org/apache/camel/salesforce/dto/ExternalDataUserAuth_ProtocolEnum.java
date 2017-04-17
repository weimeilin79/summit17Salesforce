/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Protocol
 */
public enum ExternalDataUserAuth_ProtocolEnum {

    // NoAuthentication
    NOAUTHENTICATION("NoAuthentication"),
    // Oauth
    OAUTH("Oauth"),
    // Password
    PASSWORD("Password");

    final String value;

    private ExternalDataUserAuth_ProtocolEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ExternalDataUserAuth_ProtocolEnum fromValue(String value) {
        for (ExternalDataUserAuth_ProtocolEnum e : ExternalDataUserAuth_ProtocolEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
