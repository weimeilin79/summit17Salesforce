/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist CollaborationRole
 */
public enum CollaborationGroupMember_CollaborationRoleEnum {

    // Admin
    ADMIN("Admin"),
    // Standard
    STANDARD("Standard");

    final String value;

    private CollaborationGroupMember_CollaborationRoleEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static CollaborationGroupMember_CollaborationRoleEnum fromValue(String value) {
        for (CollaborationGroupMember_CollaborationRoleEnum e : CollaborationGroupMember_CollaborationRoleEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}