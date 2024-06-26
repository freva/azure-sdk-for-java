// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.resourcemanager.support.fluent.models.ProblemClassificationsClassificationOutputInner;
import java.util.List;

/**
 * An immutable client-side representation of ProblemClassificationsClassificationOutput.
 */
public interface ProblemClassificationsClassificationOutput {
    /**
     * Gets the problemClassificationResults property: Set of problem classification objects classified.
     * 
     * @return the problemClassificationResults value.
     */
    List<ProblemClassificationsClassificationResult> problemClassificationResults();

    /**
     * Gets the inner com.azure.resourcemanager.support.fluent.models.ProblemClassificationsClassificationOutputInner
     * object.
     * 
     * @return the inner object.
     */
    ProblemClassificationsClassificationOutputInner innerModel();
}
