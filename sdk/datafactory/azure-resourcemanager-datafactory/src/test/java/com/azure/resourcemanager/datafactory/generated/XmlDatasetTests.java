// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DatasetLocation;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.XmlDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class XmlDatasetTests {
    @Test
    public void testDeserialize() {
        XmlDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"Xml\",\"typeProperties\":{\"location\":{\"type\":\"DatasetLocation\",\"\":{}},\"compression\":{\"\":{}}},\"description\":\"yhsgz\",\"linkedServiceName\":{\"referenceName\":\"bgomfgbegl\",\"parameters\":{}},\"parameters\":{\"betnluankrrfxee\":{\"type\":\"Float\"}},\"annotations\":[],\"folder\":{\"name\":\"v\"},\"\":{}}")
                .toObject(XmlDataset.class);
        Assertions.assertEquals("yhsgz", model.description());
        Assertions.assertEquals("bgomfgbegl", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("betnluankrrfxee").type());
        Assertions.assertEquals("v", model.folder().name());
    }

    @Test
    public void testSerialize() {
        XmlDataset model =
            new XmlDataset()
                .withDescription("yhsgz")
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("bgomfgbegl").withParameters(mapOf()))
                .withParameters(mapOf("betnluankrrfxee", new ParameterSpecification().withType(ParameterType.FLOAT)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("v"))
                .withLocation(new DatasetLocation().withAdditionalProperties(mapOf("type", "DatasetLocation")))
                .withCompression(new DatasetCompression().withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(XmlDataset.class);
        Assertions.assertEquals("yhsgz", model.description());
        Assertions.assertEquals("bgomfgbegl", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.FLOAT, model.parameters().get("betnluankrrfxee").type());
        Assertions.assertEquals("v", model.folder().name());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}