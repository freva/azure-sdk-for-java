// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.notificationhubs.fluent.models.NamespaceProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/**
 * Patch parameter for NamespaceResource.
 */
@Fluent
public final class NamespacePatchParameters {
    /*
     * The Sku description for a namespace
     */
    @JsonProperty(value = "sku")
    private Sku sku;

    /*
     * Represents namespace properties.
     */
    @JsonProperty(value = "properties")
    private NamespaceProperties properties;

    /*
     * Dictionary of <string>
     */
    @JsonProperty(value = "tags")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> tags;

    /**
     * Creates an instance of NamespacePatchParameters class.
     */
    public NamespacePatchParameters() {
    }

    /**
     * Get the sku property: The Sku description for a namespace.
     * 
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: The Sku description for a namespace.
     * 
     * @param sku the sku value to set.
     * @return the NamespacePatchParameters object itself.
     */
    public NamespacePatchParameters withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the properties property: Represents namespace properties.
     * 
     * @return the properties value.
     */
    public NamespaceProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Represents namespace properties.
     * 
     * @param properties the properties value to set.
     * @return the NamespacePatchParameters object itself.
     */
    public NamespacePatchParameters withProperties(NamespaceProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the tags property: Dictionary of &lt;string&gt;.
     * 
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: Dictionary of &lt;string&gt;.
     * 
     * @param tags the tags value to set.
     * @return the NamespacePatchParameters object itself.
     */
    public NamespacePatchParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sku() != null) {
            sku().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
    }
}
