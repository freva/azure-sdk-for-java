// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** SecurityProfile - Specifies the security settings for the virtual machine instance. */
@Fluent
public final class VirtualMachineInstancePropertiesSecurityProfile {
    /*
     * The enableTPM property.
     */
    @JsonProperty(value = "enableTPM")
    private Boolean enableTpm;

    /*
     * The uefiSettings property.
     */
    @JsonProperty(value = "uefiSettings")
    private VirtualMachineInstancePropertiesSecurityProfileUefiSettings uefiSettings;

    /*
     * Specifies the SecurityType of the virtual machine. EnableTPM and SecureBootEnabled must be set to true for
     * SecurityType to function.
     */
    @JsonProperty(value = "securityType")
    private SecurityTypes securityType;

    /** Creates an instance of VirtualMachineInstancePropertiesSecurityProfile class. */
    public VirtualMachineInstancePropertiesSecurityProfile() {
    }

    /**
     * Get the enableTpm property: The enableTPM property.
     *
     * @return the enableTpm value.
     */
    public Boolean enableTpm() {
        return this.enableTpm;
    }

    /**
     * Set the enableTpm property: The enableTPM property.
     *
     * @param enableTpm the enableTpm value to set.
     * @return the VirtualMachineInstancePropertiesSecurityProfile object itself.
     */
    public VirtualMachineInstancePropertiesSecurityProfile withEnableTpm(Boolean enableTpm) {
        this.enableTpm = enableTpm;
        return this;
    }

    /**
     * Get the uefiSettings property: The uefiSettings property.
     *
     * @return the uefiSettings value.
     */
    public VirtualMachineInstancePropertiesSecurityProfileUefiSettings uefiSettings() {
        return this.uefiSettings;
    }

    /**
     * Set the uefiSettings property: The uefiSettings property.
     *
     * @param uefiSettings the uefiSettings value to set.
     * @return the VirtualMachineInstancePropertiesSecurityProfile object itself.
     */
    public VirtualMachineInstancePropertiesSecurityProfile withUefiSettings(
        VirtualMachineInstancePropertiesSecurityProfileUefiSettings uefiSettings) {
        this.uefiSettings = uefiSettings;
        return this;
    }

    /**
     * Get the securityType property: Specifies the SecurityType of the virtual machine. EnableTPM and SecureBootEnabled
     * must be set to true for SecurityType to function.
     *
     * @return the securityType value.
     */
    public SecurityTypes securityType() {
        return this.securityType;
    }

    /**
     * Set the securityType property: Specifies the SecurityType of the virtual machine. EnableTPM and SecureBootEnabled
     * must be set to true for SecurityType to function.
     *
     * @param securityType the securityType value to set.
     * @return the VirtualMachineInstancePropertiesSecurityProfile object itself.
     */
    public VirtualMachineInstancePropertiesSecurityProfile withSecurityType(SecurityTypes securityType) {
        this.securityType = securityType;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (uefiSettings() != null) {
            uefiSettings().validate();
        }
    }
}
