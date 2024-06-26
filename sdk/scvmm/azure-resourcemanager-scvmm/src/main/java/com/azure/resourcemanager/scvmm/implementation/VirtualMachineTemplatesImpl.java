// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.scvmm.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.scvmm.fluent.VirtualMachineTemplatesClient;
import com.azure.resourcemanager.scvmm.fluent.models.VirtualMachineTemplateInner;
import com.azure.resourcemanager.scvmm.models.VirtualMachineTemplate;
import com.azure.resourcemanager.scvmm.models.VirtualMachineTemplates;

public final class VirtualMachineTemplatesImpl implements VirtualMachineTemplates {
    private static final ClientLogger LOGGER = new ClientLogger(VirtualMachineTemplatesImpl.class);

    private final VirtualMachineTemplatesClient innerClient;

    private final com.azure.resourcemanager.scvmm.ScvmmManager serviceManager;

    public VirtualMachineTemplatesImpl(
        VirtualMachineTemplatesClient innerClient, com.azure.resourcemanager.scvmm.ScvmmManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public VirtualMachineTemplate getByResourceGroup(String resourceGroupName, String virtualMachineTemplateName) {
        VirtualMachineTemplateInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, virtualMachineTemplateName);
        if (inner != null) {
            return new VirtualMachineTemplateImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<VirtualMachineTemplate> getByResourceGroupWithResponse(
        String resourceGroupName, String virtualMachineTemplateName, Context context) {
        Response<VirtualMachineTemplateInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, virtualMachineTemplateName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new VirtualMachineTemplateImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public void delete(String resourceGroupName, String virtualMachineTemplateName, Boolean force) {
        this.serviceClient().delete(resourceGroupName, virtualMachineTemplateName, force);
    }

    public void delete(String resourceGroupName, String virtualMachineTemplateName) {
        this.serviceClient().delete(resourceGroupName, virtualMachineTemplateName);
    }

    public void delete(String resourceGroupName, String virtualMachineTemplateName, Boolean force, Context context) {
        this.serviceClient().delete(resourceGroupName, virtualMachineTemplateName, force, context);
    }

    public PagedIterable<VirtualMachineTemplate> listByResourceGroup(String resourceGroupName) {
        PagedIterable<VirtualMachineTemplateInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineTemplateImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineTemplate> listByResourceGroup(String resourceGroupName, Context context) {
        PagedIterable<VirtualMachineTemplateInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, context);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineTemplateImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineTemplate> list() {
        PagedIterable<VirtualMachineTemplateInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new VirtualMachineTemplateImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualMachineTemplate> list(Context context) {
        PagedIterable<VirtualMachineTemplateInner> inner = this.serviceClient().list(context);
        return Utils.mapPage(inner, inner1 -> new VirtualMachineTemplateImpl(inner1, this.manager()));
    }

    public VirtualMachineTemplate getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualMachineTemplateName = Utils.getValueFromIdByName(id, "virtualMachineTemplates");
        if (virtualMachineTemplateName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualMachineTemplates'.",
                                id)));
        }
        return this
            .getByResourceGroupWithResponse(resourceGroupName, virtualMachineTemplateName, Context.NONE)
            .getValue();
    }

    public Response<VirtualMachineTemplate> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualMachineTemplateName = Utils.getValueFromIdByName(id, "virtualMachineTemplates");
        if (virtualMachineTemplateName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualMachineTemplates'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, virtualMachineTemplateName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualMachineTemplateName = Utils.getValueFromIdByName(id, "virtualMachineTemplates");
        if (virtualMachineTemplateName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualMachineTemplates'.",
                                id)));
        }
        Boolean localForce = null;
        this.delete(resourceGroupName, virtualMachineTemplateName, localForce, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Boolean force, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String virtualMachineTemplateName = Utils.getValueFromIdByName(id, "virtualMachineTemplates");
        if (virtualMachineTemplateName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'virtualMachineTemplates'.",
                                id)));
        }
        this.delete(resourceGroupName, virtualMachineTemplateName, force, context);
    }

    private VirtualMachineTemplatesClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.scvmm.ScvmmManager manager() {
        return this.serviceManager;
    }

    public VirtualMachineTemplateImpl define(String name) {
        return new VirtualMachineTemplateImpl(name, this.manager());
    }
}
