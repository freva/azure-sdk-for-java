// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SelectiveKeyRestoreOperationParameters model. */
@Fluent
public final class SelectiveKeyRestoreOperationParameters {
    /*
     * The sasTokenParameters property.
     */
    @JsonProperty(value = "sasTokenParameters", required = true)
    private SASTokenParameter sasTokenParameters;

    /*
     * The Folder name of the blob where the previous successful full backup was stored
     */
    @JsonProperty(value = "folder", required = true)
    private String folder;

    /** Creates an instance of SelectiveKeyRestoreOperationParameters class. */
    public SelectiveKeyRestoreOperationParameters() {}

    /**
     * Get the sasTokenParameters property: The sasTokenParameters property.
     *
     * @return the sasTokenParameters value.
     */
    public SASTokenParameter getSasTokenParameters() {
        return this.sasTokenParameters;
    }

    /**
     * Set the sasTokenParameters property: The sasTokenParameters property.
     *
     * @param sasTokenParameters the sasTokenParameters value to set.
     * @return the SelectiveKeyRestoreOperationParameters object itself.
     */
    public SelectiveKeyRestoreOperationParameters setSasTokenParameters(SASTokenParameter sasTokenParameters) {
        this.sasTokenParameters = sasTokenParameters;
        return this;
    }

    /**
     * Get the folder property: The Folder name of the blob where the previous successful full backup was stored.
     *
     * @return the folder value.
     */
    public String getFolder() {
        return this.folder;
    }

    /**
     * Set the folder property: The Folder name of the blob where the previous successful full backup was stored.
     *
     * @param folder the folder value to set.
     * @return the SelectiveKeyRestoreOperationParameters object itself.
     */
    public SelectiveKeyRestoreOperationParameters setFolder(String folder) {
        this.folder = folder;
        return this;
    }
}
