// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.AadProfileResponse;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class AadProfileResponseTests {
    @Test
    public void testDeserialize() {
        AadProfileResponse model =
            BinaryData
                .fromString(
                    "{\"adminGroupObjectIDs\":[\"jqul\",\"gsntnbybkzgcwr\",\"clxxwrljdo\"],\"clientAppID\":\"kcqvkocrc\",\"enableAzureRbac\":false,\"managed\":false,\"serverAppID\":\"hxbnjbiksqrg\",\"tenantID\":\"sainqpjwnzl\"}")
                .toObject(AadProfileResponse.class);
        Assertions.assertEquals("jqul", model.adminGroupObjectIDs().get(0));
        Assertions.assertEquals("kcqvkocrc", model.clientAppId());
        Assertions.assertEquals(false, model.enableAzureRbac());
        Assertions.assertEquals(false, model.managed());
        Assertions.assertEquals("hxbnjbiksqrg", model.serverAppId());
        Assertions.assertEquals("sainqpjwnzl", model.tenantId());
    }

    @Test
    public void testSerialize() {
        AadProfileResponse model =
            new AadProfileResponse()
                .withAdminGroupObjectIDs(Arrays.asList("jqul", "gsntnbybkzgcwr", "clxxwrljdo"))
                .withClientAppId("kcqvkocrc")
                .withEnableAzureRbac(false)
                .withManaged(false)
                .withServerAppId("hxbnjbiksqrg")
                .withTenantId("sainqpjwnzl");
        model = BinaryData.fromObject(model).toObject(AadProfileResponse.class);
        Assertions.assertEquals("jqul", model.adminGroupObjectIDs().get(0));
        Assertions.assertEquals("kcqvkocrc", model.clientAppId());
        Assertions.assertEquals(false, model.enableAzureRbac());
        Assertions.assertEquals(false, model.managed());
        Assertions.assertEquals("hxbnjbiksqrg", model.serverAppId());
        Assertions.assertEquals("sainqpjwnzl", model.tenantId());
    }
}