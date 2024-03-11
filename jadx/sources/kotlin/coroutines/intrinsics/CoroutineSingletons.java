package kotlin.coroutines.intrinsics;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class CoroutineSingletons {
    private static final /* synthetic */ InterfaceC8598drn a;
    private static final /* synthetic */ CoroutineSingletons[] c;
    public static final CoroutineSingletons d = new CoroutineSingletons("COROUTINE_SUSPENDED", 0);
    public static final CoroutineSingletons b = new CoroutineSingletons("UNDECIDED", 1);
    public static final CoroutineSingletons e = new CoroutineSingletons("RESUMED", 2);

    private static final /* synthetic */ CoroutineSingletons[] e() {
        return new CoroutineSingletons[]{d, b, e};
    }

    public static CoroutineSingletons valueOf(String str) {
        return (CoroutineSingletons) Enum.valueOf(CoroutineSingletons.class, str);
    }

    public static CoroutineSingletons[] values() {
        return (CoroutineSingletons[]) c.clone();
    }

    private CoroutineSingletons(String str, int i) {
    }

    static {
        CoroutineSingletons[] e2 = e();
        c = e2;
        a = C8600drp.e(e2);
    }
}
