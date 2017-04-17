/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject DuplicateRecordSet
 */
@XStreamAlias("DuplicateRecordSet")
public class DuplicateRecordSet extends AbstractSObjectBase {

    // DuplicateRuleId
    private String DuplicateRuleId;

    @JsonProperty("DuplicateRuleId")
    public String getDuplicateRuleId() {
        return this.DuplicateRuleId;
    }

    @JsonProperty("DuplicateRuleId")
    public void setDuplicateRuleId(String DuplicateRuleId) {
        this.DuplicateRuleId = DuplicateRuleId;
    }

    // RecordCount
    private Integer RecordCount;

    @JsonProperty("RecordCount")
    public Integer getRecordCount() {
        return this.RecordCount;
    }

    @JsonProperty("RecordCount")
    public void setRecordCount(Integer RecordCount) {
        this.RecordCount = RecordCount;
    }

}
