// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.GitHubRepositoryInner;
import com.azure.resourcemanager.security.models.DevOpsProvisioningState;
import com.azure.resourcemanager.security.models.GitHubRepositoryListResponse;
import com.azure.resourcemanager.security.models.GitHubRepositoryProperties;
import com.azure.resourcemanager.security.models.OnboardingState;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class GitHubRepositoryListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GitHubRepositoryListResponse model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningStatusMessage\":\"nsjlpjrtws\",\"provisioningStatusUpdateTimeUtc\":\"2021-07-22T02:13:51Z\",\"provisioningState\":\"DeletionSuccess\",\"repoId\":\"c\",\"repoName\":\"vtrrmhwrbfdpyflu\",\"repoFullName\":\"vjglrocuyzlwhhme\",\"onboardingState\":\"OnboardedByOtherConnector\",\"repoUrl\":\"clutnpqme\",\"parentOwnerName\":\"zjkmmykyujxs\"},\"id\":\"lhsrrry\",\"name\":\"jylmbkzudnigr\",\"type\":\"ihotjewlpxuzzjg\"},{\"properties\":{\"provisioningStatusMessage\":\"qyhqo\",\"provisioningStatusUpdateTimeUtc\":\"2021-05-06T11:57:22Z\",\"provisioningState\":\"DeletionSuccess\",\"repoId\":\"akydiwfbrkwpz\",\"repoName\":\"tvhcs\",\"repoFullName\":\"daqaxsi\",\"onboardingState\":\"Onboarded\",\"repoUrl\":\"gbebjf\",\"parentOwnerName\":\"bmoichd\"},\"id\":\"pnfpubntnbat\",\"name\":\"viqsowsaaelcattc\",\"type\":\"uhplrvkmjcwmjv\"},{\"properties\":{\"provisioningStatusMessage\":\"gcvkyyli\",\"provisioningStatusUpdateTimeUtc\":\"2021-08-15T21:25:45Z\",\"provisioningState\":\"Succeeded\",\"repoId\":\"sfxsf\",\"repoName\":\"tl\",\"repoFullName\":\"mvagbwidqlvhuko\",\"onboardingState\":\"NotOnboarded\",\"repoUrl\":\"i\",\"parentOwnerName\":\"vjfn\"},\"id\":\"jmvl\",\"name\":\"yzgib\",\"type\":\"kujrllfojui\"},{\"properties\":{\"provisioningStatusMessage\":\"uyjucejikzo\",\"provisioningStatusUpdateTimeUtc\":\"2021-11-04T10:37:28Z\",\"provisioningState\":\"PendingDeletion\",\"repoId\":\"ejetjklntik\",\"repoName\":\"uzk\",\"repoFullName\":\"qzolxrzvhqjw\",\"onboardingState\":\"NotApplicable\",\"repoUrl\":\"gv\",\"parentOwnerName\":\"pcrrk\"},\"id\":\"lawjmjsmwrok\",\"name\":\"dxfzzzwyjaf\",\"type\":\"tlhguynuchl\"}],\"nextLink\":\"ltxdwhmozu\"}")
            .toObject(GitHubRepositoryListResponse.class);
        Assertions.assertEquals(DevOpsProvisioningState.DELETION_SUCCESS,
            model.value().get(0).properties().provisioningState());
        Assertions.assertEquals(OnboardingState.ONBOARDED_BY_OTHER_CONNECTOR,
            model.value().get(0).properties().onboardingState());
        Assertions.assertEquals("zjkmmykyujxs", model.value().get(0).properties().parentOwnerName());
        Assertions.assertEquals("ltxdwhmozu", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GitHubRepositoryListResponse model = new GitHubRepositoryListResponse()
            .withValue(Arrays.asList(
                new GitHubRepositoryInner().withProperties(
                    new GitHubRepositoryProperties().withProvisioningState(DevOpsProvisioningState.DELETION_SUCCESS)
                        .withOnboardingState(OnboardingState.ONBOARDED_BY_OTHER_CONNECTOR)
                        .withParentOwnerName("zjkmmykyujxs")),
                new GitHubRepositoryInner().withProperties(
                    new GitHubRepositoryProperties().withProvisioningState(DevOpsProvisioningState.DELETION_SUCCESS)
                        .withOnboardingState(OnboardingState.ONBOARDED).withParentOwnerName("bmoichd")),
                new GitHubRepositoryInner().withProperties(
                    new GitHubRepositoryProperties().withProvisioningState(DevOpsProvisioningState.SUCCEEDED)
                        .withOnboardingState(OnboardingState.NOT_ONBOARDED).withParentOwnerName("vjfn")),
                new GitHubRepositoryInner().withProperties(
                    new GitHubRepositoryProperties().withProvisioningState(DevOpsProvisioningState.PENDING_DELETION)
                        .withOnboardingState(OnboardingState.NOT_APPLICABLE).withParentOwnerName("pcrrk"))))
            .withNextLink("ltxdwhmozu");
        model = BinaryData.fromObject(model).toObject(GitHubRepositoryListResponse.class);
        Assertions.assertEquals(DevOpsProvisioningState.DELETION_SUCCESS,
            model.value().get(0).properties().provisioningState());
        Assertions.assertEquals(OnboardingState.ONBOARDED_BY_OTHER_CONNECTOR,
            model.value().get(0).properties().onboardingState());
        Assertions.assertEquals("zjkmmykyujxs", model.value().get(0).properties().parentOwnerName());
        Assertions.assertEquals("ltxdwhmozu", model.nextLink());
    }
}
