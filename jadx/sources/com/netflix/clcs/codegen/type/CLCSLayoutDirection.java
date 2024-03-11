package com.netflix.clcs.codegen.type;

import java.util.Iterator;
import java.util.List;
import o.C8569dql;
import o.C8600drp;
import o.C8627dsp;
import o.C8632dsu;
import o.C9033hu;
import o.InterfaceC8598drn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class CLCSLayoutDirection {
    public static final c b;
    private static final /* synthetic */ InterfaceC8598drn c;
    private static final C9033hu g;
    private static final /* synthetic */ CLCSLayoutDirection[] i;
    private final String j;
    public static final CLCSLayoutDirection a = new CLCSLayoutDirection("ROW", 0, "ROW");
    public static final CLCSLayoutDirection d = new CLCSLayoutDirection("COLUMN", 1, "COLUMN");
    public static final CLCSLayoutDirection e = new CLCSLayoutDirection("UNKNOWN__", 2, "UNKNOWN__");

    private static final /* synthetic */ CLCSLayoutDirection[] b() {
        return new CLCSLayoutDirection[]{a, d, e};
    }

    public static InterfaceC8598drn<CLCSLayoutDirection> e() {
        return c;
    }

    public static CLCSLayoutDirection valueOf(String str) {
        return (CLCSLayoutDirection) Enum.valueOf(CLCSLayoutDirection.class, str);
    }

    public static CLCSLayoutDirection[] values() {
        return (CLCSLayoutDirection[]) i.clone();
    }

    public final String a() {
        return this.j;
    }

    private CLCSLayoutDirection(String str, int i2, String str2) {
        this.j = str2;
    }

    static {
        List j;
        CLCSLayoutDirection[] b2 = b();
        i = b2;
        c = C8600drp.e(b2);
        b = new c(null);
        j = C8569dql.j("ROW", "COLUMN");
        g = new C9033hu("CLCSLayoutDirection", j);
    }

    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(C8627dsp c8627dsp) {
            this();
        }

        private c() {
        }

        public final C9033hu b() {
            return CLCSLayoutDirection.g;
        }

        public final CLCSLayoutDirection e(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSLayoutDirection.e().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSLayoutDirection) obj).a(), (Object) str)) {
                    break;
                }
            }
            CLCSLayoutDirection cLCSLayoutDirection = (CLCSLayoutDirection) obj;
            return cLCSLayoutDirection == null ? CLCSLayoutDirection.e : cLCSLayoutDirection;
        }
    }
}
