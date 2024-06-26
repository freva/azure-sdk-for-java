// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The VirtualHardDiskStatusProvisioningStatus model. */
@Fluent
public final class VirtualHardDiskStatusProvisioningStatus {
    /*
     * The ID of the operation performed on the virtual hard disk
     */
    @JsonProperty(value = "operationId")
    private String operationId;

    /*
     * The status of the operation performed on the virtual hard disk [Succeeded, Failed, InProgress]
     */
    @JsonProperty(value = "status")
    private Status status;

    /** Creates an instance of VirtualHardDiskStatusProvisioningStatus class. */
    public VirtualHardDiskStatusProvisioningStatus() {
    }

    /**
     * Get the operationId property: The ID of the operation performed on the virtual hard disk.
     *
     * @return the operationId value.
     */
    public String operationId() {
        return this.operationId;
    }

    /**
     * Set the operationId property: The ID of the operation performed on the virtual hard disk.
     *
     * @param operationId the operationId value to set.
     * @return the VirtualHardDiskStatusProvisioningStatus object itself.
     */
    public VirtualHardDiskStatusProvisioningStatus withOperationId(String operationId) {
        this.operationId = operationId;
        return this;
    }

    /**
     * Get the status property: The status of the operation performed on the virtual hard disk [Succeeded, Failed,
     * InProgress].
     *
     * @return the status value.
     */
    public Status status() {
        return this.status;
    }

    /**
     * Set the status property: The status of the operation performed on the virtual hard disk [Succeeded, Failed,
     * InProgress].
     *
     * @param status the status value to set.
     * @return the VirtualHardDiskStatusProvisioningStatus object itself.
     */
    public VirtualHardDiskStatusProvisioningStatus withStatus(Status status) {
        this.status = status;
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
