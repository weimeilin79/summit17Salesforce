/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist ActionListContext
 */
public enum PlatformAction_ActionListContextEnum {

    // Assistant
    ASSISTANT("Assistant"),
    // BannerPhoto
    BANNERPHOTO("BannerPhoto"),
    // Chatter
    CHATTER("Chatter"),
    // Dockable
    DOCKABLE("Dockable"),
    // FeedElement
    FEEDELEMENT("FeedElement"),
    // Flexipage
    FLEXIPAGE("Flexipage"),
    // Global
    GLOBAL("Global"),
    // ListView
    LISTVIEW("ListView"),
    // ListViewDefinition
    LISTVIEWDEFINITION("ListViewDefinition"),
    // ListViewRecord
    LISTVIEWRECORD("ListViewRecord"),
    // Lookup
    LOOKUP("Lookup"),
    // MruList
    MRULIST("MruList"),
    // MruRow
    MRUROW("MruRow"),
    // ObjectHomeChart
    OBJECTHOMECHART("ObjectHomeChart"),
    // Photo
    PHOTO("Photo"),
    // Record
    RECORD("Record"),
    // RecordEdit
    RECORDEDIT("RecordEdit"),
    // RelatedList
    RELATEDLIST("RelatedList"),
    // RelatedListRecord
    RELATEDLISTRECORD("RelatedListRecord");

    final String value;

    private PlatformAction_ActionListContextEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static PlatformAction_ActionListContextEnum fromValue(String value) {
        for (PlatformAction_ActionListContextEnum e : PlatformAction_ActionListContextEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
