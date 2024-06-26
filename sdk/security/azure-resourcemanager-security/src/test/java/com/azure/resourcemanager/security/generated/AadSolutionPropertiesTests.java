// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.AadConnectivityState;
import com.azure.resourcemanager.security.models.AadSolutionProperties;
import com.azure.resourcemanager.security.models.ConnectedWorkspace;
import org.junit.jupiter.api.Assertions;

public final class AadSolutionPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AadSolutionProperties model = BinaryData.fromString(
            "{\"connectivityState\":\"NotLicensed\",\"deviceVendor\":\"yxwjezb\",\"deviceType\":\"ployuekdcpvu\",\"workspace\":{\"id\":\"svjmnsvujnjk\"},\"\":{\"pkdbx\":\"datalefcjis\",\"c\":\"datatfbjampq\",\"nmxynlsuqbwzst\":\"dataa\",\"gvp\":\"datak\"}}")
            .toObject(AadSolutionProperties.class);
        Assertions.assertEquals("yxwjezb", model.deviceVendor());
        Assertions.assertEquals("ployuekdcpvu", model.deviceType());
        Assertions.assertEquals("svjmnsvujnjk", model.workspace().id());
        Assertions.assertEquals(AadConnectivityState.NOT_LICENSED, model.connectivityState());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AadSolutionProperties model = new AadSolutionProperties().withDeviceVendor("yxwjezb")
            .withDeviceType("ployuekdcpvu").withWorkspace(new ConnectedWorkspace().withId("svjmnsvujnjk"))
            .withConnectivityState(AadConnectivityState.NOT_LICENSED);
        model = BinaryData.fromObject(model).toObject(AadSolutionProperties.class);
        Assertions.assertEquals("yxwjezb", model.deviceVendor());
        Assertions.assertEquals("ployuekdcpvu", model.deviceType());
        Assertions.assertEquals("svjmnsvujnjk", model.workspace().id());
        Assertions.assertEquals(AadConnectivityState.NOT_LICENSED, model.connectivityState());
    }
}
