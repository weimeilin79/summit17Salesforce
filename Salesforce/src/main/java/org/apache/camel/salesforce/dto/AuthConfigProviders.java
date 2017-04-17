/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject AuthConfigProviders
 */
@XStreamAlias("AuthConfigProviders")
public class AuthConfigProviders extends AbstractSObjectBase {

    // AuthConfigId
    private String AuthConfigId;

    @JsonProperty("AuthConfigId")
    public String getAuthConfigId() {
        return this.AuthConfigId;
    }

    @JsonProperty("AuthConfigId")
    public void setAuthConfigId(String AuthConfigId) {
        this.AuthConfigId = AuthConfigId;
    }

    // AuthProviderId
    private String AuthProviderId;

    @JsonProperty("AuthProviderId")
    public String getAuthProviderId() {
        return this.AuthProviderId;
    }

    @JsonProperty("AuthProviderId")
    public void setAuthProviderId(String AuthProviderId) {
        this.AuthProviderId = AuthProviderId;
    }

}
