// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.JitNetworkAccessRequestInner;
import com.azure.resourcemanager.security.models.JitNetworkAccessRequestPort;
import com.azure.resourcemanager.security.models.JitNetworkAccessRequestVirtualMachine;
import com.azure.resourcemanager.security.models.Status;
import com.azure.resourcemanager.security.models.StatusReason;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class JitNetworkAccessRequestInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        JitNetworkAccessRequestInner model = BinaryData.fromString(
            "{\"virtualMachines\":[{\"id\":\"lfxlmuifmuadj\",\"ports\":[{\"number\":731775574,\"allowedSourceAddressPrefix\":\"cskiioshjgc\",\"allowedSourceAddressPrefixes\":[\"ybnxgztlcgc\",\"j\",\"hfjv\",\"ywjzebecuvlbefvw\"],\"endTimeUtc\":\"2021-08-12T00:20:36Z\",\"status\":\"Initiated\",\"statusReason\":\"NewerRequestInitiated\",\"mappedPort\":1110842950}]}],\"startTimeUtc\":\"2021-10-05T00:47:09Z\",\"requestor\":\"lrwoxzgwpsyxj\",\"justification\":\"eypdvrbk\"}")
            .toObject(JitNetworkAccessRequestInner.class);
        Assertions.assertEquals("lfxlmuifmuadj", model.virtualMachines().get(0).id());
        Assertions.assertEquals(731775574, model.virtualMachines().get(0).ports().get(0).number());
        Assertions.assertEquals("cskiioshjgc",
            model.virtualMachines().get(0).ports().get(0).allowedSourceAddressPrefix());
        Assertions.assertEquals("ybnxgztlcgc",
            model.virtualMachines().get(0).ports().get(0).allowedSourceAddressPrefixes().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-12T00:20:36Z"),
            model.virtualMachines().get(0).ports().get(0).endTimeUtc());
        Assertions.assertEquals(Status.INITIATED, model.virtualMachines().get(0).ports().get(0).status());
        Assertions.assertEquals(StatusReason.NEWER_REQUEST_INITIATED,
            model.virtualMachines().get(0).ports().get(0).statusReason());
        Assertions.assertEquals(1110842950, model.virtualMachines().get(0).ports().get(0).mappedPort());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-05T00:47:09Z"), model.startTimeUtc());
        Assertions.assertEquals("lrwoxzgwpsyxj", model.requestor());
        Assertions.assertEquals("eypdvrbk", model.justification());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        JitNetworkAccessRequestInner model = new JitNetworkAccessRequestInner()
            .withVirtualMachines(Arrays.asList(new JitNetworkAccessRequestVirtualMachine().withId("lfxlmuifmuadj")
                .withPorts(Arrays.asList(new JitNetworkAccessRequestPort().withNumber(731775574)
                    .withAllowedSourceAddressPrefix("cskiioshjgc")
                    .withAllowedSourceAddressPrefixes(Arrays.asList("ybnxgztlcgc", "j", "hfjv", "ywjzebecuvlbefvw"))
                    .withEndTimeUtc(OffsetDateTime.parse("2021-08-12T00:20:36Z")).withStatus(Status.INITIATED)
                    .withStatusReason(StatusReason.NEWER_REQUEST_INITIATED).withMappedPort(1110842950)))))
            .withStartTimeUtc(OffsetDateTime.parse("2021-10-05T00:47:09Z")).withRequestor("lrwoxzgwpsyxj")
            .withJustification("eypdvrbk");
        model = BinaryData.fromObject(model).toObject(JitNetworkAccessRequestInner.class);
        Assertions.assertEquals("lfxlmuifmuadj", model.virtualMachines().get(0).id());
        Assertions.assertEquals(731775574, model.virtualMachines().get(0).ports().get(0).number());
        Assertions.assertEquals("cskiioshjgc",
            model.virtualMachines().get(0).ports().get(0).allowedSourceAddressPrefix());
        Assertions.assertEquals("ybnxgztlcgc",
            model.virtualMachines().get(0).ports().get(0).allowedSourceAddressPrefixes().get(0));
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-12T00:20:36Z"),
            model.virtualMachines().get(0).ports().get(0).endTimeUtc());
        Assertions.assertEquals(Status.INITIATED, model.virtualMachines().get(0).ports().get(0).status());
        Assertions.assertEquals(StatusReason.NEWER_REQUEST_INITIATED,
            model.virtualMachines().get(0).ports().get(0).statusReason());
        Assertions.assertEquals(1110842950, model.virtualMachines().get(0).ports().get(0).mappedPort());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-05T00:47:09Z"), model.startTimeUtc());
        Assertions.assertEquals("lrwoxzgwpsyxj", model.requestor());
        Assertions.assertEquals("eypdvrbk", model.justification());
    }
}
