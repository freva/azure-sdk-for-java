// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of all MDE onboarding data resources. */
@Fluent
public final class MdeOnboardingDataListInner {
    /*
     * List of the resources of the configuration or data needed to onboard the machine to MDE
     */
    @JsonProperty(value = "value")
    private List<MdeOnboardingDataInner> value;

    /**
     * Get the value property: List of the resources of the configuration or data needed to onboard the machine to MDE.
     *
     * @return the value value.
     */
    public List<MdeOnboardingDataInner> value() {
        return this.value;
    }

    /**
     * Set the value property: List of the resources of the configuration or data needed to onboard the machine to MDE.
     *
     * @param value the value value to set.
     * @return the MdeOnboardingDataListInner object itself.
     */
    public MdeOnboardingDataListInner withValue(List<MdeOnboardingDataInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}