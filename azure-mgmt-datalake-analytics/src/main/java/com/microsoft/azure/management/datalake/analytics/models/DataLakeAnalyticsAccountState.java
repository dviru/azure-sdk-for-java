/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.datalake.analytics.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for DataLakeAnalyticsAccountState.
 */
public enum DataLakeAnalyticsAccountState {
    /** Enum value active. */
    ACTIVE("active"),

    /** Enum value suspended. */
    SUSPENDED("suspended");

    /** The actual serialized value for a DataLakeAnalyticsAccountState instance. */
    private String value;

    DataLakeAnalyticsAccountState(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a DataLakeAnalyticsAccountState instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed DataLakeAnalyticsAccountState object, or null if unable to parse.
     */
    @JsonCreator
    public static DataLakeAnalyticsAccountState fromString(String value) {
        DataLakeAnalyticsAccountState[] items = DataLakeAnalyticsAccountState.values();
        for (DataLakeAnalyticsAccountState item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}