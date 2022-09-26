// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devhub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devhub.models.GitHubWorkflowProfileOidcCredentials;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class GitHubWorkflowProfileOidcCredentialsTests {
    @Test
    public void testDeserialize() {
        GitHubWorkflowProfileOidcCredentials model =
            BinaryData
                .fromString("{\"azureClientId\":\"odgmaajrmvdjwz\",\"azureTenantId\":\"ovmclwhijcoejct\"}")
                .toObject(GitHubWorkflowProfileOidcCredentials.class);
        Assertions.assertEquals("odgmaajrmvdjwz", model.azureClientId());
        Assertions.assertEquals("ovmclwhijcoejct", model.azureTenantId());
    }

    @Test
    public void testSerialize() {
        GitHubWorkflowProfileOidcCredentials model =
            new GitHubWorkflowProfileOidcCredentials()
                .withAzureClientId("odgmaajrmvdjwz")
                .withAzureTenantId("ovmclwhijcoejct");
        model = BinaryData.fromObject(model).toObject(GitHubWorkflowProfileOidcCredentials.class);
        Assertions.assertEquals("odgmaajrmvdjwz", model.azureClientId());
        Assertions.assertEquals("ovmclwhijcoejct", model.azureTenantId());
    }
}