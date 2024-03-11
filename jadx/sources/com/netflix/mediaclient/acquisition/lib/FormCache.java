package com.netflix.mediaclient.acquisition.lib;

/* loaded from: classes3.dex */
public interface FormCache {
    boolean readShowValidationState(String str, int i);

    Object readValue(String str, String str2);

    void writeValidationState(String str, int i, boolean z);

    void writeValue(String str, String str2, Object obj);
}
