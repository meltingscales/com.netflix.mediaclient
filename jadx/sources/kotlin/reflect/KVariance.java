package kotlin.reflect;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class KVariance {
    private static final /* synthetic */ KVariance[] b;
    private static final /* synthetic */ InterfaceC8598drn e;
    public static final KVariance c = new KVariance("INVARIANT", 0);
    public static final KVariance a = new KVariance("IN", 1);
    public static final KVariance d = new KVariance("OUT", 2);

    private static final /* synthetic */ KVariance[] c() {
        return new KVariance[]{c, a, d};
    }

    public static KVariance valueOf(String str) {
        return (KVariance) Enum.valueOf(KVariance.class, str);
    }

    public static KVariance[] values() {
        return (KVariance[]) b.clone();
    }

    private KVariance(String str, int i) {
    }

    static {
        KVariance[] c2 = c();
        b = c2;
        e = C8600drp.e(c2);
    }
}
