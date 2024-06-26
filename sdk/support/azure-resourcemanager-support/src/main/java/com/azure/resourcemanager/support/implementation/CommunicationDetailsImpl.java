// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.implementation;

import com.azure.core.util.Context;
import com.azure.resourcemanager.support.fluent.models.CommunicationDetailsInner;
import com.azure.resourcemanager.support.models.CommunicationDetails;
import com.azure.resourcemanager.support.models.CommunicationDirection;
import com.azure.resourcemanager.support.models.CommunicationType;
import java.time.OffsetDateTime;

public final class CommunicationDetailsImpl implements CommunicationDetails, CommunicationDetails.Definition {
    private CommunicationDetailsInner innerObject;

    private final com.azure.resourcemanager.support.SupportManager serviceManager;

    CommunicationDetailsImpl(CommunicationDetailsInner innerObject,
        com.azure.resourcemanager.support.SupportManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public String id() {
        return this.innerModel().id();
    }

    public String name() {
        return this.innerModel().name();
    }

    public String type() {
        return this.innerModel().type();
    }

    public CommunicationType communicationType() {
        return this.innerModel().communicationType();
    }

    public CommunicationDirection communicationDirection() {
        return this.innerModel().communicationDirection();
    }

    public String sender() {
        return this.innerModel().sender();
    }

    public String subject() {
        return this.innerModel().subject();
    }

    public String body() {
        return this.innerModel().body();
    }

    public OffsetDateTime createdDate() {
        return this.innerModel().createdDate();
    }

    public CommunicationDetailsInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.support.SupportManager manager() {
        return this.serviceManager;
    }

    private String supportTicketName;

    private String communicationName;

    public CommunicationDetailsImpl withExistingSupportTicket(String supportTicketName) {
        this.supportTicketName = supportTicketName;
        return this;
    }

    public CommunicationDetails create() {
        this.innerObject = serviceManager.serviceClient().getCommunications().create(supportTicketName,
            communicationName, this.innerModel(), Context.NONE);
        return this;
    }

    public CommunicationDetails create(Context context) {
        this.innerObject = serviceManager.serviceClient().getCommunications().create(supportTicketName,
            communicationName, this.innerModel(), context);
        return this;
    }

    CommunicationDetailsImpl(String name, com.azure.resourcemanager.support.SupportManager serviceManager) {
        this.innerObject = new CommunicationDetailsInner();
        this.serviceManager = serviceManager;
        this.communicationName = name;
    }

    public CommunicationDetails refresh() {
        this.innerObject = serviceManager.serviceClient().getCommunications()
            .getWithResponse(supportTicketName, communicationName, Context.NONE).getValue();
        return this;
    }

    public CommunicationDetails refresh(Context context) {
        this.innerObject = serviceManager.serviceClient().getCommunications()
            .getWithResponse(supportTicketName, communicationName, context).getValue();
        return this;
    }

    public CommunicationDetailsImpl withSender(String sender) {
        this.innerModel().withSender(sender);
        return this;
    }

    public CommunicationDetailsImpl withSubject(String subject) {
        this.innerModel().withSubject(subject);
        return this;
    }

    public CommunicationDetailsImpl withBody(String body) {
        this.innerModel().withBody(body);
        return this;
    }
}
