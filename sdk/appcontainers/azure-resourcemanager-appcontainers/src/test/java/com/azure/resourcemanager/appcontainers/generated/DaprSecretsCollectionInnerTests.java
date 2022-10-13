// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.DaprSecretsCollectionInner;
import com.azure.resourcemanager.appcontainers.models.Secret;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class DaprSecretsCollectionInnerTests {
    @Test
    public void testDeserialize() {
        DaprSecretsCollectionInner model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"fqntcyp\",\"value\":\"jv\"},{\"name\":\"imwkslircizj\",\"value\":\"ydfce\"},{\"name\":\"vlhv\",\"value\":\"dyftumrtwna\"}]}")
                .toObject(DaprSecretsCollectionInner.class);
        Assertions.assertEquals("fqntcyp", model.value().get(0).name());
        Assertions.assertEquals("jv", model.value().get(0).value());
    }

    @Test
    public void testSerialize() {
        DaprSecretsCollectionInner model =
            new DaprSecretsCollectionInner()
                .withValue(
                    Arrays
                        .asList(
                            new Secret().withName("fqntcyp").withValue("jv"),
                            new Secret().withName("imwkslircizj").withValue("ydfce"),
                            new Secret().withName("vlhv").withValue("dyftumrtwna")));
        model = BinaryData.fromObject(model).toObject(DaprSecretsCollectionInner.class);
        Assertions.assertEquals("fqntcyp", model.value().get(0).name());
        Assertions.assertEquals("jv", model.value().get(0).value());
    }
}