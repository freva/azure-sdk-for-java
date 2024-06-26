// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Virtual disk controller model. */
@Immutable
public final class VirtualDiskController {
    /*
     * Controller's id
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * The display name of Controller
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * dik controller subtype (VMWARE_PARAVIRTUAL, BUS_PARALLEL, LSI_PARALLEL, LSI_SAS)
     */
    @JsonProperty(value = "subType", access = JsonProperty.Access.WRITE_ONLY)
    private String subType;

    /*
     * disk controller type (SCSI)
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /** Creates an instance of VirtualDiskController class. */
    public VirtualDiskController() {
    }

    /**
     * Get the id property: Controller's id.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: The display name of Controller.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the subType property: dik controller subtype (VMWARE_PARAVIRTUAL, BUS_PARALLEL, LSI_PARALLEL, LSI_SAS).
     *
     * @return the subType value.
     */
    public String subType() {
        return this.subType;
    }

    /**
     * Get the type property: disk controller type (SCSI).
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
