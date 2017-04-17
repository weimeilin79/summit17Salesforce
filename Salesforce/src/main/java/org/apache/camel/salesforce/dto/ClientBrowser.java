/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject ClientBrowser
 */
@XStreamAlias("ClientBrowser")
public class ClientBrowser extends AbstractSObjectBase {

    // UsersId
    private String UsersId;

    @JsonProperty("UsersId")
    public String getUsersId() {
        return this.UsersId;
    }

    @JsonProperty("UsersId")
    public void setUsersId(String UsersId) {
        this.UsersId = UsersId;
    }

    // FullUserAgent
    private String FullUserAgent;

    @JsonProperty("FullUserAgent")
    public String getFullUserAgent() {
        return this.FullUserAgent;
    }

    @JsonProperty("FullUserAgent")
    public void setFullUserAgent(String FullUserAgent) {
        this.FullUserAgent = FullUserAgent;
    }

    // ProxyInfo
    private String ProxyInfo;

    @JsonProperty("ProxyInfo")
    public String getProxyInfo() {
        return this.ProxyInfo;
    }

    @JsonProperty("ProxyInfo")
    public void setProxyInfo(String ProxyInfo) {
        this.ProxyInfo = ProxyInfo;
    }

    // LastUpdate
    private java.time.ZonedDateTime LastUpdate;

    @JsonProperty("LastUpdate")
    public java.time.ZonedDateTime getLastUpdate() {
        return this.LastUpdate;
    }

    @JsonProperty("LastUpdate")
    public void setLastUpdate(java.time.ZonedDateTime LastUpdate) {
        this.LastUpdate = LastUpdate;
    }

}
