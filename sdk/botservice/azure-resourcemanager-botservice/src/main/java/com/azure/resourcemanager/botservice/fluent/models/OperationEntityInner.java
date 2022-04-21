// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.botservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.botservice.models.OperationDisplayInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The operations supported by Bot Service Management. */
@Fluent
public final class OperationEntityInner {
    /*
     * Operation name: {provider}/{resource}/{operation}.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The operation supported by Bot Service Management.
     */
    @JsonProperty(value = "display")
    private OperationDisplayInfo display;

    /*
     * The origin of the operation.
     */
    @JsonProperty(value = "origin")
    private String origin;

    /*
     * Additional properties.
     */
    @JsonProperty(value = "properties")
    private Object properties;

    /**
     * Get the name property: Operation name: {provider}/{resource}/{operation}.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Operation name: {provider}/{resource}/{operation}.
     *
     * @param name the name value to set.
     * @return the OperationEntityInner object itself.
     */
    public OperationEntityInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display property: The operation supported by Bot Service Management.
     *
     * @return the display value.
     */
    public OperationDisplayInfo display() {
        return this.display;
    }

    /**
     * Set the display property: The operation supported by Bot Service Management.
     *
     * @param display the display value to set.
     * @return the OperationEntityInner object itself.
     */
    public OperationEntityInner withDisplay(OperationDisplayInfo display) {
        this.display = display;
        return this;
    }

    /**
     * Get the origin property: The origin of the operation.
     *
     * @return the origin value.
     */
    public String origin() {
        return this.origin;
    }

    /**
     * Set the origin property: The origin of the operation.
     *
     * @param origin the origin value to set.
     * @return the OperationEntityInner object itself.
     */
    public OperationEntityInner withOrigin(String origin) {
        this.origin = origin;
        return this;
    }

    /**
     * Get the properties property: Additional properties.
     *
     * @return the properties value.
     */
    public Object properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Additional properties.
     *
     * @param properties the properties value to set.
     * @return the OperationEntityInner object itself.
     */
    public OperationEntityInner withProperties(Object properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (display() != null) {
            display().validate();
        }
    }
}
