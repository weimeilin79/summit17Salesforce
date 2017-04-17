/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Status
 */
public enum CollaborationGroupMemberRequest_StatusEnum {

    // Accepted
    ACCEPTED("Accepted"),
    // Declined
    DECLINED("Declined"),
    // Pending
    PENDING("Pending");

    final String value;

    private CollaborationGroupMemberRequest_StatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static CollaborationGroupMemberRequest_StatusEnum fromValue(String value) {
        for (CollaborationGroupMemberRequest_StatusEnum e : CollaborationGroupMemberRequest_StatusEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
