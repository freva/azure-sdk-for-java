// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.weather.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The HourlyForecastResult model. */
@Immutable
public final class HourlyForecastResult {
    /*
     * Forecast data for each returned hour.
     */
    @JsonProperty(value = "forecasts", access = JsonProperty.Access.WRITE_ONLY)
    private List<HourlyForecast> forecasts;

    /** Set default HourlyForecastResult constructor to private */
    private HourlyForecastResult() {}

    /**
     * Get the forecasts property: Forecast data for each returned hour.
     *
     * @return the forecasts value.
     */
    public List<HourlyForecast> getForecasts() {
        return this.forecasts;
    }
}
