package kotlin;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class LazyThreadSafetyMode {
    private static final /* synthetic */ InterfaceC8598drn b;
    private static final /* synthetic */ LazyThreadSafetyMode[] d;
    public static final LazyThreadSafetyMode c = new LazyThreadSafetyMode("SYNCHRONIZED", 0);
    public static final LazyThreadSafetyMode a = new LazyThreadSafetyMode("PUBLICATION", 1);
    public static final LazyThreadSafetyMode e = new LazyThreadSafetyMode("NONE", 2);

    private static final /* synthetic */ LazyThreadSafetyMode[] d() {
        return new LazyThreadSafetyMode[]{c, a, e};
    }

    public static LazyThreadSafetyMode valueOf(String str) {
        return (LazyThreadSafetyMode) Enum.valueOf(LazyThreadSafetyMode.class, str);
    }

    public static LazyThreadSafetyMode[] values() {
        return (LazyThreadSafetyMode[]) d.clone();
    }

    private LazyThreadSafetyMode(String str, int i) {
    }

    static {
        LazyThreadSafetyMode[] d2 = d();
        d = d2;
        b = C8600drp.e(d2);
    }
}
