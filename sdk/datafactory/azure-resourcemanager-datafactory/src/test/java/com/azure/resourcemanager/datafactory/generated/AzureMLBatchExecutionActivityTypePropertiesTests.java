// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.AzureMLBatchExecutionActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.AzureMLWebServiceFile;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureMLBatchExecutionActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureMLBatchExecutionActivityTypeProperties model = BinaryData.fromString(
            "{\"globalParameters\":{\"qtscduuywgcuvcfm\":\"datab\"},\"webServiceOutputs\":{\"bz\":{\"filePath\":\"datapvoazgtlxgtusw\",\"linkedServiceName\":{\"referenceName\":\"gtskolbjylostrc\",\"parameters\":{\"bwaiqs\":\"datace\"}}}},\"webServiceInputs\":{\"crkf\":{\"filePath\":\"datalphaul\",\"linkedServiceName\":{\"referenceName\":\"alspeanheswxll\",\"parameters\":{\"iycjulunbtuf\":\"datablfprskxhghvg\",\"njpivo\":\"datacipi\",\"ahdplicivoduda\":\"datazxkhoabmahj\",\"ubgrjkgkoxuedml\":\"databmjheyntsdwxpa\"}}},\"kofoqrvnhc\":{\"filePath\":\"datagjywp\",\"linkedServiceName\":{\"referenceName\":\"bvvjyenwvgvhhouh\",\"parameters\":{\"joycyvxbr\":\"datahwlkfljooiiviwlf\",\"trw\":\"datahwb\"}}},\"mridcy\":{\"filePath\":\"dataoghvkzmgvtempy\",\"linkedServiceName\":{\"referenceName\":\"jahwypdh\",\"parameters\":{\"xtg\":\"datajlsatoxsga\",\"ftlbtotu\":\"dataxmxgqgquulyrtk\",\"cwrykwmvcxyu\":\"datazasrwoxumnucqew\"}}},\"qugycorgnxmn\":{\"filePath\":\"datanz\",\"linkedServiceName\":{\"referenceName\":\"e\",\"parameters\":{\"lhxfmvngdrn\":\"datawgqis\",\"nbwdborjyprcojwi\":\"datayvnbhn\",\"eiftm\":\"datagtdjqczoqpkpi\",\"hlnaymsgbyho\":\"datazofont\"}}}}}")
            .toObject(AzureMLBatchExecutionActivityTypeProperties.class);
        Assertions.assertEquals("gtskolbjylostrc",
            model.webServiceOutputs().get("bz").linkedServiceName().referenceName());
        Assertions.assertEquals("alspeanheswxll",
            model.webServiceInputs().get("crkf").linkedServiceName().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureMLBatchExecutionActivityTypeProperties model
            = new AzureMLBatchExecutionActivityTypeProperties().withGlobalParameters(mapOf("qtscduuywgcuvcfm", "datab"))
                .withWebServiceOutputs(mapOf("bz",
                    new AzureMLWebServiceFile().withFilePath("datapvoazgtlxgtusw")
                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("gtskolbjylostrc")
                            .withParameters(mapOf("bwaiqs", "datace")))))
                .withWebServiceInputs(mapOf("crkf",
                    new AzureMLWebServiceFile().withFilePath("datalphaul")
                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("alspeanheswxll")
                            .withParameters(mapOf("iycjulunbtuf", "datablfprskxhghvg", "njpivo", "datacipi",
                                "ahdplicivoduda", "datazxkhoabmahj", "ubgrjkgkoxuedml", "databmjheyntsdwxpa"))),
                    "kofoqrvnhc",
                    new AzureMLWebServiceFile().withFilePath("datagjywp")
                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("bvvjyenwvgvhhouh")
                            .withParameters(mapOf("joycyvxbr", "datahwlkfljooiiviwlf", "trw", "datahwb"))),
                    "mridcy",
                    new AzureMLWebServiceFile().withFilePath("dataoghvkzmgvtempy")
                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("jahwypdh")
                            .withParameters(mapOf("xtg", "datajlsatoxsga", "ftlbtotu", "dataxmxgqgquulyrtk",
                                "cwrykwmvcxyu", "datazasrwoxumnucqew"))),
                    "qugycorgnxmn",
                    new AzureMLWebServiceFile().withFilePath("datanz")
                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("e")
                            .withParameters(mapOf("lhxfmvngdrn", "datawgqis", "nbwdborjyprcojwi", "datayvnbhn", "eiftm",
                                "datagtdjqczoqpkpi", "hlnaymsgbyho", "datazofont")))));
        model = BinaryData.fromObject(model).toObject(AzureMLBatchExecutionActivityTypeProperties.class);
        Assertions.assertEquals("gtskolbjylostrc",
            model.webServiceOutputs().get("bz").linkedServiceName().referenceName());
        Assertions.assertEquals("alspeanheswxll",
            model.webServiceInputs().get("crkf").linkedServiceName().referenceName());
    }

    // Use "Map.of" if available
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
