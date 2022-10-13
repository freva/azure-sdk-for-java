// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.hybridcontainerservice.HybridContainerServiceManager;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPool;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPoolExtendedLocation;
import com.azure.resourcemanager.hybridcontainerservice.models.AgentPoolProvisioningStatusStatus;
import com.azure.resourcemanager.hybridcontainerservice.models.CloudProviderProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.Mode;
import com.azure.resourcemanager.hybridcontainerservice.models.OsType;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class AgentPoolsCreateOrUpdateMockTests {
    @Test
    public void testCreateOrUpdate() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"properties\":{\"provisioningState\":\"Succeeded\",\"status\":{\"errorMessage\":\"bqactxtgzukx\",\"readyReplicas\":179532208,\"replicas\":287881704},\"count\":451636472,\"availabilityZones\":[\"x\"],\"maxCount\":107951618,\"maxPods\":734515726,\"minCount\":1873190222,\"mode\":\"System\",\"nodeLabels\":{\"azivjlfrqttbajl\":\"savokqdzf\",\"kqqfk\":\"atnwxyiopi\"},\"nodeTaints\":[\"cxkdmligovi\"],\"osType\":\"Linux\",\"nodeImageVersion\":\"pmloazuruoc\",\"vmSize\":\"oorb\",\"cloudProviderProfile\":{}},\"extendedLocation\":{\"type\":\"jxakv\",\"name\":\"gslordilmyww\"},\"location\":\"kgkxn\",\"tags\":{\"uewbc\":\"abgyvudt\"},\"id\":\"hxuuwhcjyxccybvp\",\"name\":\"yakk\",\"type\":\"dzpxgwjpl\"}";

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

        HybridContainerServiceManager manager =
            HybridContainerServiceManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        AgentPool response =
            manager
                .agentPools()
                .define("crxgibb")
                .withRegion("ibyowbblgyavutp")
                .withExistingProvisionedCluster("duvwpklvxwmygd", "pgpqchiszepnnb")
                .withTags(mapOf("qolj", "oxoismsksbpim", "qzdwlvwlyoup", "kcgxxlxsffgcvi"))
                .withExtendedLocation(new AgentPoolExtendedLocation().withType("cwrwfs").withName("fnynszqujizdvoqy"))
                .withStatus(
                    new AgentPoolProvisioningStatusStatus()
                        .withErrorMessage("fozauorsuk")
                        .withReadyReplicas(1308317081)
                        .withReplicas(1406759128))
                .withCount(650795079)
                .withAvailabilityZones(Arrays.asList("nuuepzlrp", "wzsoldweyuqdunv"))
                .withMaxCount(221136034)
                .withMaxPods(1945425698)
                .withMinCount(2013507582)
                .withMode(Mode.LB)
                .withNodeLabels(
                    mapOf("v", "talywjhhgdnhxms", "ox", "omi", "euzaof", "gdufiqnd", "cubiipuipw", "chvcyyysfgdo"))
                .withNodeTaints(Arrays.asList("nmacj", "k", "izsh"))
                .withOsType(OsType.LINUX)
                .withNodeImageVersion("m")
                .withVmSize("vfgmblrrilby")
                .withCloudProviderProfile(new CloudProviderProfile())
                .create();

        Assertions.assertEquals("kgkxn", response.location());
        Assertions.assertEquals("abgyvudt", response.tags().get("uewbc"));
        Assertions.assertEquals("jxakv", response.extendedLocation().type());
        Assertions.assertEquals("gslordilmyww", response.extendedLocation().name());
        Assertions.assertEquals("bqactxtgzukx", response.status().errorMessage());
        Assertions.assertEquals(179532208, response.status().readyReplicas());
        Assertions.assertEquals(287881704, response.status().replicas());
        Assertions.assertEquals(451636472, response.count());
        Assertions.assertEquals("x", response.availabilityZones().get(0));
        Assertions.assertEquals(107951618, response.maxCount());
        Assertions.assertEquals(734515726, response.maxPods());
        Assertions.assertEquals(1873190222, response.minCount());
        Assertions.assertEquals(Mode.SYSTEM, response.mode());
        Assertions.assertEquals("savokqdzf", response.nodeLabels().get("azivjlfrqttbajl"));
        Assertions.assertEquals("cxkdmligovi", response.nodeTaints().get(0));
        Assertions.assertEquals(OsType.LINUX, response.osType());
        Assertions.assertEquals("pmloazuruoc", response.nodeImageVersion());
        Assertions.assertEquals("oorb", response.vmSize());
    }

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