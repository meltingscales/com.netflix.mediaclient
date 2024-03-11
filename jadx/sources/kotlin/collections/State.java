package kotlin.collections;

import o.C8600drp;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class State {
    private static final /* synthetic */ InterfaceC8598drn a;
    private static final /* synthetic */ State[] f;
    public static final State d = new State("Ready", 0);
    public static final State e = new State("NotReady", 1);
    public static final State b = new State("Done", 2);
    public static final State c = new State("Failed", 3);

    private static final /* synthetic */ State[] b() {
        return new State[]{d, e, b, c};
    }

    public static State valueOf(String str) {
        return (State) Enum.valueOf(State.class, str);
    }

    public static State[] values() {
        return (State[]) f.clone();
    }

    private State(String str, int i) {
    }

    static {
        State[] b2 = b();
        f = b2;
        a = C8600drp.e(b2);
    }
}
