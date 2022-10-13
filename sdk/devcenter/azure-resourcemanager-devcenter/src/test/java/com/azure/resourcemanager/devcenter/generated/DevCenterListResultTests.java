// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.DevCenterListResult;
import org.junit.jupiter.api.Test;

public final class DevCenterListResultTests {
    @Test
    public void testDeserialize() {
        DevCenterListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"uv\"},\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"location\":\"zm\",\"tags\":{\"bejhphoycmsxa\":\"tzopbsphrupidgsy\"},\"id\":\"bhdxbm\",\"name\":\"qioqjzehtbmu\",\"type\":\"p\"},{\"properties\":{\"provisioningState\":\"oizh\"},\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"location\":\"soqijg\",\"tags\":{\"btcqq\":\"bpazlobcufpdzn\",\"lhqgnufooojy\":\"nq\",\"zlhjxrifkwmrvkt\":\"ifsqesaagdfmg\",\"ajpsquc\":\"izntocipao\"},\"id\":\"poyfdkfogkn\",\"name\":\"gjofjd\",\"type\":\"eqsrdeupewnwreit\"},{\"properties\":{\"provisioningState\":\"flusarhmof\"},\"identity\":{\"type\":\"None\",\"userAssignedIdentities\":{}},\"location\":\"rkdtmlxh\",\"tags\":{\"jtxukcdm\":\"k\",\"yrlhmwhfpmrqobm\":\"arcryuanzwuxzdxt\",\"knryrtihfxtij\":\"u\"},\"id\":\"pzvgnwzsymglzufc\",\"name\":\"zk\",\"type\":\"hdbihan\"}],\"nextLink\":\"hfcbjysa\"}")
                .toObject(DevCenterListResult.class);
    }

    @Test
    public void testSerialize() {
        DevCenterListResult model = new DevCenterListResult();
        model = BinaryData.fromObject(model).toObject(DevCenterListResult.class);
    }
}