/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.network.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Virtual Network resource.
 */
@JsonFlatten
public class VirtualNetwork extends Resource {
    /**
     * Gets or sets AddressSpace that contains an array of IP address ranges
     * that can be used by subnets.
     */
    @JsonProperty(value = "properties.addressSpace")
    private AddressSpace addressSpace;

    /**
     * Gets or sets DHCPOptions that contains an array of DNS servers
     * available to VMs deployed in the virtual network.
     */
    @JsonProperty(value = "properties.dhcpOptions")
    private DhcpOptions dhcpOptions;

    /**
     * Gets or sets List of subnets in a VirtualNetwork.
     */
    @JsonProperty(value = "properties.subnets")
    private List<Subnet> subnets;

    /**
     * Gets or sets resource guid property of the VirtualNetwork resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /**
     * Gets or sets Provisioning state of the PublicIP resource
     * Updating/Deleting/Failed.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    private String etag;

    /**
     * Get the addressSpace value.
     *
     * @return the addressSpace value
     */
    public AddressSpace getAddressSpace() {
        return this.addressSpace;
    }

    /**
     * Set the addressSpace value.
     *
     * @param addressSpace the addressSpace value to set
     */
    public void setAddressSpace(AddressSpace addressSpace) {
        this.addressSpace = addressSpace;
    }

    /**
     * Get the dhcpOptions value.
     *
     * @return the dhcpOptions value
     */
    public DhcpOptions getDhcpOptions() {
        return this.dhcpOptions;
    }

    /**
     * Set the dhcpOptions value.
     *
     * @param dhcpOptions the dhcpOptions value to set
     */
    public void setDhcpOptions(DhcpOptions dhcpOptions) {
        this.dhcpOptions = dhcpOptions;
    }

    /**
     * Get the subnets value.
     *
     * @return the subnets value
     */
    public List<Subnet> getSubnets() {
        return this.subnets;
    }

    /**
     * Set the subnets value.
     *
     * @param subnets the subnets value to set
     */
    public void setSubnets(List<Subnet> subnets) {
        this.subnets = subnets;
    }

    /**
     * Get the resourceGuid value.
     *
     * @return the resourceGuid value
     */
    public String getResourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resourceGuid value.
     *
     * @param resourceGuid the resourceGuid value to set
     */
    public void setResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value
     */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set
     */
    public void setProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value
     */
    public String getEtag() {
        return this.etag;
    }

    /**
     * Set the etag value.
     *
     * @param etag the etag value to set
     */
    public void setEtag(String etag) {
        this.etag = etag;
    }

}