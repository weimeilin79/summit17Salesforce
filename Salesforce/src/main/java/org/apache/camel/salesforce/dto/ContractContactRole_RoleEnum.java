/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Role
 */
public enum ContractContactRole_RoleEnum {

    // Business User
    BUSINESS_USER("Business User"),
    // Decision Maker
    DECISION_MAKER("Decision Maker"),
    // Economic Buyer
    ECONOMIC_BUYER("Economic Buyer"),
    // Economic Decision Maker
    ECONOMIC_DECISION_MAKER("Economic Decision Maker"),
    // Evaluator
    EVALUATOR("Evaluator"),
    // Executive Sponsor
    EXECUTIVE_SPONSOR("Executive Sponsor"),
    // Influencer
    INFLUENCER("Influencer"),
    // Other
    OTHER("Other"),
    // Technical Buyer
    TECHNICAL_BUYER("Technical Buyer");

    final String value;

    private ContractContactRole_RoleEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ContractContactRole_RoleEnum fromValue(String value) {
        for (ContractContactRole_RoleEnum e : ContractContactRole_RoleEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}