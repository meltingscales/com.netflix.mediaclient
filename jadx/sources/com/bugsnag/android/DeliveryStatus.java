package com.bugsnag.android;

import java.util.Arrays;

/* loaded from: classes2.dex */
public enum DeliveryStatus {
    DELIVERED,
    UNDELIVERED,
    FAILURE;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static DeliveryStatus[] valuesCustom() {
        DeliveryStatus[] valuesCustom = values();
        return (DeliveryStatus[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
