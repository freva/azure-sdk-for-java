// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterAvailableUpgradeHotfixUpgradeProperties;
import com.azure.resourcemanager.hdinsight.containers.models.Severity;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class ClusterAvailableUpgradeHotfixUpgradePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterAvailableUpgradeHotfixUpgradeProperties model = BinaryData.fromString(
            "{\"upgradeType\":\"HotfixUpgrade\",\"description\":\"ltmm\",\"sourceOssVersion\":\"hyeozphvwau\",\"sourceClusterVersion\":\"ncyg\",\"sourceBuildNumber\":\"kvi\",\"targetOssVersion\":\"dscwxqupevzhf\",\"targetClusterVersion\":\"otxhojujby\",\"targetBuildNumber\":\"lmcuvhixb\",\"componentName\":\"yfwnylr\",\"severity\":\"low\",\"extendedProperties\":\"sttp\",\"createdTime\":\"2021-06-29T07:31:54Z\"}")
            .toObject(ClusterAvailableUpgradeHotfixUpgradeProperties.class);
        Assertions.assertEquals("ltmm", model.description());
        Assertions.assertEquals("hyeozphvwau", model.sourceOssVersion());
        Assertions.assertEquals("ncyg", model.sourceClusterVersion());
        Assertions.assertEquals("kvi", model.sourceBuildNumber());
        Assertions.assertEquals("dscwxqupevzhf", model.targetOssVersion());
        Assertions.assertEquals("otxhojujby", model.targetClusterVersion());
        Assertions.assertEquals("lmcuvhixb", model.targetBuildNumber());
        Assertions.assertEquals("yfwnylr", model.componentName());
        Assertions.assertEquals(Severity.LOW, model.severity());
        Assertions.assertEquals("sttp", model.extendedProperties());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-29T07:31:54Z"), model.createdTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterAvailableUpgradeHotfixUpgradeProperties model = new ClusterAvailableUpgradeHotfixUpgradeProperties()
            .withDescription("ltmm").withSourceOssVersion("hyeozphvwau").withSourceClusterVersion("ncyg")
            .withSourceBuildNumber("kvi").withTargetOssVersion("dscwxqupevzhf").withTargetClusterVersion("otxhojujby")
            .withTargetBuildNumber("lmcuvhixb").withComponentName("yfwnylr").withSeverity(Severity.LOW)
            .withExtendedProperties("sttp").withCreatedTime(OffsetDateTime.parse("2021-06-29T07:31:54Z"));
        model = BinaryData.fromObject(model).toObject(ClusterAvailableUpgradeHotfixUpgradeProperties.class);
        Assertions.assertEquals("ltmm", model.description());
        Assertions.assertEquals("hyeozphvwau", model.sourceOssVersion());
        Assertions.assertEquals("ncyg", model.sourceClusterVersion());
        Assertions.assertEquals("kvi", model.sourceBuildNumber());
        Assertions.assertEquals("dscwxqupevzhf", model.targetOssVersion());
        Assertions.assertEquals("otxhojujby", model.targetClusterVersion());
        Assertions.assertEquals("lmcuvhixb", model.targetBuildNumber());
        Assertions.assertEquals("yfwnylr", model.componentName());
        Assertions.assertEquals(Severity.LOW, model.severity());
        Assertions.assertEquals("sttp", model.extendedProperties());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-29T07:31:54Z"), model.createdTime());
    }
}
