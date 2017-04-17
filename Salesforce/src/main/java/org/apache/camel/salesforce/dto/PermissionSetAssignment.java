/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject PermissionSetAssignment
 */
@XStreamAlias("PermissionSetAssignment")
public class PermissionSetAssignment extends AbstractSObjectBase {

    // PermissionSetId
    private String PermissionSetId;

    @JsonProperty("PermissionSetId")
    public String getPermissionSetId() {
        return this.PermissionSetId;
    }

    @JsonProperty("PermissionSetId")
    public void setPermissionSetId(String PermissionSetId) {
        this.PermissionSetId = PermissionSetId;
    }

    // AssigneeId
    private String AssigneeId;

    @JsonProperty("AssigneeId")
    public String getAssigneeId() {
        return this.AssigneeId;
    }

    @JsonProperty("AssigneeId")
    public void setAssigneeId(String AssigneeId) {
        this.AssigneeId = AssigneeId;
    }

}
