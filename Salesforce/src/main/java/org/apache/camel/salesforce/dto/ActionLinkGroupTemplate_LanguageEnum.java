/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist Language
 */
public enum ActionLinkGroupTemplate_LanguageEnum {

    // da
    DA("da"),
    // de
    DE("de"),
    // en_US
    EN_US("en_US"),
    // es
    ES("es"),
    // es_MX
    ES_MX("es_MX"),
    // fi
    FI("fi"),
    // fr
    FR("fr"),
    // it
    IT("it"),
    // ja
    JA("ja"),
    // ko
    KO("ko"),
    // nl_NL
    NL_NL("nl_NL"),
    // no
    NO("no"),
    // pt_BR
    PT_BR("pt_BR"),
    // ru
    RU("ru"),
    // sv
    SV("sv"),
    // th
    TH("th"),
    // zh_CN
    ZH_CN("zh_CN"),
    // zh_TW
    ZH_TW("zh_TW");

    final String value;

    private ActionLinkGroupTemplate_LanguageEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ActionLinkGroupTemplate_LanguageEnum fromValue(String value) {
        for (ActionLinkGroupTemplate_LanguageEnum e : ActionLinkGroupTemplate_LanguageEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
