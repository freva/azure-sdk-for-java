// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.automation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Definition of schedule parameters. */
@Fluent
public final class SucScheduleProperties {
    /*
     * Gets or sets the start time of the schedule.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * Gets the start time's offset in minutes.
     */
    @JsonProperty(value = "startTimeOffsetMinutes", access = JsonProperty.Access.WRITE_ONLY)
    private Double startTimeOffsetMinutes;

    /*
     * Gets or sets the end time of the schedule.
     */
    @JsonProperty(value = "expiryTime")
    private OffsetDateTime expiryTime;

    /*
     * Gets or sets the expiry time's offset in minutes.
     */
    @JsonProperty(value = "expiryTimeOffsetMinutes")
    private Double expiryTimeOffsetMinutes;

    /*
     * Gets or sets a value indicating whether this schedule is enabled.
     */
    @JsonProperty(value = "isEnabled")
    private Boolean isEnabled;

    /*
     * Gets or sets the next run time of the schedule.
     */
    @JsonProperty(value = "nextRun")
    private OffsetDateTime nextRun;

    /*
     * Gets or sets the next run time's offset in minutes.
     */
    @JsonProperty(value = "nextRunOffsetMinutes")
    private Double nextRunOffsetMinutes;

    /*
     * Gets or sets the interval of the schedule.
     */
    @JsonProperty(value = "interval")
    private Long interval;

    /*
     * Gets or sets the frequency of the schedule.
     */
    @JsonProperty(value = "frequency")
    private ScheduleFrequency frequency;

    /*
     * Gets or sets the time zone of the schedule.
     */
    @JsonProperty(value = "timeZone")
    private String timeZone;

    /*
     * Gets or sets the advanced schedule.
     */
    @JsonProperty(value = "advancedSchedule")
    private AdvancedSchedule advancedSchedule;

    /*
     * Gets or sets the creation time.
     */
    @JsonProperty(value = "creationTime")
    private OffsetDateTime creationTime;

    /*
     * Gets or sets the last modified time.
     */
    @JsonProperty(value = "lastModifiedTime")
    private OffsetDateTime lastModifiedTime;

    /*
     * Gets or sets the description.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Get the startTime property: Gets or sets the start time of the schedule.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Gets or sets the start time of the schedule.
     *
     * @param startTime the startTime value to set.
     * @return the SucScheduleProperties object itself.
     */
    public SucScheduleProperties withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the startTimeOffsetMinutes property: Gets the start time's offset in minutes.
     *
     * @return the startTimeOffsetMinutes value.
     */
    public Double startTimeOffsetMinutes() {
        return this.startTimeOffsetMinutes;
    }

    /**
     * Get the expiryTime property: Gets or sets the end time of the schedule.
     *
     * @return the expiryTime value.
     */
    public OffsetDateTime expiryTime() {
        return this.expiryTime;
    }

    /**
     * Set the expiryTime property: Gets or sets the end time of the schedule.
     *
     * @param expiryTime the expiryTime value to set.
     * @return the SucScheduleProperties object itself.
     */
    public SucScheduleProperties withExpiryTime(OffsetDateTime expiryTime) {
        this.expiryTime = expiryTime;
        return this;
    }

    /**
     * Get the expiryTimeOffsetMinutes property: Gets or sets the expiry time's offset in minutes.
     *
     * @return the expiryTimeOffsetMinutes value.
     */
    public Double expiryTimeOffsetMinutes() {
        return this.expiryTimeOffsetMinutes;
    }

    /**
     * Set the expiryTimeOffsetMinutes property: Gets or sets the expiry time's offset in minutes.
     *
     * @param expiryTimeOffsetMinutes the expiryTimeOffsetMinutes value to set.
     * @return the SucScheduleProperties object itself.
     */
    public SucScheduleProperties withExpiryTimeOffsetMinutes(Double expiryTimeOffsetMinutes) {
        this.expiryTimeOffsetMinutes = expiryTimeOffsetMinutes;
        return this;
    }

    /**
     * Get the isEnabled property: Gets or sets a value indicating whether this schedule is enabled.
     *
     * @return the isEnabled value.
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }

    /**
     * Set the isEnabled property: Gets or sets a value indicating whether this schedule is enabled.
     *
     * @param isEnabled the isEnabled value to set.
     * @return the SucScheduleProperties object itself.
     */
    public SucScheduleProperties withIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

