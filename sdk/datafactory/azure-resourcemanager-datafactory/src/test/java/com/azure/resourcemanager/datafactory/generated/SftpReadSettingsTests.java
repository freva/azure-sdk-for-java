// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SftpReadSettings;

public final class SftpReadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SftpReadSettings model = BinaryData.fromString(
            "{\"type\":\"SftpReadSettings\",\"recursive\":\"datapbukou\",\"wildcardFolderPath\":\"dataviyfksegwezgfqou\",\"wildcardFileName\":\"datacpdtdzlyog\",\"enablePartitionDiscovery\":\"dataasjckakikkkajm\",\"partitionRootPath\":\"databigmnkrqdyc\",\"fileListPath\":\"databgkxxpklq\",\"deleteFilesAfterCompletion\":\"databcgsa\",\"modifiedDatetimeStart\":\"dataay\",\"modifiedDatetimeEnd\":\"dataeqedft\",\"disableChunking\":\"datagm\",\"maxConcurrentConnections\":\"datakt\",\"disableMetricsCollection\":\"datazyvzixmusiidivbb\",\"\":{\"pucl\":\"datafliqntnoegxo\",\"ygi\":\"datadytwdaiexisa\",\"ivfiypfvwyzjsi\":\"dataoukaffzzf\"}}")
            .toObject(SftpReadSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SftpReadSettings model = new SftpReadSettings().withMaxConcurrentConnections("datakt")
            .withDisableMetricsCollection("datazyvzixmusiidivbb").withRecursive("datapbukou")
            .withWildcardFolderPath("dataviyfksegwezgfqou").withWildcardFileName("datacpdtdzlyog")
            .withEnablePartitionDiscovery("dataasjckakikkkajm").withPartitionRootPath("databigmnkrqdyc")
            .withFileListPath("databgkxxpklq").withDeleteFilesAfterCompletion("databcgsa")
            .withModifiedDatetimeStart("dataay").withModifiedDatetimeEnd("dataeqedft").withDisableChunking("datagm");
        model = BinaryData.fromObject(model).toObject(SftpReadSettings.class);
    }
}
