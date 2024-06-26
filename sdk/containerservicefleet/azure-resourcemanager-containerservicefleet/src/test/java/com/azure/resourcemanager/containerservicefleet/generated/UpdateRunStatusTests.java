// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerservicefleet.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.containerservicefleet.models.UpdateRunStatus;

public final class UpdateRunStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        UpdateRunStatus model =
            BinaryData
                .fromString(
                    "{\"status\":{\"startTime\":\"2021-09-23T10:25:08Z\",\"completedTime\":\"2021-11-02T18:56:54Z\",\"state\":\"Running\"},\"stages\":[{\"status\":{\"startTime\":\"2021-07-30T18:07:02Z\",\"completedTime\":\"2021-05-09T04:26:37Z\",\"state\":\"Running\"},\"name\":\"avo\",\"groups\":[{\"status\":{\"startTime\":\"2021-02-20T04:22:30Z\",\"completedTime\":\"2021-07-20T12:25:55Z\",\"state\":\"NotStarted\"},\"name\":\"udwxdndnvowguj\",\"members\":[{},{},{}]},{\"status\":{\"startTime\":\"2021-09-16T14:46:13Z\",\"completedTime\":\"2021-03-07T18:06:24Z\",\"state\":\"Running\"},\"name\":\"azjdyggd\",\"members\":[{},{},{},{}]},{\"status\":{\"startTime\":\"2021-08-21T20:33:35Z\",\"completedTime\":\"2021-11-28T10:21:02Z\",\"state\":\"Failed\"},\"name\":\"e\",\"members\":[{},{},{},{}]}],\"afterStageWaitStatus\":{\"status\":{\"startTime\":\"2021-08-01T10:52:51Z\",\"completedTime\":\"2021-11-13T11:48:47Z\",\"state\":\"NotStarted\"},\"waitDurationInSeconds\":1642733206}},{\"status\":{\"startTime\":\"2021-04-10T19:11:58Z\",\"completedTime\":\"2021-05-17T05:51:50Z\",\"state\":\"NotStarted\"},\"name\":\"dcsi\",\"groups\":[{\"status\":{\"startTime\":\"2021-09-16T11:40:44Z\",\"completedTime\":\"2021-01-18T12:32:24Z\",\"state\":\"Stopped\"},\"name\":\"hfiqscjeypvhe\",\"members\":[{},{},{}]},{\"status\":{\"startTime\":\"2021-02-23T09:11:36Z\",\"completedTime\":\"2021-10-29T01:56:30Z\",\"state\":\"NotStarted\"},\"name\":\"vgmkqsleyyvxyqjp\",\"members\":[{},{},{},{}]},{\"status\":{\"startTime\":\"2020-12-22T00:41:57Z\",\"completedTime\":\"2021-06-23T11:42:04Z\",\"state\":\"Skipped\"},\"name\":\"zsqpjhvmdajvny\",\"members\":[{},{},{}]},{\"status\":{\"startTime\":\"2021-08-25T21:25:46Z\",\"completedTime\":\"2021-07-16T12:10:28Z\",\"state\":\"Stopping\"},\"name\":\"upfh\",\"members\":[{},{}]}],\"afterStageWaitStatus\":{\"status\":{\"startTime\":\"2021-09-24T18:03:45Z\",\"completedTime\":\"2021-02-02T14:05:53Z\",\"state\":\"Skipped\"},\"waitDurationInSeconds\":557848148}},{\"status\":{\"startTime\":\"2021-01-26T22:18Z\",\"completedTime\":\"2021-09-23T02:42:43Z\",\"state\":\"NotStarted\"},\"name\":\"aodsfcpkv\",\"groups\":[{\"status\":{\"startTime\":\"2021-06-07T12:26:40Z\",\"completedTime\":\"2021-05-26T02:59:13Z\",\"state\":\"NotStarted\"},\"name\":\"agfuaxbezyiu\",\"members\":[{}]},{\"status\":{\"startTime\":\"2021-06-08T13:35Z\",\"completedTime\":\"2021-07-25T13:50:11Z\",\"state\":\"Skipped\"},\"name\":\"wqsmbsur\",\"members\":[{},{},{},{}]}],\"afterStageWaitStatus\":{\"status\":{\"startTime\":\"2021-03-09T16:39:27Z\",\"completedTime\":\"2021-08-24T09:58:36Z\",\"state\":\"Completed\"},\"waitDurationInSeconds\":57544677}},{\"status\":{\"startTime\":\"2021-06-13T04:15:30Z\",\"completedTime\":\"2021-01-31T18:49:05Z\",\"state\":\"Completed\"},\"name\":\"iuxhqyudxorr\",\"groups\":[{\"status\":{\"startTime\":\"2021-05-11T11:35:52Z\",\"completedTime\":\"2021-07-04T22:05:57Z\",\"state\":\"Stopped\"},\"name\":\"rvkdvjsllrm\",\"members\":[{}]}],\"afterStageWaitStatus\":{\"status\":{\"startTime\":\"2021-12-05T03:26:34Z\",\"completedTime\":\"2021-07-14T20:07:14Z\",\"state\":\"Failed\"},\"waitDurationInSeconds\":63177450}}],\"nodeImageSelection\":{\"selectedNodeImageVersions\":[{\"version\":\"zwtruwiqzbqjvsov\"}]}}")
                .toObject(UpdateRunStatus.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        UpdateRunStatus model = new UpdateRunStatus();
        model = BinaryData.fromObject(model).toObject(UpdateRunStatus.class);
    }
}
