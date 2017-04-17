/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist NotificationFrequency
 */
public enum CollaborationGroupMember_NotificationFrequencyEnum {

    // D
    D("D"),
    // N
    N("N"),
    // P
    P("P"),
    // W
    W("W");

    final String value;

    private CollaborationGroupMember_NotificationFrequencyEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static CollaborationGroupMember_NotificationFrequencyEnum fromValue(String value) {
        for (CollaborationGroupMember_NotificationFrequencyEnum e : CollaborationGroupMember_NotificationFrequencyEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}