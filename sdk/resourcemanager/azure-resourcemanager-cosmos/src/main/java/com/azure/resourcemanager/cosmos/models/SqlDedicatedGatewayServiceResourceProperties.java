// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmos.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;

/** Properties for SqlDedicatedGatewayServiceResource. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "serviceType")
@JsonTypeName("SqlDedicatedGateway")
@Fluent
public final class SqlDedicatedGatewayServiceResourceProperties extends ServiceResourceProperties {
    /*
     * SqlDedicatedGateway endpoint for the service.
     */
    @JsonProperty(value = "sqlDedicatedGatewayEndpoint")
    private String sqlDedicatedGatewayEndpoint;

    /*
     * An array that contains all of the locations for the service.
     */
    @JsonProperty(value = "locations", access = JsonProperty.Access.WRITE_ONLY)
    private List<SqlDedicatedGatewayRegionalServiceResource> locations;

    /** Creates an instance of SqlDedicatedGatewayServiceResourceProperties class. */
    public SqlDedicatedGatewayServiceResourceProperties() {
    }

    /**
     * Get the sqlDedicatedGatewayEndpoint property: SqlDedicatedGateway endpoint for the service.
     *
     * @return the sqlDedicatedGatewayEndpoint value.
     */
    public String sqlDedicatedGatewayEndpoint() {
        return this.sqlDedicatedGatewayEndpoint;
    }

    /**
     * Set the sqlDedicatedGatewayEndpoint property: SqlDedicatedGateway endpoint for the service.
     *
     * @param sqlDedicatedGatewayEndpoint the sqlDedicatedGatewayEndpoint value to set.
     * @return the SqlDedicatedGatewayServiceResourceProperties object itself.
     */
    public SqlDedicatedGatewayServiceResourceProperties withSqlDedicatedGatewayEndpoint(
        String sqlDedicatedGatewayEndpoint) {
        this.sqlDedicatedGatewayEndpoint = sqlDedicatedGatewayEndpoint;
        return this;
    }

    /**
     * Get the locations property: An array that contains all of the locations for the service.
     *
     * @return the locations value.
     */
    public List<SqlDedicatedGatewayRegionalServiceResource> locations() {
        return this.locations;
    }

    /** {@inheritDoc} */
    @Override
    public SqlDedicatedGatewayServiceResourceProperties withInstanceSize(ServiceSize instanceSize) {
        super.withInstanceSize(instanceSize);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SqlDedicatedGatewayServiceResourceProperties withInstanceCount(Integer instanceCount) {
        super.withInstanceCount(instanceCount);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (locations() != null) {
            locations().forEach(e -> e.validate());
        }
    }
}
