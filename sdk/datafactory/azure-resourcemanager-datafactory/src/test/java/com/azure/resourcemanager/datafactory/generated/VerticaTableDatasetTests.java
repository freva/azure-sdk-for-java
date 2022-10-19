// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DatasetFolder;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.ParameterSpecification;
import com.azure.resourcemanager.datafactory.models.ParameterType;
import com.azure.resourcemanager.datafactory.models.VerticaTableDataset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class VerticaTableDatasetTests {
    @Test
    public void testDeserialize() {
        VerticaTableDataset model =
            BinaryData
                .fromString(
                    "{\"type\":\"VerticaTable\",\"typeProperties\":{},\"description\":\"wvajq\",\"linkedServiceName\":{\"referenceName\":\"lx\",\"parameters\":{}},\"parameters\":{\"nwqrjzfrgqh\":{\"type\":\"SecureString\"},\"cmbuocnjrohmbpy\":{\"type\":\"Int\"},\"ameb\":{\"type\":\"Bool\"},\"yvk\":{\"type\":\"Float\"}},\"annotations\":[],\"folder\":{\"name\":\"cxneh\"},\"\":{}}")
                .toObject(VerticaTableDataset.class);
        Assertions.assertEquals("wvajq", model.description());
        Assertions.assertEquals("lx", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("nwqrjzfrgqh").type());
        Assertions.assertEquals("cxneh", model.folder().name());
    }

    @Test
    public void testSerialize() {
        VerticaTableDataset model =
            new VerticaTableDataset()
                .withDescription("wvajq")
                .withLinkedServiceName(new LinkedServiceReference().withReferenceName("lx").withParameters(mapOf()))
                .withParameters(
                    mapOf(
                        "nwqrjzfrgqh",
                        new ParameterSpecification().withType(ParameterType.SECURE_STRING),
                        "cmbuocnjrohmbpy",
                        new ParameterSpecification().withType(ParameterType.INT),
                        "ameb",
                        new ParameterSpecification().withType(ParameterType.BOOL),
                        "yvk",
                        new ParameterSpecification().withType(ParameterType.FLOAT)))
                .withAnnotations(Arrays.asList())
                .withFolder(new DatasetFolder().withName("cxneh"));
        model = BinaryData.fromObject(model).toObject(VerticaTableDataset.class);
        Assertions.assertEquals("wvajq", model.description());
        Assertions.assertEquals("lx", model.linkedServiceName().referenceName());
        Assertions.assertEquals(ParameterType.SECURE_STRING, model.parameters().get("nwqrjzfrgqh").type());
        Assertions.assertEquals("cxneh", model.folder().name());
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