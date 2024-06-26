// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.maps.search.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the fuzzySearchBatch operation. */
public final class SearchesFuzzySearchBatchResponse
        extends ResponseBase<SearchesFuzzySearchBatchHeaders, SearchAddressBatchResult> {
    /**
     * Creates an instance of SearchesFuzzySearchBatchResponse.
     *
     * @param request the request which resulted in this SearchesFuzzySearchBatchResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public SearchesFuzzySearchBatchResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            SearchAddressBatchResult value,
            SearchesFuzzySearchBatchHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     *
     * @return the deserialized response body.
     */
    @Override
    public SearchAddressBatchResult getValue() {
        return super.getValue();
    }
}
