// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.billingbenefits.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeProperties;
import com.azure.resourcemanager.billingbenefits.models.AppliedScopeType;
import com.azure.resourcemanager.billingbenefits.models.BillingPlan;
import com.azure.resourcemanager.billingbenefits.models.Commitment;
import com.azure.resourcemanager.billingbenefits.models.Term;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** The PurchaseRequestProperties model. */
@Fluent
public final class PurchaseRequestProperties {
    /*
     * Friendly name of the savings plan
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * Subscription that will be charged for purchasing the benefit
     */
    @JsonProperty(value = "billingScopeId")
    private String billingScopeId;

    /*
     * Represent benefit term in ISO 8601 format.
     */
    @JsonProperty(value = "term")
    private Term term;

    /*
     * Represents the billing plan in ISO 8601 format. Required only for monthly billing plans.
     */
    @JsonProperty(value = "billingPlan")
    private BillingPlan billingPlan;

    /*
     * Type of the Applied Scope.
     */
    @JsonProperty(value = "appliedScopeType")
    private AppliedScopeType appliedScopeType;

    /*
     * Commitment towards the benefit.
     */
    @JsonProperty(value = "commitment")
    private Commitment commitment;

    /*
     * DateTime of the savings plan starts providing benefit from.
     */
    @JsonProperty(value = "effectiveDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime effectiveDateTime;

    /*
     * Setting this to true will automatically purchase a new benefit on the expiration date time.
     */
    @JsonProperty(value = "renew")
    private Boolean renew;

    /*
     * Properties specific to applied scope type. Not required if not applicable.
     */
    @JsonProperty(value = "appliedScopeProperties")
    private AppliedScopeProperties appliedScopeProperties;

    /** Creates an instance of PurchaseRequestProperties class. */
    public PurchaseRequestProperties() {
    }

    /**
     * Get the displayName property: Friendly name of the savings plan.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: Friendly name of the savings plan.
     *
     * @param displayName the displayName value to set.
     * @return the PurchaseRequestProperties object itself.
     */
    public PurchaseRequestProperties withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the billingScopeId property: Subscription that will be charged for purchasing the benefit.
     *
     * @return the billingScopeId value.
     */
    public String billingScopeId() {
        return this.billingScopeId;
    }

    /**
     * Set the billingScopeId property: Subscription that will be charged for purchasing the benefit.
     *
     * @param billingScopeId the billingScopeId value to set.
     * @return the PurchaseRequestProperties object itself.
     */
    public PurchaseRequestProperties withBillingScopeId(String billingScopeId) {
        this.billingScopeId = billingScopeId;
        return this;
    }

    /**
     * Get the term property: Represent benefit term in ISO 8601 format.
     *
     * @return the term value.
     */
    public Term term() {
        return this.term;
    }

    /**
     * Set the term property: Represent benefit term in ISO 8601 format.
     *
     * @param term the term value to set.
     * @return the PurchaseRequestProperties object itself.
     */
    public PurchaseRequestProperties withTerm(Term term) {
        this.term = term;
        return this;
    }

    /**
     * Get the billingPlan property: Represents the billing plan in ISO 8601 format. Required only for monthly billing
     * plans.
     *
     * @return the billingPlan value.
     */
    public BillingPlan billingPlan() {
        return this.billingPlan;
    }

    /**
     * Set the billingPlan property: Represents the billing plan in ISO 8601 format. Required only for monthly billing
     * plans.
     *
     * @param billingPlan the billingPlan value to set.
     * @return the PurchaseRequestProperties object itself.
     */
    public PurchaseRequestProperties withBillingPlan(BillingPlan billingPlan) {
        this.billingPlan = billingPlan;
        return this;
    }

    /**
     * Get the appliedScopeType property: Type of the Applied Scope.
     *
     * @return the appliedScopeType value.
     */
    public AppliedScopeType appliedScopeType() {
        return this.appliedScopeType;
    }

    /**
     * Set the appliedScopeType property: Type of the Applied Scope.
     *
     * @param appliedScopeType the appliedScopeType value to set.
     * @return the PurchaseRequestProperties object itself.
     */
    public PurchaseRequestProperties withAppliedScopeType(AppliedScopeType appliedScopeType) {
        this.appliedScopeType = appliedScopeType;
        return this;
    }

    /**
     * Get the commitment property: Commitment towards the benefit.
     *
     * @return the commitment value.
     */
    public Commitment commitment() {
        return this.commitment;
    }

    /**
     * Set the commitment property: Commitment towards the benefit.
     *
     * @param commitment the commitment value to set.
     * @return the PurchaseRequestProperties object itself.
     */
    public PurchaseRequestProperties withCommitment(Commitment commitment) {
        this.commitment = commitment;
        return this;
    }

    /**
     * Get the effectiveDateTime property: DateTime of the savings plan starts providing benefit from.
     *
     * @return the effectiveDateTime value.
     */
    public OffsetDateTime effectiveDateTime() {
        return this.effectiveDateTime;
    }

    /**
     * Get the renew property: Setting this to true will automatically purchase a new benefit on the expiration date
     * time.
     *
     * @return the renew value.
     */
    public Boolean renew() {
        return this.renew;
    }

    /**
     * Set the renew property: Setting this to true will automatically purchase a new benefit on the expiration date
     * time.
     *
     * @param renew the renew value to set.
     * @return the PurchaseRequestProperties object itself.
     */
    public PurchaseRequestProperties withRenew(Boolean renew) {
        this.renew = renew;
        return this;
    }

    /**
     * Get the appliedScopeProperties property: Properties specific to applied scope type. Not required if not
     * applicable.
     *
     * @return the appliedScopeProperties value.
     */
    public AppliedScopeProperties appliedScopeProperties() {
        return this.appliedScopeProperties;
    }

    /**
     * Set the appliedScopeProperties property: Properties specific to applied scope type. Not required if not
     * applicable.
     *
     * @param appliedScopeProperties the appliedScopeProperties value to set.
     * @return the PurchaseRequestProperties object itself.
     */
    public PurchaseRequestProperties withAppliedScopeProperties(AppliedScopeProperties appliedScopeProperties) {
        this.appliedScopeProperties = appliedScopeProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (commitment() != null) {
            commitment().validate();
        }
        if (appliedScopeProperties() != null) {
            appliedScopeProperties().validate();
        }
    }
}
