// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appcontainers.fluent.ManagedEnvironmentUsagesClient;
import com.azure.resourcemanager.appcontainers.fluent.models.UsageInner;
import com.azure.resourcemanager.appcontainers.models.ManagedEnvironmentUsages;
import com.azure.resourcemanager.appcontainers.models.Usage;

public final class ManagedEnvironmentUsagesImpl implements ManagedEnvironmentUsages {
    private static final ClientLogger LOGGER = new ClientLogger(ManagedEnvironmentUsagesImpl.class);

    private final ManagedEnvironmentUsagesClient innerClient;

    private final com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager;

    public ManagedEnvironmentUsagesImpl(ManagedEnvironmentUsagesClient innerClient,
        com.azure.resourcemanager.appcontainers.ContainerAppsApiManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<Usage> list(String resourceGroupName, String environmentName) {
        PagedIterable<UsageInner> inner = this.serviceClient().list(resourceGroupName, environmentName);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new UsageImpl(inner1, this.manager()));
    }

    public PagedIterable<Usage> list(String resourceGroupName, String environmentName, Context context) {
        PagedIterable<UsageInner> inner = this.serviceClient().list(resourceGroupName, environmentName, context);
        return ResourceManagerUtils.mapPage(inner, inner1 -> new UsageImpl(inner1, this.manager()));
    }

    private ManagedEnvironmentUsagesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.appcontainers.ContainerAppsApiManager manager() {
        return this.serviceManager;
    }
}
