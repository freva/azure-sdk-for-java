// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.resourcemanager.security.fluent.models.RegulatoryComplianceStandardInner;

/**
 * An immutable client-side representation of RegulatoryComplianceStandard.
 */
public interface RegulatoryComplianceStandard {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the state property: Aggregative state based on the standard's supported controls states.
     * 
     * @return the state value.
     */
    State state();

    /**
     * Gets the passedControls property: The number of supported regulatory compliance controls of the given standard
     * with a passed state.
     * 
     * @return the passedControls value.
     */
    Integer passedControls();

    /**
     * Gets the failedControls property: The number of supported regulatory compliance controls of the given standard
     * with a failed state.
     * 
     * @return the failedControls value.
     */
    Integer failedControls();

    /**
     * Gets the skippedControls property: The number of supported regulatory compliance controls of the given standard
     * with a skipped state.
     * 
     * @return the skippedControls value.
     */
    Integer skippedControls();

    /**
     * Gets the unsupportedControls property: The number of regulatory compliance controls of the given standard which
     * are unsupported by automated assessments.
     * 
     * @return the unsupportedControls value.
     */
    Integer unsupportedControls();

    /**
     * Gets the inner com.azure.resourcemanager.security.fluent.models.RegulatoryComplianceStandardInner object.
     * 
     * @return the inner object.
     */
    RegulatoryComplianceStandardInner innerModel();
}
