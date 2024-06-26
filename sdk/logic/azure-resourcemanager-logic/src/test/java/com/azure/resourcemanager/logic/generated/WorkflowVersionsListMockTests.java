// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.logic.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.logic.LogicManager;
import com.azure.resourcemanager.logic.models.WorkflowState;
import com.azure.resourcemanager.logic.models.WorkflowVersion;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class WorkflowVersionsListMockTests {
    @Test
    public void testList() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Failed\",\"createdTime\":\"2021-11-22T02:24:35Z\",\"changedTime\":\"2020-12-23T03:00:17Z\",\"state\":\"Disabled\",\"version\":\"fwbeqrkuorh\",\"accessEndpoint\":\"sruqnmdvha\",\"endpointsConfiguration\":{},\"accessControl\":{},\"sku\":{\"name\":\"NotSpecified\"},\"integrationAccount\":{\"id\":\"zwxiytx\",\"name\":\"gukvlbpkt\",\"type\":\"styoua\"},\"definition\":\"dataewres\",\"parameters\":{}},\"location\":\"weg\",\"tags\":{\"gijiitnspxlzd\":\"teyxeyguq\",\"ufanray\":\"sygrijwa\",\"dgrhydkygywezs\":\"fueqfrojs\"},\"id\":\"iecafygzmxi\",\"name\":\"qv\",\"type\":\"smaklixqcahy\"}]}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        LogicManager manager =
            LogicManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<WorkflowVersion> response =
            manager
                .workflowVersions()
                .list("saeuzanhsfnhsenw", "hpzfngqj", 290667189, com.azure.core.util.Context.NONE);

        Assertions.assertEquals("weg", response.iterator().next().location());
        Assertions.assertEquals("teyxeyguq", response.iterator().next().tags().get("gijiitnspxlzd"));
        Assertions.assertEquals(WorkflowState.DISABLED, response.iterator().next().state());
        Assertions.assertEquals("zwxiytx", response.iterator().next().integrationAccount().id());
    }
}
