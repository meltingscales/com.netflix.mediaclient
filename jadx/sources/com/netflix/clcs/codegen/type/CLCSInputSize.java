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
public final class CLCSInputSize {
    public static final a b;
    private static final C9033hu h;
    private static final /* synthetic */ CLCSInputSize[] i;
    private static final /* synthetic */ InterfaceC8598drn j;
    private final String g;
    public static final CLCSInputSize d = new CLCSInputSize("COMPACT", 0, "COMPACT");
    public static final CLCSInputSize a = new CLCSInputSize("STANDARD", 1, "STANDARD");
    public static final CLCSInputSize c = new CLCSInputSize("LARGE", 2, "LARGE");
    public static final CLCSInputSize e = new CLCSInputSize("UNKNOWN__", 3, "UNKNOWN__");

    public static InterfaceC8598drn<CLCSInputSize> a() {
        return j;
    }

    private static final /* synthetic */ CLCSInputSize[] b() {
        return new CLCSInputSize[]{d, a, c, e};
    }

    public static CLCSInputSize valueOf(String str) {
        return (CLCSInputSize) Enum.valueOf(CLCSInputSize.class, str);
    }

    public static CLCSInputSize[] values() {
        return (CLCSInputSize[]) i.clone();
    }

    public final String c() {
        return this.g;
    }

    private CLCSInputSize(String str, int i2, String str2) {
        this.g = str2;
    }

    static {
        List j2;
        CLCSInputSize[] b2 = b();
        i = b2;
        j = C8600drp.e(b2);
        b = new a(null);
        j2 = C8569dql.j("COMPACT", "STANDARD", "LARGE");
        h = new C9033hu("CLCSInputSize", j2);
    }

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C8627dsp c8627dsp) {
            this();
        }

        private a() {
        }

        public final C9033hu d() {
            return CLCSInputSize.h;
        }

        public final CLCSInputSize b(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSInputSize.a().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSInputSize) obj).c(), (Object) str)) {
                    break;
                }
            }
            CLCSInputSize cLCSInputSize = (CLCSInputSize) obj;
            return cLCSInputSize == null ? CLCSInputSize.e : cLCSInputSize;
        }
    }
}
