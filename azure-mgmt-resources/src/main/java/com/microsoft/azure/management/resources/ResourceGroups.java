/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources;

import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingByName;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsBatchCreation;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsBeginDeletingByName;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsCreating;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsDeletingByName;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsListing;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsListingByTag;

/**
 * Entry point to resource group management API.
 */
@Fluent
public interface ResourceGroups extends
        SupportsListing<ResourceGroup>,
        SupportsListingByTag<ResourceGroup>,
        SupportsGettingByName<ResourceGroup>,
        SupportsCreating<ResourceGroup.DefinitionStages.Blank>,
        SupportsDeletingByName,
        SupportsBeginDeletingByName,
        SupportsBatchCreation<ResourceGroup> {
    /**
     * Checks whether resource group exists.
     *
     * @param name The name of the resource group to check. The name is case insensitive
     * @return true if the resource group exists; false otherwise
     */
    boolean checkExistence(String name);
}
