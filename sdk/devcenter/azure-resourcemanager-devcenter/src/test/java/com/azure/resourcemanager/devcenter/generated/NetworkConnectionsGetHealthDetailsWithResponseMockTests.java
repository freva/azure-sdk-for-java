// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.devcenter.DevCenterManager;
import com.azure.resourcemanager.devcenter.models.HealthCheckStatusDetails;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class NetworkConnectionsGetHealthDetailsWithResponseMockTests {
    @Test
    public void testGetHealthDetailsWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"startDateTime\":\"2021-02-03T13:21:09Z\",\"endDateTime\":\"2021-11-05T18:25:40Z\",\"healthChecks\":[{\"status\":\"Warning\",\"displayName\":\"hqepvufhbzehewh\",\"startDateTime\":\"2021-04-21T15:05:08Z\",\"endDateTime\":\"2021-04-25T05:24:23Z\",\"errorType\":\"qnbldxe\",\"recommendedAction\":\"lgsc\",\"additionalDetails\":\"ri\"},{\"status\":\"Unknown\",\"displayName\":\"r\",\"startDateTime\":\"2021-03-22T23:28:04Z\",\"endDateTime\":\"2021-05-14T17:56:54Z\",\"errorType\":\"ofldpuviyfcaa\",\"recommendedAction\":\"olhbhlvb\",\"additionalDetails\":\"uqibsxtkcu\"},{\"status\":\"Passed\",\"displayName\":\"farfs\",\"startDateTime\":\"2021-04-06T00:55:24Z\",\"endDateTime\":\"2021-03-08T02:00:13Z\",\"errorType\":\"xnq\",\"recommendedAction\":\"wgfstmhqykizm\",\"additionalDetails\":\"saoafcluqvox\"},{\"status\":\"Unknown\",\"displayName\":\"im\",\"startDateTime\":\"2021-12-04T12:52:02Z\",\"endDateTime\":\"2021-02-13T02:01:44Z\",\"errorType\":\"wwpbmzgwesyd\",\"recommendedAction\":\"wefohecbvo\",\"additionalDetails\":\"ndyqleal\"}]},\"id\":\"lmtkhlowkxx\",\"name\":\"vbrdfjmzsyzfho\",\"type\":\"lhikcyychunsj\"}";

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

        DevCenterManager manager =
            DevCenterManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        HealthCheckStatusDetails response =
            manager
                .networkConnections()
                .getHealthDetailsWithResponse("vbopfppdbwnu", "gahxkumasjcaa", com.azure.core.util.Context.NONE)
                .getValue();
    }
}
