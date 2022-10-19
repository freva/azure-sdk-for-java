// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SalesforceSource;
import com.azure.resourcemanager.datafactory.models.SalesforceSourceReadBehavior;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class SalesforceSourceTests {
    @Test
    public void testDeserialize() {
        SalesforceSource model =
            BinaryData
                .fromString("{\"type\":\"SalesforceSource\",\"readBehavior\":\"QueryAll\",\"\":{}}")
                .toObject(SalesforceSource.class);
        Assertions.assertEquals(SalesforceSourceReadBehavior.QUERY_ALL, model.readBehavior());
    }

    @Test
    public void testSerialize() {
        SalesforceSource model = new SalesforceSource().withReadBehavior(SalesforceSourceReadBehavior.QUERY_ALL);
        model = BinaryData.fromObject(model).toObject(SalesforceSource.class);
        Assertions.assertEquals(SalesforceSourceReadBehavior.QUERY_ALL, model.readBehavior());
    }
}