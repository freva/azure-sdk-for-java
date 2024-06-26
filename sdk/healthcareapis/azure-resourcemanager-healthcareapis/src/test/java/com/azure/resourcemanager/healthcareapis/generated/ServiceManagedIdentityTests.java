// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.healthcareapis.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.healthcareapis.models.ServiceManagedIdentity;
import com.azure.resourcemanager.healthcareapis.models.ServiceManagedIdentityIdentity;
import com.azure.resourcemanager.healthcareapis.models.ServiceManagedIdentityType;
import com.azure.resourcemanager.healthcareapis.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ServiceManagedIdentityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ServiceManagedIdentity model = BinaryData.fromString(
            "{\"identity\":{\"type\":\"None\",\"principalId\":\"c59b8d35-ac7b-40e5-a236-d9fae11ad60f\",\"tenantId\":\"e382ebb8-46e2-45f3-a35a-6096a07dfc81\",\"userAssignedIdentities\":{\"pvecxgodeb\":{\"principalId\":\"54d55307-b09f-47c2-b786-7f663349531e\",\"clientId\":\"245c1057-5157-45cb-b1d3-a57076b9203b\"}}}}")
            .toObject(ServiceManagedIdentity.class);
        Assertions.assertEquals(ServiceManagedIdentityType.NONE, model.identity().type());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ServiceManagedIdentity model = new ServiceManagedIdentity()
            .withIdentity(new ServiceManagedIdentityIdentity().withType(ServiceManagedIdentityType.NONE)
                .withUserAssignedIdentities(mapOf("pvecxgodeb", new UserAssignedIdentity())));
        model = BinaryData.fromObject(model).toObject(ServiceManagedIdentity.class);
        Assertions.assertEquals(ServiceManagedIdentityType.NONE, model.identity().type());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
