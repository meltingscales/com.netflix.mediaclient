package kotlin.reflect;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class KVisibility {
    private static final /* synthetic */ InterfaceC8598drn a;
    private static final /* synthetic */ KVisibility[] j;
    public static final KVisibility e = new KVisibility("PUBLIC", 0);
    public static final KVisibility c = new KVisibility("PROTECTED", 1);
    public static final KVisibility d = new KVisibility("INTERNAL", 2);
    public static final KVisibility b = new KVisibility("PRIVATE", 3);

    private static final /* synthetic */ KVisibility[] d() {
        return new KVisibility[]{e, c, d, b};
    }

    public static KVisibility valueOf(String str) {
        return (KVisibility) Enum.valueOf(KVisibility.class, str);
    }

    public static KVisibility[] values() {
        return (KVisibility[]) j.clone();
    }

    private KVisibility(String str, int i) {
    }

    static {
        KVisibility[] d2 = d();
        j = d2;
        a = C8600drp.e(d2);
    }
}
