// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkanalytics.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.networkanalytics.fluent.models.DataProductInner;
import com.azure.resourcemanager.networkanalytics.fluent.models.RoleAssignmentDetailInner;
import java.util.Map;

/**
 * An immutable client-side representation of DataProduct.
 */
public interface DataProduct {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     * 
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     * 
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the properties property: The resource-specific properties for this resource.
     * 
     * @return the properties value.
     */
    DataProductProperties properties();

    /**
     * Gets the identity property: The managed service identities assigned to this resource.
     * 
     * @return the identity value.
     */
    ManagedServiceIdentity identity();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the region of the resource.
     * 
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     * 
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     * 
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.networkanalytics.fluent.models.DataProductInner object.
     * 
     * @return the inner object.
     */
    DataProductInner innerModel();

    /**
     * The entirety of the DataProduct definition.
     */
    interface Definition extends DefinitionStages.Blank, DefinitionStages.WithLocation,
        DefinitionStages.WithResourceGroup, DefinitionStages.WithCreate {
    }

    /**
     * The DataProduct definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the DataProduct definition.
         */
        interface Blank extends WithLocation {
        }

        /**
         * The stage of the DataProduct definition allowing to specify location.
         */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             * 
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }

        /**
         * The stage of the DataProduct definition allowing to specify parent resource.
         */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             * 
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }

        /**
         * The stage of the DataProduct definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags, DefinitionStages.WithProperties, DefinitionStages.WithIdentity {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            DataProduct create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            DataProduct create(Context context);
        }

        /**
         * The stage of the DataProduct definition allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }

        /**
         * The stage of the DataProduct definition allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The resource-specific properties for this resource..
             * 
             * @param properties The resource-specific properties for this resource.
             * @return the next definition stage.
             */
            WithCreate withProperties(DataProductProperties properties);
        }

        /**
         * The stage of the DataProduct definition allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: The managed service identities assigned to this resource..
             * 
             * @param identity The managed service identities assigned to this resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(ManagedServiceIdentity identity);
        }
    }

    /**
     * Begins update for the DataProduct resource.
     * 
     * @return the stage of resource update.
     */
    DataProduct.Update update();

    /**
     * The template for DataProduct update.
     */
    interface Update extends UpdateStages.WithTags, UpdateStages.WithIdentity, UpdateStages.WithProperties {
        /**
         * Executes the update request.
         * 
         * @return the updated resource.
         */
        DataProduct apply();

        /**
         * Executes the update request.
         * 
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        DataProduct apply(Context context);
    }

    /**
     * The DataProduct update stages.
     */
    interface UpdateStages {
        /**
         * The stage of the DataProduct update allowing to specify tags.
         */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             * 
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }

        /**
         * The stage of the DataProduct update allowing to specify identity.
         */
        interface WithIdentity {
            /**
             * Specifies the identity property: The managed service identities assigned to this resource..
             * 
             * @param identity The managed service identities assigned to this resource.
             * @return the next definition stage.
             */
            Update withIdentity(ManagedServiceIdentity identity);
        }

        /**
         * The stage of the DataProduct update allowing to specify properties.
         */
        interface WithProperties {
            /**
             * Specifies the properties property: The updatable properties of the DataProduct..
             * 
             * @param properties The updatable properties of the DataProduct.
             * @return the next definition stage.
             */
            Update withProperties(DataProductUpdateProperties properties);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    DataProduct refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    DataProduct refresh(Context context);

    /**
     * Assign role to the data product.
     * 
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details for role assignment response along with {@link Response}.
     */
    Response<RoleAssignmentDetail> addUserRoleWithResponse(RoleAssignmentCommonProperties body, Context context);

    /**
     * Assign role to the data product.
     * 
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the details for role assignment response.
     */
    RoleAssignmentDetail addUserRole(RoleAssignmentCommonProperties body);

    /**
     * Generate sas token for storage account.
     * 
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of storage account sas token along with {@link Response}.
     */
    Response<AccountSasToken> generateStorageAccountSasTokenWithResponse(AccountSas body, Context context);

    /**
     * Generate sas token for storage account.
     * 
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return details of storage account sas token.
     */
    AccountSasToken generateStorageAccountSasToken(AccountSas body);

    /**
     * List user roles associated with the data product.
     * 
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list role assignments along with {@link Response}.
     */
    Response<ListRoleAssignments> listRolesAssignmentsWithResponse(Object body, Context context);

    /**
     * List user roles associated with the data product.
     * 
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list role assignments.
     */
    ListRoleAssignments listRolesAssignments(Object body);

    /**
     * Remove role from the data product.
     * 
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> removeUserRoleWithResponse(RoleAssignmentDetailInner body, Context context);

    /**
     * Remove role from the data product.
     * 
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void removeUserRole(RoleAssignmentDetailInner body);

    /**
     * Initiate key rotation on Data Product.
     * 
     * @param body The content of the action request.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> rotateKeyWithResponse(KeyVaultInfo body, Context context);

    /**
     * Initiate key rotation on Data Product.
     * 
     * @param body The content of the action request.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void rotateKey(KeyVaultInfo body);
}
