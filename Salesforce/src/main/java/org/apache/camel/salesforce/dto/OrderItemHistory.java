/*
 * Salesforce DTO generated by camel-salesforce-maven-plugin
 * Generated on: Fri Apr 14 20:48:00 EDT 2017
 */
package org.apache.camel.salesforce.dto;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamConverter;
import org.apache.camel.component.salesforce.api.PicklistEnumConverter;
import org.apache.camel.component.salesforce.api.dto.AbstractSObjectBase;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Salesforce DTO for SObject OrderItemHistory
 */
@XStreamAlias("OrderItemHistory")
public class OrderItemHistory extends AbstractSObjectBase {

    // OrderItemId
    private String OrderItemId;

    @JsonProperty("OrderItemId")
    public String getOrderItemId() {
        return this.OrderItemId;
    }

    @JsonProperty("OrderItemId")
    public void setOrderItemId(String OrderItemId) {
        this.OrderItemId = OrderItemId;
    }

    // Field
    @XStreamConverter(PicklistEnumConverter.class)
    private OrderItemHistory_FieldEnum Field;

    @JsonProperty("Field")
    public OrderItemHistory_FieldEnum getField() {
        return this.Field;
    }

    @JsonProperty("Field")
    public void setField(OrderItemHistory_FieldEnum Field) {
        this.Field = Field;
    }

    // OldValue
    private String OldValue;

    @JsonProperty("OldValue")
    public String getOldValue() {
        return this.OldValue;
    }

    @JsonProperty("OldValue")
    public void setOldValue(String OldValue) {
        this.OldValue = OldValue;
    }

    // NewValue
    private String NewValue;

    @JsonProperty("NewValue")
    public String getNewValue() {
        return this.NewValue;
    }

    @JsonProperty("NewValue")
    public void setNewValue(String NewValue) {
        this.NewValue = NewValue;
    }

}
