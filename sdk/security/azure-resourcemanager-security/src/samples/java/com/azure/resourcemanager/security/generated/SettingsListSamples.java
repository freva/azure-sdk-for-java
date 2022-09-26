// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.Context;

/** Samples for Settings List. */
public final class SettingsListSamples {
    /*
     * x-ms-original-file: specification/security/resource-manager/Microsoft.Security/stable/2022-05-01/examples/Settings/GetSettings_example.json
     */
    /**
     * Sample code: Get settings of subscription.
     *
     * @param manager Entry point to SecurityManager.
     */
    public static void getSettingsOfSubscription(com.azure.resourcemanager.security.SecurityManager manager) {
        manager.settings().list(Context.NONE);
    }
}