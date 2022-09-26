// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.DataConnectionInner;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DataConnectionInnerTests {
    @Test
    public void testDeserialize() {
        DataConnectionInner model =
            BinaryData
                .fromString(
                    "{\"kind\":\"DataConnection\",\"location\":\"cwsobqwcs\",\"id\":\"bnwdcfh\",\"name\":\"cqdpfuv\",\"type\":\"lsbjjcanvxbv\"}")
                .toObject(DataConnectionInner.class);
        Assertions.assertEquals("cwsobqwcs", model.location());
    }

    @Test
    public void testSerialize() {
        DataConnectionInner model = new DataConnectionInner().withLocation("cwsobqwcs");
        model = BinaryData.fromObject(model).toObject(DataConnectionInner.class);
        Assertions.assertEquals("cwsobqwcs", model.location());
    }
}