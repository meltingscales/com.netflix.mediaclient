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
public final class CLCSSpaceSize {
    public static final a c;
    private static final /* synthetic */ InterfaceC8598drn g;
    private static final C9033hu i;
    private static final /* synthetic */ CLCSSpaceSize[] j;
    private final String h;
    public static final CLCSSpaceSize d = new CLCSSpaceSize("SMALL", 0, "SMALL");
    public static final CLCSSpaceSize b = new CLCSSpaceSize("MEDIUM", 1, "MEDIUM");
    public static final CLCSSpaceSize e = new CLCSSpaceSize("LARGE", 2, "LARGE");
    public static final CLCSSpaceSize a = new CLCSSpaceSize("JUMBO", 3, "JUMBO");
    public static final CLCSSpaceSize f = new CLCSSpaceSize("UNKNOWN__", 4, "UNKNOWN__");

    public static InterfaceC8598drn<CLCSSpaceSize> c() {
        return g;
    }

    private static final /* synthetic */ CLCSSpaceSize[] d() {
        return new CLCSSpaceSize[]{d, b, e, a, f};
    }

    public static CLCSSpaceSize valueOf(String str) {
        return (CLCSSpaceSize) Enum.valueOf(CLCSSpaceSize.class, str);
    }

    public static CLCSSpaceSize[] values() {
        return (CLCSSpaceSize[]) j.clone();
    }

    public final String a() {
        return this.h;
    }

    private CLCSSpaceSize(String str, int i2, String str2) {
        this.h = str2;
    }

    static {
        List j2;
        CLCSSpaceSize[] d2 = d();
        j = d2;
        g = C8600drp.e(d2);
        c = new a(null);
        j2 = C8569dql.j("SMALL", "MEDIUM", "LARGE", "JUMBO");
        i = new C9033hu("CLCSSpaceSize", j2);
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final C9033hu d() {
            return CLCSSpaceSize.i;
        }

        public final CLCSSpaceSize e(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSSpaceSize.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSSpaceSize) obj).a(), (Object) str)) {
                    break;
                }
            }
            CLCSSpaceSize cLCSSpaceSize = (CLCSSpaceSize) obj;
            return cLCSSpaceSize == null ? CLCSSpaceSize.f : cLCSSpaceSize;
        }
    }
}
