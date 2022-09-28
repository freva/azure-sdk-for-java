// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.securityinsights.models.FileImportContentType;
import com.azure.resourcemanager.securityinsights.models.FileImportState;
import com.azure.resourcemanager.securityinsights.models.FileMetadata;
import com.azure.resourcemanager.securityinsights.models.IngestionMode;
import com.azure.resourcemanager.securityinsights.models.ValidationError;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Describes the FileImport's properties. */
@Fluent
public final class FileImportProperties {
    /*
     * Describes how to ingest the records in the file.
     */
    @JsonProperty(value = "ingestionMode", required = true)
    private IngestionMode ingestionMode;

    /*
     * The content type of this file.
     */
    @JsonProperty(value = "contentType", required = true)
    private FileImportContentType contentType;

    /*
     * The time the file was imported.
     */
    @JsonProperty(value = "createdTimeUTC", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime createdTimeUtc;

    /*
     * Represents the error file (if the import was ingested with errors or failed the validation).
     */
    @JsonProperty(value = "errorFile", access = JsonProperty.Access.WRITE_ONLY)
    private FileMetadata errorFile;

    /*
     * An ordered list of some of the errors that were encountered during validation.
     */
    @JsonProperty(value = "errorsPreview", access = JsonProperty.Access.WRITE_ONLY)
    private List<ValidationError> errorsPreview;

    /*
     * Represents the imported file.
     */
    @JsonProperty(value = "importFile", required = true)
    private FileMetadata importFile;

    /*
     * The number of records that have been successfully ingested.
     */
    @JsonProperty(value = "ingestedRecordCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer ingestedRecordCount;

    /*
     * The source for the data in the file.
     */
    @JsonProperty(value = "source", required = true)
    private String source;

    /*
     * The state of the file import.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private FileImportState state;

    /*
     * The number of records in the file.
     */
    @JsonProperty(value = "totalRecordCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer totalRecordCount;

    /*
     * The number of records that have passed validation.
     */
    @JsonProperty(value = "validRecordCount", access = JsonProperty.Access.WRITE_ONLY)
    private Integer validRecordCount;

    /*
     * The time the files associated with this import are deleted from the storage account.
     */
    @JsonProperty(value = "filesValidUntilTimeUTC", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime filesValidUntilTimeUtc;

    /*
     * The time the file import record is soft deleted from the database and history.
     */
    @JsonProperty(value = "importValidUntilTimeUTC", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime importValidUntilTimeUtc;

    /**
     * Get the ingestionMode property: Describes how to ingest the records in the file.
     *
     * @return the ingestionMode value.
     */
    public IngestionMode ingestionMode() {
        return this.ingestionMode;
    }

    /**
     * Set the ingestionMode property: Describes how to ingest the records in the file.
     *
     * @param ingestionMode the ingestionMode value to set.
     * @return the FileImportProperties object itself.
     */
    public FileImportProperties withIngestionMode(IngestionMode ingestionMode) {
        this.ingestionMode = ingestionMode;
        return this;
    }

    /**
     * Get the contentType property: The content type of this file.
     *
     * @return the contentType value.
     */
    public FileImportContentType contentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The content type of this file.
     *
     * @param contentType the contentType value to set.
     * @return the FileImportProperties object itself.
     */
    public FileImportProperties withContentType(FileImportContentType contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the createdTimeUtc property: The time the file was imported.
     *
     * @return the createdTimeUtc value.
     */
    public OffsetDateTime createdTimeUtc() {
        return this.createdTimeUtc;
    }

    /**
     * Get the errorFile property: Represents the error file (if the import was ingested with errors or failed the
     * validation).
     *
     * @return the errorFile value.
     */
    public FileMetadata errorFile() {
        return this.errorFile;
    }

    /**
     * Get the errorsPreview property: An ordered list of some of the errors that were encountered during validation.
     *
     * @return the errorsPreview value.
     */
    public List<ValidationError> errorsPreview() {
        return this.errorsPreview;
    }

    /**
     * Get the importFile property: Represents the imported file.
     *
     * @return the importFile value.
     */
    public FileMetadata importFile() {
        return this.importFile;
    }

    /**
     * Set the importFile property: Represents the imported file.
     *
     * @param importFile the importFile value to set.
     * @return the FileImportProperties object itself.
     */
    public FileImportProperties withImportFile(FileMetadata importFile) {
        this.importFile = importFile;
        return this;
    }

    /**
     * Get the ingestedRecordCount property: The number of records that have been successfully ingested.
     *
     * @return the ingestedRecordCount value.
     */
    public Integer ingestedRecordCount() {
        return this.ingestedRecordCount;
    }

    /**
     * Get the source property: The source for the data in the file.
     *
     * @return the source value.
     */
    public String source() {
        return this.source;
    }

    /**
     * Set the source property: The source for the data in the file.
     *
     * @param source the source value to set.
     * @return the FileImportProperties object itself.
     */
    public FileImportProperties withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * Get the state property: The state of the file import.
     *
     * @return the state value.
     */
    public FileImportState state() {
        return this.state;
    }

    /**
     * Get the totalRecordCount property: The number of records in the file.
     *
     * @return the totalRecordCount value.
     */
    public Integer totalRecordCount() {
        return this.totalRecordCount;
    }

    /**
     * Get the validRecordCount property: The number of records that have passed validation.
     *
     * @return the validRecordCount value.
     */
    public Integer validRecordCount() {
        return this.validRecordCount;
    }

    /**
     * Get the filesValidUntilTimeUtc property: The time the files associated with this import are deleted from the
     * storage account.
     *
     * @return the filesValidUntilTimeUtc value.
     */
    public OffsetDateTime filesValidUntilTimeUtc() {
        return this.filesValidUntilTimeUtc;
    }

    /**
     * Get the importValidUntilTimeUtc property: The time the file import record is soft deleted from the database and
     * history.
     *
     * @return the importValidUntilTimeUtc value.
     */
    public OffsetDateTime importValidUntilTimeUtc() {
        return this.importValidUntilTimeUtc;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (ingestionMode() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property ingestionMode in model FileImportProperties"));
        }
        if (contentType() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property contentType in model FileImportProperties"));
        }
        if (errorFile() != null) {
            errorFile().validate();
        }
        if (errorsPreview() != null) {
            errorsPreview().forEach(e -> e.validate());
        }
        if (importFile() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property importFile in model FileImportProperties"));
        } else {
            importFile().validate();
        }
        if (source() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property source in model FileImportProperties"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FileImportProperties.class);
}