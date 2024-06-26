// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.eventgrid.fluent.models.DomainTopicInner;
import com.azure.resourcemanager.eventgrid.models.DomainTopicsListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DomainTopicsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DomainTopicsListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Creating\"},\"id\":\"r\",\"name\":\"tiagx\",\"type\":\"dszue\"},{\"properties\":{\"provisioningState\":\"Deleting\"},\"id\":\"kfzbeyvpnqicvi\",\"name\":\"v\",\"type\":\"jjxd\"},{\"properties\":{\"provisioningState\":\"Failed\"},\"id\":\"kzclewyh\",\"name\":\"lw\",\"type\":\"aztz\"},{\"properties\":{\"provisioningState\":\"Updating\"},\"id\":\"ckw\",\"name\":\"fz\",\"type\":\"whxxbuyqax\"}],\"nextLink\":\"eqz\"}")
            .toObject(DomainTopicsListResult.class);
        Assertions.assertEquals("eqz", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DomainTopicsListResult model = new DomainTopicsListResult().withValue(Arrays.asList(new DomainTopicInner(),
            new DomainTopicInner(), new DomainTopicInner(), new DomainTopicInner())).withNextLink("eqz");
        model = BinaryData.fromObject(model).toObject(DomainTopicsListResult.class);
        Assertions.assertEquals("eqz", model.nextLink());
    }
}
