// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.security.SecurityManager;
import com.azure.resourcemanager.security.models.Enforce;
import com.azure.resourcemanager.security.models.IsEnabled;
import com.azure.resourcemanager.security.models.PricingList;
import com.azure.resourcemanager.security.models.PricingTier;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class PricingsListWithResponseMockTests {
    @Test
    public void testListWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr
            = "{\"value\":[{\"properties\":{\"pricingTier\":\"Standard\",\"subPlan\":\"aiitn\",\"freeTrialRemainingTime\":\"PT89H48M39S\",\"enablementTime\":\"2021-02-08T00:48:06Z\",\"enforce\":\"False\",\"inherited\":\"True\",\"inheritedFrom\":\"maebdrxjsmrsea\",\"resourcesCoverageStatus\":\"PartiallyCovered\",\"extensions\":[{\"name\":\"bgrq\",\"isEnabled\":\"True\"},{\"name\":\"u\",\"isEnabled\":\"True\"}],\"deprecated\":false,\"replacedBy\":[\"yl\",\"eket\",\"v\"]},\"id\":\"ptqhatfg\",\"name\":\"hhbxgfhgkdm\",\"type\":\"flhhbupqovuw\"},{\"properties\":{\"pricingTier\":\"Free\",\"subPlan\":\"hmqhqjd\",\"freeTrialRemainingTime\":\"PT141H36M27S\",\"enablementTime\":\"2021-11-28T03:20:04Z\",\"enforce\":\"True\",\"inherited\":\"True\",\"inheritedFrom\":\"jxag\",\"resourcesCoverageStatus\":\"NotCovered\",\"extensions\":[{\"name\":\"zcraxilzdxc\",\"isEnabled\":\"False\"},{\"name\":\"dmdsypksfrhi\",\"isEnabled\":\"True\"},{\"name\":\"xjoupxehsbecxuv\",\"isEnabled\":\"False\"}],\"deprecated\":true,\"replacedBy\":[\"vyhgpgjdrng\"]},\"id\":\"djeepukuofz\",\"name\":\"i\",\"type\":\"tvucyackgkavpmgt\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito.when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito.when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito.when(httpClient.send(httpRequest.capture(), Mockito.any())).thenReturn(Mono.defer(() -> {
            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
            return Mono.just(httpResponse);
        }));

        SecurityManager manager = SecurityManager.configure().withHttpClient(httpClient).authenticate(
            tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
            new AzureProfile("", "", AzureEnvironment.AZURE));

        PricingList response = manager.pricings()
            .listWithResponse("wzecgbxrcsevqjdx", "iqwqbvanv", com.azure.core.util.Context.NONE).getValue();

        Assertions.assertEquals(PricingTier.STANDARD, response.value().get(0).pricingTier());
        Assertions.assertEquals("aiitn", response.value().get(0).subPlan());
        Assertions.assertEquals(Enforce.FALSE, response.value().get(0).enforce());
        Assertions.assertEquals("bgrq", response.value().get(0).extensions().get(0).name());
        Assertions.assertEquals(IsEnabled.TRUE, response.value().get(0).extensions().get(0).isEnabled());
    }
}
