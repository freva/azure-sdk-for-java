// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mixedreality.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mixedreality.models.Sku;
import com.azure.resourcemanager.mixedreality.models.SkuTier;
import org.junit.jupiter.api.Assertions;

public final class SkuTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Sku model =
            BinaryData
                .fromString(
                    "{\"name\":\"xjvuujqgidokg\",\"tier\":\"Standard\",\"size\":\"oxgvclt\",\"family\":\"sncghkjeszz\",\"capacity\":1537141479}")
                .toObject(Sku.class);
        Assertions.assertEquals("xjvuujqgidokg", model.name());
        Assertions.assertEquals(SkuTier.STANDARD, model.tier());
        Assertions.assertEquals("oxgvclt", model.size());
        Assertions.assertEquals("sncghkjeszz", model.family());
        Assertions.assertEquals(1537141479, model.capacity());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Sku model =
            new Sku()
                .withName("xjvuujqgidokg")
                .withTier(SkuTier.STANDARD)
                .withSize("oxgvclt")
                .withFamily("sncghkjeszz")
                .withCapacity(1537141479);
        model = BinaryData.fromObject(model).toObject(Sku.class);
        Assertions.assertEquals("xjvuujqgidokg", model.name());
        Assertions.assertEquals(SkuTier.STANDARD, model.tier());
        Assertions.assertEquals("oxgvclt", model.size());
        Assertions.assertEquals("sncghkjeszz", model.family());
        Assertions.assertEquals(1537141479, model.capacity());
    }
}
