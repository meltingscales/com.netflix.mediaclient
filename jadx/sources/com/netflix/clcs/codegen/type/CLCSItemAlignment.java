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
public final class CLCSItemAlignment {
    public static final e e;
    private static final /* synthetic */ CLCSItemAlignment[] f;
    private static final /* synthetic */ InterfaceC8598drn g;
    private static final C9033hu h;
    private final String k;
    public static final CLCSItemAlignment a = new CLCSItemAlignment("START", 0, "START");
    public static final CLCSItemAlignment b = new CLCSItemAlignment("CENTER", 1, "CENTER");
    public static final CLCSItemAlignment d = new CLCSItemAlignment("END", 2, "END");
    public static final CLCSItemAlignment j = new CLCSItemAlignment("STRETCH", 3, "STRETCH");
    public static final CLCSItemAlignment c = new CLCSItemAlignment("BASELINE", 4, "BASELINE");
    public static final CLCSItemAlignment i = new CLCSItemAlignment("UNKNOWN__", 5, "UNKNOWN__");

    public static InterfaceC8598drn<CLCSItemAlignment> c() {
        return g;
    }

    private static final /* synthetic */ CLCSItemAlignment[] d() {
        return new CLCSItemAlignment[]{a, b, d, j, c, i};
    }

    public static CLCSItemAlignment valueOf(String str) {
        return (CLCSItemAlignment) Enum.valueOf(CLCSItemAlignment.class, str);
    }

    public static CLCSItemAlignment[] values() {
        return (CLCSItemAlignment[]) f.clone();
    }

    public final String e() {
        return this.k;
    }

    private CLCSItemAlignment(String str, int i2, String str2) {
        this.k = str2;
    }

    static {
        List j2;
        CLCSItemAlignment[] d2 = d();
        f = d2;
        g = C8600drp.e(d2);
        e = new e(null);
        j2 = C8569dql.j("START", "CENTER", "END", "STRETCH", "BASELINE");
        h = new C9033hu("CLCSItemAlignment", j2);
    }

    /* loaded from: classes2.dex */
    public static final class e {
        public /* synthetic */ e(C8627dsp c8627dsp) {
            this();
        }

        private e() {
        }

        public final C9033hu a() {
            return CLCSItemAlignment.h;
        }

        public final CLCSItemAlignment a(String str) {
            Object obj;
            C8632dsu.c((Object) str, "");
            Iterator<E> it = CLCSItemAlignment.c().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C8632dsu.c((Object) ((CLCSItemAlignment) obj).e(), (Object) str)) {
                    break;
                }
            }
            CLCSItemAlignment cLCSItemAlignment = (CLCSItemAlignment) obj;
            return cLCSItemAlignment == null ? CLCSItemAlignment.i : cLCSItemAlignment;
        }
    }
}
