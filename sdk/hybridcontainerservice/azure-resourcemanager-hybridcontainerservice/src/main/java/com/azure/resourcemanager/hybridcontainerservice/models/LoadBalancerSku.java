// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * LoadBalancerSku - The load balancer sku for the provisioned cluster. Possible values: 'unstacked-haproxy',
 * 'stacked-kube-vip', 'stacked-metallb', 'unmanaged'. The default is 'unmanaged'.
 */
public final class LoadBalancerSku extends ExpandableStringEnum<LoadBalancerSku> {
    /** Static value unstacked-haproxy for LoadBalancerSku. */
    public static final LoadBalancerSku UNSTACKED_HAPROXY = fromString("unstacked-haproxy");

    /** Static value stacked-kube-vip for LoadBalancerSku. */
    public static final LoadBalancerSku STACKED_KUBE_VIP = fromString("stacked-kube-vip");

    /** Static value stacked-metallb for LoadBalancerSku. */
    public static final LoadBalancerSku STACKED_METALLB = fromString("stacked-metallb");

    /** Static value unmanaged for LoadBalancerSku. */
    public static final LoadBalancerSku UNMANAGED = fromString("unmanaged");

    /**
     * Creates or finds a LoadBalancerSku from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding LoadBalancerSku.
     */
    @JsonCreator
    public static LoadBalancerSku fromString(String name) {
        return fromString(name, LoadBalancerSku.class);
    }

    /**
     * Gets known LoadBalancerSku values.
     *
     * @return known LoadBalancerSku values.
     */
    public static Collection<LoadBalancerSku> values() {
        return values(LoadBalancerSku.class);
    }
}