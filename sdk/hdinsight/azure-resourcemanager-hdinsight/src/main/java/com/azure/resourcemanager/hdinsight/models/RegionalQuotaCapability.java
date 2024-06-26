// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The regional quota capacity. */
@Fluent
public final class RegionalQuotaCapability {
    /*
     * The region name.
     */
    @JsonProperty(value = "regionName")
    private String regionName;

    /*
     * The number of cores used in the region.
     */
    @JsonProperty(value = "coresUsed")
    private Long coresUsed;

    /*
     * The number of cores available in the region.
     */
    @JsonProperty(value = "coresAvailable")
    private Long coresAvailable;

    /** Creates an instance of RegionalQuotaCapability class. */
    public RegionalQuotaCapability() {
    }

    /**
     * Get the regionName property: The region name.
     *
     * @return the regionName value.
     */
    public String regionName() {
        return this.regionName;
    }

    /**
     * Set the regionName property: The region name.
     *
     * @param regionName the regionName value to set.
     * @return the RegionalQuotaCapability object itself.
     */
    public RegionalQuotaCapability withRegionName(String regionName) {
        this.regionName = regionName;
        return this;
    }

    /**
     * Get the coresUsed property: The number of cores used in the region.
     *
     * @return the coresUsed value.
     */
    public Long coresUsed() {
        return this.coresUsed;
    }

    /**
     * Set the coresUsed property: The number of cores used in the region.
     *
     * @param coresUsed the coresUsed value to set.
     * @return the RegionalQuotaCapability object itself.
     */
    public RegionalQuotaCapability withCoresUsed(Long coresUsed) {
        this.coresUsed = coresUsed;
        return this;
    }

    /**
     * Get the coresAvailable property: The number of cores available in the region.
     *
     * @return the coresAvailable value.
     */
    public Long coresAvailable() {
        return this.coresAvailable;
    }

    /**
     * Set the coresAvailable property: The number of cores available in the region.
     *
     * @param coresAvailable the coresAvailable value to set.
     * @return the RegionalQuotaCapability object itself.
     */
    public RegionalQuotaCapability withCoresAvailable(Long coresAvailable) {
        this.coresAvailable = coresAvailable;
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
