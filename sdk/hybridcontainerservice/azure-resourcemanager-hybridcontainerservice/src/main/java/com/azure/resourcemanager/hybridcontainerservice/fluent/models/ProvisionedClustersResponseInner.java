// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusterIdentity;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClustersResponseExtendedLocation;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClustersResponseProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The provisionedClusters resource definition. */
@Fluent
public final class ProvisionedClustersResponseInner extends Resource {
    /*
     * Identity for the Provisioned cluster.
     */
    @JsonProperty(value = "identity")
    private ProvisionedClusterIdentity identity;

    /*
     * The properties property.
     */
    @JsonProperty(value = "properties")
    private ProvisionedClustersResponseProperties properties;

    /*
     * Metadata pertaining to creation and last modification of the resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /*
     * The extendedLocation property.
     */
    @JsonProperty(value = "extendedLocation")
    private ProvisionedClustersResponseExtendedLocation extendedLocation;

    /** Creates an instance of ProvisionedClustersResponseInner class. */
    public ProvisionedClustersResponseInner() {
    }

    /**
     * Get the identity property: Identity for the Provisioned cluster.
     *
     * @return the identity value.
     */
    public ProvisionedClusterIdentity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: Identity for the Provisioned cluster.
     *
     * @param identity the identity value to set.
     * @return the ProvisionedClustersResponseInner object itself.
     */
    public ProvisionedClustersResponseInner withIdentity(ProvisionedClusterIdentity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the properties property: The properties property.
     *
     * @return the properties value.
     */
    public ProvisionedClustersResponseProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: The properties property.
     *
     * @param properties the properties value to set.
     * @return the ProvisionedClustersResponseInner object itself.
     */
    public ProvisionedClustersResponseInner withProperties(ProvisionedClustersResponseProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Get the systemData property: Metadata pertaining to creation and last modification of the resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the extendedLocation property: The extendedLocation property.
     *
     * @return the extendedLocation value.
     */
    public ProvisionedClustersResponseExtendedLocation extendedLocation() {
        return this.extendedLocation;
    }

    /**
     * Set the extendedLocation property: The extendedLocation property.
     *
     * @param extendedLocation the extendedLocation value to set.
     * @return the ProvisionedClustersResponseInner object itself.
     */
    public ProvisionedClustersResponseInner withExtendedLocation(
        ProvisionedClustersResponseExtendedLocation extendedLocation) {
        this.extendedLocation = extendedLocation;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProvisionedClustersResponseInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public ProvisionedClustersResponseInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identity() != null) {
            identity().validate();
        }
        if (properties() != null) {
            properties().validate();
        }
        if (extendedLocation() != null) {
            extendedLocation().validate();
        }
    }
}