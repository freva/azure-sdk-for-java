// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.servicefabric.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Enumerates the ways that a service can be partitioned.
 */
public final class PartitionScheme extends ExpandableStringEnum<PartitionScheme> {
    /**
     * Static value Invalid for PartitionScheme.
     */
    public static final PartitionScheme INVALID = fromString("Invalid");

    /**
     * Static value Singleton for PartitionScheme.
     */
    public static final PartitionScheme SINGLETON = fromString("Singleton");

    /**
     * Static value UniformInt64Range for PartitionScheme.
     */
    public static final PartitionScheme UNIFORM_INT64RANGE = fromString("UniformInt64Range");

    /**
     * Static value Named for PartitionScheme.
     */
    public static final PartitionScheme NAMED = fromString("Named");

    /**
     * Creates a new instance of PartitionScheme value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public PartitionScheme() {
    }

    /**
     * Creates or finds a PartitionScheme from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding PartitionScheme.
     */
    @JsonCreator
    public static PartitionScheme fromString(String name) {
        return fromString(name, PartitionScheme.class);
    }

    /**
     * Gets known PartitionScheme values.
     * 
     * @return known PartitionScheme values.
     */
    public static Collection<PartitionScheme> values() {
        return values(PartitionScheme.class);
    }
}
