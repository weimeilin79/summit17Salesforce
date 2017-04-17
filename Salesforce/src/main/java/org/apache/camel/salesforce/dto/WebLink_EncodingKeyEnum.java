/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist EncodingKey
 */
public enum WebLink_EncodingKeyEnum {

    // Big5
    BIG5("Big5"),
    // Big5-HKSCS
    BIG5_HKSCS("Big5-HKSCS"),
    // EUC-JP
    EUC_JP("EUC-JP"),
    // GB2312
    GB2312("GB2312"),
    // ISO-2022-JP
    ISO_2022_JP("ISO-2022-JP"),
    // ISO-8859-1
    ISO_8859_1("ISO-8859-1"),
    // Shift_JIS
    SHIFT_JIS("Shift_JIS"),
    // UTF-8
    UTF_8("UTF-8"),
    // ks_c_5601-1987
    KS_C_5601_1987("ks_c_5601-1987"),
    // x-SJIS_0213
    X_SJIS_0213("x-SJIS_0213");

    final String value;

    private WebLink_EncodingKeyEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static WebLink_EncodingKeyEnum fromValue(String value) {
        for (WebLink_EncodingKeyEnum e : WebLink_EncodingKeyEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}