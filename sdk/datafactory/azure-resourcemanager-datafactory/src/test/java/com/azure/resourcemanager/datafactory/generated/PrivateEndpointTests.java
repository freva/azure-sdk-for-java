// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.PrivateEndpoint;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class PrivateEndpointTests {
    @Test
    public void testDeserialize() {
        PrivateEndpoint model = BinaryData.fromString("{\"id\":\"jgcyztsfmznba\"}").toObject(PrivateEndpoint.class);
        Assertions.assertEquals("jgcyztsfmznba", model.id());
    }

    @Test
    public void testSerialize() {
        PrivateEndpoint model = new PrivateEndpoint().withId("jgcyztsfmznba");
        model = BinaryData.fromObject(model).toObject(PrivateEndpoint.class);
        Assertions.assertEquals("jgcyztsfmznba", model.id());
    }
}