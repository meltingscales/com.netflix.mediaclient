package com.netflix.hawkins.consumer.component.loader;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HawkinsLoaderType {
    public static final HawkinsLoaderType a = new HawkinsLoaderType("Brand", 0);
    public static final HawkinsLoaderType b = new HawkinsLoaderType("Standard", 1);
    private static final /* synthetic */ InterfaceC8598drn c;
    private static final /* synthetic */ HawkinsLoaderType[] d;

    private static final /* synthetic */ HawkinsLoaderType[] e() {
        return new HawkinsLoaderType[]{a, b};
    }

    public static HawkinsLoaderType valueOf(String str) {
        return (HawkinsLoaderType) Enum.valueOf(HawkinsLoaderType.class, str);
    }

    public static HawkinsLoaderType[] values() {
        return (HawkinsLoaderType[]) d.clone();
    }

    private HawkinsLoaderType(String str, int i) {
    }

    static {
        HawkinsLoaderType[] e = e();
        d = e;
        c = C8600drp.e(e);
    }
}