    /**
     * Get the nextRun property: Gets or sets the next run time of the schedule.
     *
     * @return the nextRun value.
     */
    public OffsetDateTime nextRun() {
        return this.nextRun;
    }

    /**
     * Set the nextRun property: Gets or sets the next run time of the schedule.
     *
     * @param nextRun the nextRun value to set.
     * @return the SucScheduleProperties object itself.
     */
    public SucScheduleProperties withNextRun(OffsetDateTime nextRun) {
        this.nextRun = nextRun;
        return this;
    }

    /**
     * Get the nextRunOffsetMinutes property: Gets or sets the next run time's offset in minutes.
     *
     * @return the nextRunOffsetMinutes value.
     */
    public Double nextRunOffsetMinutes() {
        return this.nextRunOffsetMinutes;
    }

    /**
     * Set the nextRunOffsetMinutes property: Gets or sets the next run time's offset in minutes.
     *
     * @param nextRunOffsetMinutes the nextRunOffsetMinutes value to set.
     * @return the SucScheduleProperties object itself.
     */
    public SucScheduleProperties withNextRunOffsetMinutes(Double nextRunOffsetMinutes) {
        this.nextRunOffsetMinutes = nextRunOffsetMinutes;
        return this;
    }

    /**
     * Get the interval property: Gets or sets the interval of the schedule.
     *
     * @return the interval value.
     */
    public Long interval() {
        return this.interval;
    }

    /**
     * Set the interval property: Gets or sets the interval of the schedule.
     *
     * @param interval the interval value to set.
     * @return the SucScheduleProperties object itself.
     */
    public SucScheduleProperties withInterval(Long interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the frequency property: Gets or sets the frequency of the schedule.
     *
     * @return the frequency value.
     */
    public ScheduleFrequency frequency() {
        return this.frequency;
    }

    /**
     * Set the frequency property: Gets or sets the frequency of the schedule.
     *
     * @param frequency the frequency value to set.
     * @return the SucScheduleProperties object itself.
     */
    public SucScheduleProperties withFrequency(ScheduleFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get the timeZone property: Gets or sets the time zone of the schedule.
     *
     * @return the timeZone value.
     */
    public String timeZone() {
        return this.timeZone;
    }

    /**
     * Set the timeZone property: Gets or sets the time zone of the schedule.
     *
     * @param timeZone the timeZone value to set.
     * @return the SucScheduleProperties object itself.
     */
    public SucScheduleProperties withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Get the advancedSchedule property: Gets or sets the advanced schedule.
     *
     * @return the advancedSchedule value.
     */
    public AdvancedSchedule advancedSchedule() {
        return this.advancedSchedule;
    }

    /**
     * Set the advancedSchedule property: Gets or sets the advanced schedule.
     *
     * @param advancedSchedule the advancedSchedule value to set.
     * @return the SucScheduleProperties object itself.
     */
    public SucScheduleProperties withAdvancedSchedule(AdvancedSchedule advancedSchedule) {
        this.advancedSchedule = advancedSchedule;
        return this;
    }

    /**
     * Get the creationTime property: Gets or sets the creation time.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime creationTime() {
        return this.creationTime;
    }

    /**
     * Set the creationTime property: Gets or sets the creation time.
     *
     * @param creationTime the creationTime value to set.
     * @return the SucScheduleProperties object itself.
     */
    public SucScheduleProperties withCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the lastModifiedTime property: Gets or sets the last modified time.
     *
     * @return the lastModifiedTime value.
     */
    public OffsetDateTime lastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * Set the lastModifiedTime property: Gets or sets the last modified time.
     *
     * @param lastModifiedTime the lastModifiedTime value to set.
     * @return the SucScheduleProperties object itself.
     */
    public SucScheduleProperties withLastModifiedTime(OffsetDateTime lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    /**
     * Get the description property: Gets or sets the description.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: Gets or sets the description.
     *
     * @param description the description value to set.
     * @return the SucScheduleProperties object itself.
     */
    public SucScheduleProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (advancedSchedule() != null) {
            advancedSchedule().validate();
        }
    }
}
