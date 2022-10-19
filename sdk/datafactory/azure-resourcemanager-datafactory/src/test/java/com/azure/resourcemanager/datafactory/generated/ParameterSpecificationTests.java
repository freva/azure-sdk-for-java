// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ParameterSpecificationTests {
    @Test
    public void testDeserialize() {
        ParameterSpecification model =
            BinaryData.fromString("{\"type\":\"String\"}").toObject(ParameterSpecification.class);
        Assertions.assertEquals(ParameterType.STRING, model.type());
    }

    @Test
    public void testSerialize() {
        ParameterSpecification model = new ParameterSpecification().withType(ParameterType.STRING);
        model = BinaryData.fromObject(model).toObject(ParameterSpecification.class);
        Assertions.assertEquals(ParameterType.STRING, model.type());
    }
}