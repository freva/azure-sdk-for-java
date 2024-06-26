// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Output for connect to Oracle, MySQL type source. */
@Immutable
public final class ConnectToSourceNonSqlTaskOutput {
    /*
     * Result identifier
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Server brand version
     */
    @JsonProperty(value = "sourceServerBrandVersion", access = JsonProperty.Access.WRITE_ONLY)
    private String sourceServerBrandVersion;

    /*
     * Server properties
     */
    @JsonProperty(value = "serverProperties", access = JsonProperty.Access.WRITE_ONLY)
    private ServerProperties serverProperties;

    /*
     * List of databases on the server
     */
    @JsonProperty(value = "databases", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> databases;

    /*
     * Validation errors associated with the task
     */
    @JsonProperty(value = "validationErrors", access = JsonProperty.Access.WRITE_ONLY)
    private List<ReportableException> validationErrors;

    /** Creates an instance of ConnectToSourceNonSqlTaskOutput class. */
    public ConnectToSourceNonSqlTaskOutput() {
    }

    /**
     * Get the id property: Result identifier.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the sourceServerBrandVersion property: Server brand version.
     *
     * @return the sourceServerBrandVersion value.
     */
    public String sourceServerBrandVersion() {
        return this.sourceServerBrandVersion;
    }

    /**
     * Get the serverProperties property: Server properties.
     *
     * @return the serverProperties value.
     */
    public ServerProperties serverProperties() {
        return this.serverProperties;
    }

    /**
     * Get the databases property: List of databases on the server.
     *
     * @return the databases value.
     */
    public List<String> databases() {
        return this.databases;
    }

    /**
     * Get the validationErrors property: Validation errors associated with the task.
     *
     * @return the validationErrors value.
     */
    public List<ReportableException> validationErrors() {
        return this.validationErrors;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (serverProperties() != null) {
            serverProperties().validate();
        }
        if (validationErrors() != null) {
            validationErrors().forEach(e -> e.validate());
        }
    }
}
