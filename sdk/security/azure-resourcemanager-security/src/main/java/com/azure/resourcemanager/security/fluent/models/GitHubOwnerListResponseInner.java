// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * List of RP resources which supports pagination.
 */
@Fluent
public final class GitHubOwnerListResponseInner {
    /*
     * Gets or sets list of resources.
     */
    @JsonProperty(value = "value")
    private List<GitHubOwnerInner> value;

    /*
     * Gets or sets next link to scroll over the results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Creates an instance of GitHubOwnerListResponseInner class.
     */
    public GitHubOwnerListResponseInner() {
    }

    /**
     * Get the value property: Gets or sets list of resources.
     * 
     * @return the value value.
     */
    public List<GitHubOwnerInner> value() {
        return this.value;
    }

    /**
     * Set the value property: Gets or sets list of resources.
     * 
     * @param value the value value to set.
     * @return the GitHubOwnerListResponseInner object itself.
     */
    public GitHubOwnerListResponseInner withValue(List<GitHubOwnerInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: Gets or sets next link to scroll over the results.
     * 
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: Gets or sets next link to scroll over the results.
     * 
     * @param nextLink the nextLink value to set.
     * @return the GitHubOwnerListResponseInner object itself.
     */
    public GitHubOwnerListResponseInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
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
