// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.storagecache.models.StorageTargetSpaceAllocation;
import org.junit.jupiter.api.Assertions;

public final class StorageTargetSpaceAllocationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        StorageTargetSpaceAllocation model
            = BinaryData.fromString("{\"name\":\"kwobdagxtibq\",\"allocationPercentage\":2091557827}")
                .toObject(StorageTargetSpaceAllocation.class);
        Assertions.assertEquals("kwobdagxtibq", model.name());
        Assertions.assertEquals(2091557827, model.allocationPercentage());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        StorageTargetSpaceAllocation model
            = new StorageTargetSpaceAllocation().withName("kwobdagxtibq").withAllocationPercentage(2091557827);
        model = BinaryData.fromObject(model).toObject(StorageTargetSpaceAllocation.class);
        Assertions.assertEquals("kwobdagxtibq", model.name());
        Assertions.assertEquals(2091557827, model.allocationPercentage());
    }
}
