/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.management.network.implementation;

import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.network.AddressSpace;
import com.microsoft.azure.management.network.DhcpOptions;
import com.microsoft.azure.management.network.Network;
import com.microsoft.azure.management.network.Networks;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation.GroupableResourcesImpl;
import rx.Completable;

import java.util.ArrayList;

/**
 *  Implementation for Networks.
 */
@LangDefinition
class NetworksImpl
        extends GroupableResourcesImpl<
            Network,
            NetworkImpl,
            VirtualNetworkInner,
            VirtualNetworksInner,
            NetworkManager>
        implements Networks {

    NetworksImpl(final NetworkManager networkManager) {
        super(networkManager.inner().virtualNetworks(), networkManager);
    }

    @Override
    public PagedList<Network> list() {
        return wrapList(this.inner().listAll());
    }

    @Override
    public PagedList<Network> listByGroup(String groupName) {
        return wrapList(this.inner().list(groupName));
    }

    @Override
    public NetworkImpl getByGroup(String groupName, String name) {
        return wrapModel(this.inner().get(groupName, name));
    }

    @Override
    public Completable deleteByGroupAsync(String groupName, String name) {
        return this.inner().deleteAsync(groupName, name).toCompletable();
    }

    @Override
    public NetworkImpl define(String name) {
        return wrapModel(name);
    }

    // Fluent model create helpers

    @Override
    protected NetworkImpl wrapModel(String name) {
        VirtualNetworkInner inner = new VirtualNetworkInner();

        // Initialize address space
        AddressSpace addressSpace = inner.addressSpace();
        if (addressSpace == null) {
            addressSpace = new AddressSpace();
            inner.withAddressSpace(addressSpace);
        }

        if (addressSpace.addressPrefixes() == null) {
            addressSpace.withAddressPrefixes(new ArrayList<String>());
        }

        // Initialize subnets
        if (inner.subnets() == null) {
            inner.withSubnets(new ArrayList<SubnetInner>());
        }

        // Initialize DHCP options (DNS servers)
        DhcpOptions dhcp = inner.dhcpOptions();
        if (dhcp == null) {
            dhcp = new DhcpOptions();
            inner.withDhcpOptions(dhcp);
        }

        if (dhcp.dnsServers() == null) {
            dhcp.withDnsServers(new ArrayList<String>());
        }

        return new NetworkImpl(name, inner, super.manager());
    }

    @Override
    protected NetworkImpl wrapModel(VirtualNetworkInner inner) {
        if (inner == null) {
            return null;
        }
        return new NetworkImpl(inner.name(), inner, this.manager());
    }
}
