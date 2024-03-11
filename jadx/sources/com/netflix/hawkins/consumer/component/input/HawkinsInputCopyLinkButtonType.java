package com.netflix.hawkins.consumer.component.input;

import com.netflix.hawkins.consumer.component.button.HawkinsButtonType;
import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HawkinsInputCopyLinkButtonType {
    private static final /* synthetic */ HawkinsInputCopyLinkButtonType[] c;
    private static final /* synthetic */ InterfaceC8598drn d;
    private final HawkinsButtonType h;
    public static final HawkinsInputCopyLinkButtonType a = new HawkinsInputCopyLinkButtonType("Primary", 0, HawkinsButtonType.b);
    public static final HawkinsInputCopyLinkButtonType b = new HawkinsInputCopyLinkButtonType("Secondary", 1, HawkinsButtonType.c);
    public static final HawkinsInputCopyLinkButtonType e = new HawkinsInputCopyLinkButtonType("Brand", 2, HawkinsButtonType.e);

    private static final /* synthetic */ HawkinsInputCopyLinkButtonType[] c() {
        return new HawkinsInputCopyLinkButtonType[]{a, b, e};
    }

    public static HawkinsInputCopyLinkButtonType valueOf(String str) {
        return (HawkinsInputCopyLinkButtonType) Enum.valueOf(HawkinsInputCopyLinkButtonType.class, str);
    }

    public static HawkinsInputCopyLinkButtonType[] values() {
        return (HawkinsInputCopyLinkButtonType[]) c.clone();
    }

    public final HawkinsButtonType a() {
        return this.h;
    }

    private HawkinsInputCopyLinkButtonType(String str, int i, HawkinsButtonType hawkinsButtonType) {
        this.h = hawkinsButtonType;
    }

    static {
        HawkinsInputCopyLinkButtonType[] c2 = c();
        c = c2;
        d = C8600drp.e(c2);
    }
}
