// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.changeanalysis.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.changeanalysis.AzureChangeAnalysisManager;
import com.azure.resourcemanager.changeanalysis.models.Change;
import com.azure.resourcemanager.changeanalysis.models.ChangeType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ChangesListByResourceGroupMockTests {
    @Test
    public void testListByResourceGroup() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"value\":[{\"properties\":{\"resourceId\":\"o\",\"timeStamp\":\"2021-06-08T21:13:45Z\",\"initiatedByList\":[\"bmdg\",\"bjf\",\"dgmb\"],\"changeType\":\"Update\",\"propertyChanges\":[]},\"id\":\"pbhtqqrolfpfpsa\",\"name\":\"gbquxigj\",\"type\":\"jgzjaoyfhrtx\"}]}";

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

        AzureChangeAnalysisManager manager =
            AzureChangeAnalysisManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        PagedIterable<Change> response =
            manager
                .changes()
                .listByResourceGroup(
                    "gpbkwtmut",
                    OffsetDateTime.parse("2021-12-01T15:01:53Z"),
                    OffsetDateTime.parse("2021-07-26T02:06:56Z"),
                    "ktapspwgcuertu",
                    com.azure.core.util.Context.NONE);

        Assertions.assertEquals("o", response.iterator().next().properties().resourceId());
        Assertions
            .assertEquals(
                OffsetDateTime.parse("2021-06-08T21:13:45Z"), response.iterator().next().properties().timestamp());
        Assertions.assertEquals("bmdg", response.iterator().next().properties().initiatedByList().get(0));
        Assertions.assertEquals(ChangeType.UPDATE, response.iterator().next().properties().changeType());
    }
}
