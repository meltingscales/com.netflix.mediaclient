package com.bugsnag.android.internal;

import java.util.Arrays;

/* loaded from: classes2.dex */
public enum TaskType {
    ERROR_REQUEST,
    SESSION_REQUEST,
    IO,
    INTERNAL_REPORT,
    DEFAULT;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static TaskType[] valuesCustom() {
        TaskType[] valuesCustom = values();
        return (TaskType[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
