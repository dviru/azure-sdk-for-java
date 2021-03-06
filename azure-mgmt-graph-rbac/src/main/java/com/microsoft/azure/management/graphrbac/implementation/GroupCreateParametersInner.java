/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.graphrbac.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request parameters for creating a new group.
 */
public class GroupCreateParametersInner {
    /**
     * Group display name.
     */
    @JsonProperty(required = true)
    private String displayName;

    /**
     * Whether the group is mail-enabled. Must be false. This is because only
     * pure security groups can be created using the Graph API.
     */
    @JsonProperty(required = true)
    private boolean mailEnabled;

    /**
     * Mail nickname.
     */
    @JsonProperty(required = true)
    private String mailNickname;

    /**
     * Whether the group is a security group. Must be true. This is because
     * only pure security groups can be created using the Graph API.
     */
    @JsonProperty(required = true)
    private boolean securityEnabled;

    /**
     * Creates an instance of GroupCreateParametersInner class.
     */
    public GroupCreateParametersInner() {
        mailEnabled = false;
        securityEnabled = true;
    }

    /**
     * Get the displayName value.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName value.
     *
     * @param displayName the displayName value to set
     * @return the GroupCreateParametersInner object itself.
     */
    public GroupCreateParametersInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the mailEnabled value.
     *
     * @return the mailEnabled value
     */
    public boolean mailEnabled() {
        return this.mailEnabled;
    }

    /**
     * Set the mailEnabled value.
     *
     * @param mailEnabled the mailEnabled value to set
     * @return the GroupCreateParametersInner object itself.
     */
    public GroupCreateParametersInner withMailEnabled(boolean mailEnabled) {
        this.mailEnabled = mailEnabled;
        return this;
    }

    /**
     * Get the mailNickname value.
     *
     * @return the mailNickname value
     */
    public String mailNickname() {
        return this.mailNickname;
    }

    /**
     * Set the mailNickname value.
     *
     * @param mailNickname the mailNickname value to set
     * @return the GroupCreateParametersInner object itself.
     */
    public GroupCreateParametersInner withMailNickname(String mailNickname) {
        this.mailNickname = mailNickname;
        return this;
    }

    /**
     * Get the securityEnabled value.
     *
     * @return the securityEnabled value
     */
    public boolean securityEnabled() {
        return this.securityEnabled;
    }

    /**
     * Set the securityEnabled value.
     *
     * @param securityEnabled the securityEnabled value to set
     * @return the GroupCreateParametersInner object itself.
     */
    public GroupCreateParametersInner withSecurityEnabled(boolean securityEnabled) {
        this.securityEnabled = securityEnabled;
        return this;
    }

}
