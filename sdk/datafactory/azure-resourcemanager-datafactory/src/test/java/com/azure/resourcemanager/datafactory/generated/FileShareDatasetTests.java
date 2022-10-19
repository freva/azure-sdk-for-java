// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetCompression;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.DatasetStorageFormat;
import com.azure.resourcemanager.datafactory.models.FileShareDataset;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class FileShareDatasetTests {
    @Test
    public void testDeserialize() {
        FileShareDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"FileShare\",\"typeProperties\":{\"format\":{\"type\":\"DatasetStorageFormat\",\"\":{}},\"compression\":{\"\":{}}},\"description\":\"xqzv\",\"linkedServiceName\":{\"referenceName\":\"sbycucrwnamikz\",\"parameters\":{}},\"parameters\":{\"swziq\":{\"type\":\"Bool\"},\"hokzrusw\":{\"type\":\"Float\"},\"czznvfbycjsxj\":{\"type\":\"SecureString\"}},\"annotations\":[],\"folder\":{\"name\":\"vumwmxqh\"},\"\":{}}")
                .toObject(FileShareDataset.class);
        Assertions.assertEquals("xqzv", model.description());
        Assertions.assertEquals("sbycucrwnamikz", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("swziq").type());
        Assertions.assertEquals("vumwmxqh", model.folder().name());
    }

    @Test
    public void testSerialize() {
        FileShareDataset model =
            new FileShareDataset()
                .withDescription("xqzv")
                .withLinkedServiceName(
                    new LinkedServiceReference().withReferenceName("sbycucrwnamikz").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "swziq",
                        new ParameterSpecification().withType(ParameterType.BOOL),
                        "hokzrusw",
                        new ParameterSpecification().withType(ParameterType.FLOAT),
                        "czznvfbycjsxj",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("vumwmxqh"))
                .withFormat(new DatasetStorageFormat().withAdditionalProperties(mapOf("type", "DatasetStorageFormat")))
                .withCompression(new DatasetCompression().withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(FileShareDataset.class);
        Assertions.assertEquals("xqzv", model.description());
        Assertions.assertEquals("sbycucrwnamikz", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.BOOL, model.parameters().get("swziq").type());
        Assertions.assertEquals("vumwmxqh", model.folder().name());
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