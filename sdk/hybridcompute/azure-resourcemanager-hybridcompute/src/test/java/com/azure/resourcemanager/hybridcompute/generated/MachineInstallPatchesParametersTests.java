// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.LinuxParameters;
import com.azure.resourcemanager.hybridcompute.models.MachineInstallPatchesParameters;
import com.azure.resourcemanager.hybridcompute.models.VMGuestPatchClassificationLinux;
import com.azure.resourcemanager.hybridcompute.models.VMGuestPatchClassificationWindows;
import com.azure.resourcemanager.hybridcompute.models.VMGuestPatchRebootSetting;
import com.azure.resourcemanager.hybridcompute.models.WindowsParameters;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class MachineInstallPatchesParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        MachineInstallPatchesParameters model =
            BinaryData
                .fromString(
                    "{\"maximumDuration\":\"pwvlqdq\",\"rebootSetting\":\"Never\",\"windowsParameters\":{\"classificationsToInclude\":[\"Tools\",\"Definition\",\"Definition\"],\"kbNumbersToInclude\":[\"etcktvfcivfsnk\",\"m\",\"ctq\",\"jf\"],\"kbNumbersToExclude\":[\"rjcxerfuwu\",\"ttxfvjr\"],\"excludeKbsRequiringReboot\":false,\"maxPatchPublishDate\":\"2020-12-24T00:10:53Z\"},\"linuxParameters\":{\"classificationsToInclude\":[\"Security\",\"Other\",\"Security\",\"Critical\"],\"packageNameMasksToInclude\":[\"nljky\",\"xjvuujqgidokg\"],\"packageNameMasksToExclude\":[\"yoxgvcltbgsnc\",\"hkjeszzhbi\",\"htxfvgxbfsmxnehm\"]}}")
                .toObject(MachineInstallPatchesParameters.class);
        Assertions.assertEquals("pwvlqdq", model.maximumDuration());
        Assertions.assertEquals(VMGuestPatchRebootSetting.NEVER, model.rebootSetting());
        Assertions
            .assertEquals(
                VMGuestPatchClassificationWindows.TOOLS, model.windowsParameters().classificationsToInclude().get(0));
        Assertions.assertEquals("etcktvfcivfsnk", model.windowsParameters().kbNumbersToInclude().get(0));
        Assertions.assertEquals("rjcxerfuwu", model.windowsParameters().kbNumbersToExclude().get(0));
        Assertions.assertEquals(false, model.windowsParameters().excludeKbsRequiringReboot());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2020-12-24T00:10:53Z"), model.windowsParameters().maxPatchPublishDate());
        Assertions
            .assertEquals(
                VMGuestPatchClassificationLinux.SECURITY, model.linuxParameters().classificationsToInclude().get(0));
        Assertions.assertEquals("nljky", model.linuxParameters().packageNameMasksToInclude().get(0));
        Assertions.assertEquals("yoxgvcltbgsnc", model.linuxParameters().packageNameMasksToExclude().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        MachineInstallPatchesParameters model =
            new MachineInstallPatchesParameters()
                .withMaximumDuration("pwvlqdq")
                .withRebootSetting(VMGuestPatchRebootSetting.NEVER)
                .withWindowsParameters(
                    new WindowsParameters()
                        .withClassificationsToInclude(
                            Arrays
                                .asList(
                                    VMGuestPatchClassificationWindows.TOOLS,
                                    VMGuestPatchClassificationWindows.DEFINITION,
                                    VMGuestPatchClassificationWindows.DEFINITION))
                        .withKbNumbersToInclude(Arrays.asList("etcktvfcivfsnk", "m", "ctq", "jf"))
                        .withKbNumbersToExclude(Arrays.asList("rjcxerfuwu", "ttxfvjr"))
                        .withExcludeKbsRequiringReboot(false)
                        .withMaxPatchPublishDate(OffsetDateTime.parse("2020-12-24T00:10:53Z")))
                .withLinuxParameters(
                    new LinuxParameters()
                        .withClassificationsToInclude(
                            Arrays
                                .asList(
                                    VMGuestPatchClassificationLinux.SECURITY,
                                    VMGuestPatchClassificationLinux.OTHER,
                                    VMGuestPatchClassificationLinux.SECURITY,
                                    VMGuestPatchClassificationLinux.CRITICAL))
                        .withPackageNameMasksToInclude(Arrays.asList("nljky", "xjvuujqgidokg"))
                        .withPackageNameMasksToExclude(
                            Arrays.asList("yoxgvcltbgsnc", "hkjeszzhbi", "htxfvgxbfsmxnehm")));
        model = BinaryData.fromObject(model).toObject(MachineInstallPatchesParameters.class);
        Assertions.assertEquals("pwvlqdq", model.maximumDuration());
        Assertions.assertEquals(VMGuestPatchRebootSetting.NEVER, model.rebootSetting());
        Assertions
            .assertEquals(
                VMGuestPatchClassificationWindows.TOOLS, model.windowsParameters().classificationsToInclude().get(0));
        Assertions.assertEquals("etcktvfcivfsnk", model.windowsParameters().kbNumbersToInclude().get(0));
        Assertions.assertEquals("rjcxerfuwu", model.windowsParameters().kbNumbersToExclude().get(0));
        Assertions.assertEquals(false, model.windowsParameters().excludeKbsRequiringReboot());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2020-12-24T00:10:53Z"), model.windowsParameters().maxPatchPublishDate());
        Assertions
            .assertEquals(
                VMGuestPatchClassificationLinux.SECURITY, model.linuxParameters().classificationsToInclude().get(0));
        Assertions.assertEquals("nljky", model.linuxParameters().packageNameMasksToInclude().get(0));
        Assertions.assertEquals("yoxgvcltbgsnc", model.linuxParameters().packageNameMasksToExclude().get(0));
    }
}
