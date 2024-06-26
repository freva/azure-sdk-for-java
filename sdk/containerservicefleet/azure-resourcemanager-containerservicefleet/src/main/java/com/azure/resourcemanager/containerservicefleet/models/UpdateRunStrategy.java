// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Defines the update sequence of the clusters via stages and groups.
 *
 * <p>Stages within a run are executed sequentially one after another. Groups within a stage are executed in parallel.
 * Member clusters within a group are updated sequentially one after another.
 *
 * <p>A valid strategy contains no duplicate groups within or across stages.
 */
@Fluent
public final class UpdateRunStrategy {
    /*
     * The list of stages that compose this update run. Min size: 1.
     */
    @JsonProperty(value = "stages", required = true)
    private List<UpdateStage> stages;

    /** Creates an instance of UpdateRunStrategy class. */
    public UpdateRunStrategy() {
    }

    /**
     * Get the stages property: The list of stages that compose this update run. Min size: 1.
     *
     * @return the stages value.
     */
    public List<UpdateStage> stages() {
        return this.stages;
    }

    /**
     * Set the stages property: The list of stages that compose this update run. Min size: 1.
     *
     * @param stages the stages value to set.
     * @return the UpdateRunStrategy object itself.
     */
    public UpdateRunStrategy withStages(List<UpdateStage> stages) {
        this.stages = stages;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (stages() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property stages in model UpdateRunStrategy"));
        } else {
            stages().forEach(e -> e.validate());
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(UpdateRunStrategy.class);
}
