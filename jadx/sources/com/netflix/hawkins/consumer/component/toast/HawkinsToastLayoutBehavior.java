package com.netflix.hawkins.consumer.component.toast;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class HawkinsToastLayoutBehavior {
    private static final /* synthetic */ InterfaceC8598drn c;
    private static final /* synthetic */ HawkinsToastLayoutBehavior[] d;
    public static final HawkinsToastLayoutBehavior e = new HawkinsToastLayoutBehavior("Hug", 0);
    public static final HawkinsToastLayoutBehavior b = new HawkinsToastLayoutBehavior("Fill", 1);

    private static final /* synthetic */ HawkinsToastLayoutBehavior[] b() {
        return new HawkinsToastLayoutBehavior[]{e, b};
    }

    public static HawkinsToastLayoutBehavior valueOf(String str) {
        return (HawkinsToastLayoutBehavior) Enum.valueOf(HawkinsToastLayoutBehavior.class, str);
    }

    public static HawkinsToastLayoutBehavior[] values() {
        return (HawkinsToastLayoutBehavior[]) d.clone();
    }

    private HawkinsToastLayoutBehavior(String str, int i) {
    }

    static {
        HawkinsToastLayoutBehavior[] b2 = b();
        d = b2;
        c = C8600drp.e(b2);
    }
}
