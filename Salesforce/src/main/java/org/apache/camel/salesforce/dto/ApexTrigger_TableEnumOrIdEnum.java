/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Salesforce Enumeration DTO for picklist TableEnumOrId
 */
public enum ApexTrigger_TableEnumOrIdEnum {

    // Account
    ACCOUNT("Account"),
    // Asset
    ASSET("Asset"),
    // AssetTokenEvent
    ASSETTOKENEVENT("AssetTokenEvent"),
    // Attachment
    ATTACHMENT("Attachment"),
    // Campaign
    CAMPAIGN("Campaign"),
    // CampaignMember
    CAMPAIGNMEMBER("CampaignMember"),
    // Case
    CASE("Case"),
    // CaseComment
    CASECOMMENT("CaseComment"),
    // ChatterMessage
    CHATTERMESSAGE("ChatterMessage"),
    // CollaborationGroup
    COLLABORATIONGROUP("CollaborationGroup"),
    // CollaborationGroupMember
    COLLABORATIONGROUPMEMBER("CollaborationGroupMember"),
    // CollaborationGroupRecord
    COLLABORATIONGROUPRECORD("CollaborationGroupRecord"),
    // Contact
    CONTACT("Contact"),
    // ContentDistribution
    CONTENTDISTRIBUTION("ContentDistribution"),
    // ContentDocument
    CONTENTDOCUMENT("ContentDocument"),
    // ContentDocumentLink
    CONTENTDOCUMENTLINK("ContentDocumentLink"),
    // ContentVersion
    CONTENTVERSION("ContentVersion"),
    // Contract
    CONTRACT("Contract"),
    // DandBCompany
    DANDBCOMPANY("DandBCompany"),
    // DuplicateRecordItem
    DUPLICATERECORDITEM("DuplicateRecordItem"),
    // DuplicateRecordSet
    DUPLICATERECORDSET("DuplicateRecordSet"),
    // EmailMessage
    EMAILMESSAGE("EmailMessage"),
    // Event
    EVENT("Event"),
    // FeedComment
    FEEDCOMMENT("FeedComment"),
    // FeedItem
    FEEDITEM("FeedItem"),
    // Goal
    GOAL("Goal"),
    // GoalLink
    GOALLINK("GoalLink"),
    // Idea
    IDEA("Idea"),
    // IdeaComment
    IDEACOMMENT("IdeaComment"),
    // Lead
    LEAD("Lead"),
    // Macro
    MACRO("Macro"),
    // Metric
    METRIC("Metric"),
    // MetricDataLink
    METRICDATALINK("MetricDataLink"),
    // Note
    NOTE("Note"),
    // Opportunity
    OPPORTUNITY("Opportunity"),
    // OpportunityLineItem
    OPPORTUNITYLINEITEM("OpportunityLineItem"),
    // Order
    ORDER("Order"),
    // OrderItem
    ORDERITEM("OrderItem"),
    // Partner
    PARTNER("Partner"),
    // Pricebook2
    PRICEBOOK2("Pricebook2"),
    // Product2
    PRODUCT2("Product2"),
    // RecordOrigin
    RECORDORIGIN("RecordOrigin"),
    // SocialPersona
    SOCIALPERSONA("SocialPersona"),
    // Solution
    SOLUTION("Solution"),
    // StreamingChannel
    STREAMINGCHANNEL("StreamingChannel"),
    // Task
    TASK("Task"),
    // Topic
    TOPIC("Topic"),
    // TopicAssignment
    TOPICASSIGNMENT("TopicAssignment"),
    // User
    USER("User"),
    // UserProvAccount
    USERPROVACCOUNT("UserProvAccount"),
    // UserProvAccountStaging
    USERPROVACCOUNTSTAGING("UserProvAccountStaging"),
    // UserProvMockTarget
    USERPROVMOCKTARGET("UserProvMockTarget"),
    // UserProvisioningLog
    USERPROVISIONINGLOG("UserProvisioningLog"),
    // UserProvisioningRequest
    USERPROVISIONINGREQUEST("UserProvisioningRequest"),
    // WorkCoaching
    WORKCOACHING("WorkCoaching"),
    // WorkFeedback
    WORKFEEDBACK("WorkFeedback"),
    // WorkFeedbackQuestion
    WORKFEEDBACKQUESTION("WorkFeedbackQuestion"),
    // WorkFeedbackQuestionSet
    WORKFEEDBACKQUESTIONSET("WorkFeedbackQuestionSet"),
    // WorkFeedbackRequest
    WORKFEEDBACKREQUEST("WorkFeedbackRequest"),
    // WorkFeedbackTemplate
    WORKFEEDBACKTEMPLATE("WorkFeedbackTemplate"),
    // WorkPerformanceCycle
    WORKPERFORMANCECYCLE("WorkPerformanceCycle");

    final String value;

    private ApexTrigger_TableEnumOrIdEnum(String value) {
        this.value = value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static ApexTrigger_TableEnumOrIdEnum fromValue(String value) {
        for (ApexTrigger_TableEnumOrIdEnum e : ApexTrigger_TableEnumOrIdEnum.values()) {
            if (e.value.equals(value)) {
                return e;
            }
        }
        throw new IllegalArgumentException(value);
    }

}
