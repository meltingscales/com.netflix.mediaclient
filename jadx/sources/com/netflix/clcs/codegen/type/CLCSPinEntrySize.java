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
public final class CLCSPinEntrySize {
    public static final b b;
    private static final /* synthetic */ InterfaceC8598drn f;
    private static final /* synthetic */ CLCSPinEntrySize[] g;
    private static final C9033hu h;
    private final String j;
    public static final CLCSPinEntrySize d = new CLCSPinEntrySize("COMPACT", 0, "COMPACT");
    public static final CLCSPinEntrySize a = new CLCSPinEntrySize("STANDARD", 1, "STANDARD");
    public static final CLCSPinEntrySize c = new CLCSPinEntrySize("LARGE", 2, "LARGE");
    public static final CLCSPinEntrySize e = new CLCSPinEntrySize("UNKNOWN__", 3, "UNKNOWN__");

    private static final /* synthetic */ CLCSPinEntrySize[] b() {
        return new CLCSPinEntrySize[]{d, a, c, e};
    }

    public static InterfaceC8598drn<CLCSPinEntrySize> d() {
        return f;
    }

    public static CLCSPinEntrySize valueOf(String str) {
        return (CLCSPinEntrySize) Enum.valueOf(CLCSPinEntrySize.class, str);
    }

    public static CLCSPinEntrySize[] values() {
        return (CLCSPinEntrySize[]) g.clone();
    }

    public final String a() {
        return this.j;
    }

    private CLCSPinEntrySize(String str, int i, String str2) {
        this.j = str2;
    }

    static {
        List j;
        CLCSPinEntrySize[] b2 = b();
        g = b2;
        f = C8600drp.e(b2);
        b = new b(null);
        j = C8569dql.j("COMPACT", "STANDARD", "LARGE");
        h = new C9033hu("CLCSPinEntrySize", j);
    }

    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(C8627dsp c8627dsp) {
            this();
        }

        private b() {
        }

        public final C9033hu c() {
            return CLCSPinEntrySize.h;
        }

        public final CLCSPinEntrySize a(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSPinEntrySize.d().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSPinEntrySize) obj).a(), (Object) str)) {
                    break;
                }
            }
            CLCSPinEntrySize cLCSPinEntrySize = (CLCSPinEntrySize) obj;
            return cLCSPinEntrySize == null ? CLCSPinEntrySize.e : cLCSPinEntrySize;
        }
    }
}
