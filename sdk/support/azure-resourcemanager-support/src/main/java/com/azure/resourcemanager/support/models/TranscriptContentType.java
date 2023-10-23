// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Content type. */
public final class TranscriptContentType extends ExpandableStringEnum<TranscriptContentType> {
    /**
     * Creates a new instance of TranscriptContentType value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public TranscriptContentType() {
    }

    /**
     * Creates or finds a TranscriptContentType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TranscriptContentType.
     */
    @JsonCreator
    public static TranscriptContentType fromString(String name) {
        return fromString(name, TranscriptContentType.class);
    }

    /**
     * Gets known TranscriptContentType values.
     *
     * @return known TranscriptContentType values.
     */
    public static Collection<TranscriptContentType> values() {
        return values(TranscriptContentType.class);
    }
}
