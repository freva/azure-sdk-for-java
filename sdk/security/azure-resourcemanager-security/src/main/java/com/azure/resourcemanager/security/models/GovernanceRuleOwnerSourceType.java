// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** The owner type for the governance rule owner source. */
public final class GovernanceRuleOwnerSourceType extends ExpandableStringEnum<GovernanceRuleOwnerSourceType> {
    /** Static value ByTag for GovernanceRuleOwnerSourceType. */
    public static final GovernanceRuleOwnerSourceType BY_TAG = fromString("ByTag");

    /** Static value Manually for GovernanceRuleOwnerSourceType. */
    public static final GovernanceRuleOwnerSourceType MANUALLY = fromString("Manually");

    /**
     * Creates or finds a GovernanceRuleOwnerSourceType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding GovernanceRuleOwnerSourceType.
     */
    @JsonCreator
    public static GovernanceRuleOwnerSourceType fromString(String name) {
        return fromString(name, GovernanceRuleOwnerSourceType.class);
    }

    /**
     * Gets known GovernanceRuleOwnerSourceType values.
     *
     * @return known GovernanceRuleOwnerSourceType values.
     */
    public static Collection<GovernanceRuleOwnerSourceType> values() {
        return values(GovernanceRuleOwnerSourceType.class);
    }
}