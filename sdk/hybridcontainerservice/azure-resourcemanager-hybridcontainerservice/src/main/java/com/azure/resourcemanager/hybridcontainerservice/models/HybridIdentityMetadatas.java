// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of HybridIdentityMetadatas. */
public interface HybridIdentityMetadatas {
    /**
     * Get the hybrid identity metadata resource
     *
     * <p>Get the hybrid identity metadata proxy resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param provisionedClustersName Parameter for the name of the provisioned cluster.
     * @param hybridIdentityMetadataResourceName Parameter for the name of the hybrid identity metadata resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the hybrid identity metadata proxy resource along with {@link Response}.
     */
    Response<HybridIdentityMetadata> getWithResponse(
        String resourceGroupName,
        String provisionedClustersName,
        String hybridIdentityMetadataResourceName,
        Context context);

    /**
     * Get the hybrid identity metadata resource
     *
     * <p>Get the hybrid identity metadata proxy resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param provisionedClustersName Parameter for the name of the provisioned cluster.
     * @param hybridIdentityMetadataResourceName Parameter for the name of the hybrid identity metadata resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the hybrid identity metadata proxy resource.
     */
    HybridIdentityMetadata get(
        String resourceGroupName, String provisionedClustersName, String hybridIdentityMetadataResourceName);

    /**
     * Deletes the hybrid identity metadata resource
     *
     * <p>Deletes the hybrid identity metadata proxy resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param provisionedClustersName Parameter for the name of the provisioned cluster.
     * @param hybridIdentityMetadataResourceName Parameter for the name of the hybrid identity metadata resource.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteWithResponse(
        String resourceGroupName,
        String provisionedClustersName,
        String hybridIdentityMetadataResourceName,
        Context context);

    /**
     * Deletes the hybrid identity metadata resource
     *
     * <p>Deletes the hybrid identity metadata proxy resource.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param provisionedClustersName Parameter for the name of the provisioned cluster.
     * @param hybridIdentityMetadataResourceName Parameter for the name of the hybrid identity metadata resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void delete(String resourceGroupName, String provisionedClustersName, String hybridIdentityMetadataResourceName);

    /**
     * Lists the hybrid identity metadata resources in a cluster
     *
     * <p>Lists the hybrid identity metadata proxy resource in a cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param provisionedClustersName Parameter for the name of the provisioned cluster.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of hybridIdentityMetadata as paginated response with {@link PagedIterable}.
     */
    PagedIterable<HybridIdentityMetadata> listByCluster(String resourceGroupName, String provisionedClustersName);

    /**
     * Lists the hybrid identity metadata resources in a cluster
     *
     * <p>Lists the hybrid identity metadata proxy resource in a cluster.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param provisionedClustersName Parameter for the name of the provisioned cluster.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of hybridIdentityMetadata as paginated response with {@link PagedIterable}.
     */
    PagedIterable<HybridIdentityMetadata> listByCluster(
        String resourceGroupName, String provisionedClustersName, Context context);

    /**
     * Get the hybrid identity metadata resource
     *
     * <p>Get the hybrid identity metadata proxy resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the hybrid identity metadata proxy resource along with {@link Response}.
     */
    HybridIdentityMetadata getById(String id);

    /**
     * Get the hybrid identity metadata resource
     *
     * <p>Get the hybrid identity metadata proxy resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the hybrid identity metadata proxy resource along with {@link Response}.
     */
    Response<HybridIdentityMetadata> getByIdWithResponse(String id, Context context);

    /**
     * Deletes the hybrid identity metadata resource
     *
     * <p>Deletes the hybrid identity metadata proxy resource.
     *
     * @param id the resource ID.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void deleteById(String id);

    /**
     * Deletes the hybrid identity metadata resource
     *
     * <p>Deletes the hybrid identity metadata proxy resource.
     *
     * @param id the resource ID.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> deleteByIdWithResponse(String id, Context context);

    /**
     * Begins definition for a new HybridIdentityMetadata resource.
     *
     * @param name resource name.
     * @return the first stage of the new HybridIdentityMetadata definition.
     */
    HybridIdentityMetadata.DefinitionStages.Blank define(String name);
}