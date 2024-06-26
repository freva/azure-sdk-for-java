// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkanalytics.generated;

/**
 * Samples for DataProducts Delete.
 */
public final class DataProductsDeleteSamples {
    /*
     * x-ms-original-file:
     * specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-11-15/examples/
     * DataProducts_Delete_MaximumSet_Gen.json
     */
    /**
     * Sample code: DataProducts_Delete_MaximumSet_Gen.
     * 
     * @param manager Entry point to NetworkAnalyticsManager.
     */
    public static void
        dataProductsDeleteMaximumSetGen(com.azure.resourcemanager.networkanalytics.NetworkAnalyticsManager manager) {
        manager.dataProducts().delete("aoiresourceGroupName", "dataproduct01", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/networkanalytics/resource-manager/Microsoft.NetworkAnalytics/stable/2023-11-15/examples/
     * DataProducts_Delete_MinimumSet_Gen.json
     */
    /**
     * Sample code: DataProducts_Delete_MaximumSet_Gen - generated by [MinimumSet] rule_MinimumSet_Gen.
     * 
     * @param manager Entry point to NetworkAnalyticsManager.
     */
    public static void dataProductsDeleteMaximumSetGenGeneratedByMinimumSetRuleMinimumSetGen(
        com.azure.resourcemanager.networkanalytics.NetworkAnalyticsManager manager) {
        manager.dataProducts().delete("aoiresourceGroupName", "dataproduct01", com.azure.core.util.Context.NONE);
    }
}
