// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Time and capacity request parameters. */
@Fluent
public final class AutoscaleTimeAndCapacity {
    /*
     * 24-hour time in the form xx:xx
     */
    @JsonProperty(value = "time")
    private String time;

    /*
     * The minimum instance count of the cluster
     */
    @JsonProperty(value = "minInstanceCount")
    private Integer minInstanceCount;

    /*
     * The maximum instance count of the cluster
     */
    @JsonProperty(value = "maxInstanceCount")
    private Integer maxInstanceCount;

    /** Creates an instance of AutoscaleTimeAndCapacity class. */
    public AutoscaleTimeAndCapacity() {
    }

    /**
     * Get the time property: 24-hour time in the form xx:xx.
     *
     * @return the time value.
     */
    public String time() {
        return this.time;
    }

    /**
     * Set the time property: 24-hour time in the form xx:xx.
     *
     * @param time the time value to set.
     * @return the AutoscaleTimeAndCapacity object itself.
     */
    public AutoscaleTimeAndCapacity withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * Get the minInstanceCount property: The minimum instance count of the cluster.
     *
     * @return the minInstanceCount value.
     */
    public Integer minInstanceCount() {
        return this.minInstanceCount;
    }

    /**
     * Set the minInstanceCount property: The minimum instance count of the cluster.
     *
     * @param minInstanceCount the minInstanceCount value to set.
     * @return the AutoscaleTimeAndCapacity object itself.
     */
    public AutoscaleTimeAndCapacity withMinInstanceCount(Integer minInstanceCount) {
        this.minInstanceCount = minInstanceCount;
        return this;
    }

    /**
     * Get the maxInstanceCount property: The maximum instance count of the cluster.
     *
     * @return the maxInstanceCount value.
     */
    public Integer maxInstanceCount() {
        return this.maxInstanceCount;
    }

    /**
     * Set the maxInstanceCount property: The maximum instance count of the cluster.
     *
     * @param maxInstanceCount the maxInstanceCount value to set.
     * @return the AutoscaleTimeAndCapacity object itself.
     */
    public AutoscaleTimeAndCapacity withMaxInstanceCount(Integer maxInstanceCount) {
        this.maxInstanceCount = maxInstanceCount;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
