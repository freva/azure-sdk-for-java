// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.phonenumbers.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the getOperation operation. */
public final class PhoneNumbersGetOperationResponse
        extends ResponseBase<PhoneNumbersGetOperationHeaders, PhoneNumberRawOperation> {
    /**
     * Creates an instance of PhoneNumbersGetOperationResponse.
     *
     * @param request the request which resulted in this PhoneNumbersGetOperationResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public PhoneNumbersGetOperationResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            PhoneNumberRawOperation value,
            PhoneNumbersGetOperationHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /**
     * Gets the deserialized response body.
     *
     * @return the deserialized response body.
     */
    @Override
    public PhoneNumberRawOperation getValue() {
        return super.getValue();
    }
}
