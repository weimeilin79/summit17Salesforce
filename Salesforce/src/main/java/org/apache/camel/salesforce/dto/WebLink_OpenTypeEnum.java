/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist OpenType
 */
public enum WebLink_OpenTypeEnum {

    // newWindow
    NEWWINDOW("newWindow"),
    // noSidebar
    NOSIDEBAR("noSidebar"),
    // onClickJavaScript
    ONCLICKJAVASCRIPT("onClickJavaScript"),
    // replace
    REPLACE("replace"),
    // sidebar
    SIDEBAR("sidebar");

    final String value;

    private WebLink_OpenTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static WebLink_OpenTypeEnum fromValue(String value) {
        for (WebLink_OpenTypeEnum e : WebLink_OpenTypeEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
