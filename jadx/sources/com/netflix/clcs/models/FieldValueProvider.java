package com.netflix.clcs.models;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class FieldValueProvider {
    public static final FieldValueProvider a = new FieldValueProvider("ANDROID_APP_HASH", 0);
    private static final /* synthetic */ FieldValueProvider[] b;
    private static final /* synthetic */ InterfaceC8598drn c;

    private static final /* synthetic */ FieldValueProvider[] b() {
        return new FieldValueProvider[]{a};
    }

    public static FieldValueProvider valueOf(String str) {
        return (FieldValueProvider) Enum.valueOf(FieldValueProvider.class, str);
    }

    public static FieldValueProvider[] values() {
        return (FieldValueProvider[]) b.clone();
    }

    private FieldValueProvider(String str, int i) {
    }

    static {
        FieldValueProvider[] b2 = b();
        b = b2;
        c = C8600drp.e(b2);
    }
}
